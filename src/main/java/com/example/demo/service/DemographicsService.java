package com.example.demo.service;


import com.example.demo.repository.DemographicsRepository;
import com.example.demo.exception.CountryNotFoundException;
import com.example.demo.exception.RegionNotFoundException;
import com.example.demo.exception.YearNotFoundException;
import com.example.demo.model.CountryView;
import com.example.demo.model.DemographicsData;
import com.example.demo.model.RegionView;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CacheConfig(cacheNames = "demographicsCache")
public class DemographicsService {
    private final DemographicsRepository demographicsRepository;

    public DemographicsService(DemographicsRepository demographicsRepository) {
        this.demographicsRepository = demographicsRepository;
    }

    @PostConstruct
    public void initializeCache() {
        // Load and cache the database data during application startup
        loadAndCacheDbData();
    }

    public void loadAndCacheDbData() {

        demographicsRepository.findAll();
    }


    @Cacheable(cacheNames = "getCountries")
    public List<CountryView> getCountries() {
        return demographicsRepository.findDistinctCountryViewsByLocTypeID(4);
    }


    @Cacheable(cacheNames = "specificCountry")
    public List<DemographicsData> getDemographicsSpecificCountry(String query) throws CountryNotFoundException {
        if (isNumeric(query)) {
            List<DemographicsData> result = demographicsRepository.findDistinctCountryViewsByLocTypeIDAndLocID(4, Integer.parseInt(query));
            if (result.isEmpty()) {
                throw new CountryNotFoundException("No country found for query: " + query);
            }
            return result;
        } else if (query.length() == 3 && isAlpha(query)) {
            List<DemographicsData> result = demographicsRepository.findDistinctCountryViewsByLocTypeIDAndIso3Code(4, query.toUpperCase());
            if (result.isEmpty()) {
                throw new CountryNotFoundException("No country found for query: " + query);
            }
            return result;
        } else if (query.length() == 2 && isAlpha(query)) {
            List<DemographicsData> result = demographicsRepository.findDistinctCountryViewsByLocTypeIDAndIso2Code(4, query.toUpperCase());
            if (result.isEmpty()) {
                throw new CountryNotFoundException("No country found for query: " + query);
            }
            return result;
        }

        throw new CountryNotFoundException("No country found for query: " + query);
    }


    @Cacheable(cacheNames = "specificCountryYear")
    public List<DemographicsData> getDemographicsSpecificCountryYear(String query, int year) throws YearNotFoundException, CountryNotFoundException {
        if (year < 1950 || year > 2100) {
            throw new YearNotFoundException("Year should be between 1950 and 2100");
        }

        if (isNumeric(query)) {
            List<DemographicsData> result = demographicsRepository.findDistinctCountryViewsByLocTypeIDAndLocIDAndTime(4, Integer.parseInt(query), year);
            if (result.isEmpty()) {
                throw new CountryNotFoundException("No country found for query: " + query);
            }
            return result;
        } else if (query.length() == 3 && isAlpha(query)) {
            List<DemographicsData> result = demographicsRepository.findDistinctCountryViewsByLocTypeIDAndIso3CodeAndTime(4, query.toUpperCase(), year);
            if (result.isEmpty()) {
                throw new CountryNotFoundException("No country found for query: " + query);
            }
            return result;
        } else if (query.length() == 2 && isAlpha(query)) {
            List<DemographicsData> result = demographicsRepository.findDistinctCountryViewsByLocTypeIDAndIso2CodeAndTime(4, query.toUpperCase(), year);
            if (result.isEmpty()) {
                throw new CountryNotFoundException("No country found for query: " + query);
            }
            return result;
        }

        throw new CountryNotFoundException("No country found for query: " + query);
    }

    @Cacheable(cacheNames = "world")
    public List<DemographicsData> getDemographicsWorld() {
        return demographicsRepository.findDistinctWorldViewsByLocTypeID(1);
    }

    @Cacheable(cacheNames = "worldYear")
    public List<DemographicsData> getDemographicsWorldYear(int year) throws YearNotFoundException {
        if (year < 1950 || year > 2100) {
            throw new YearNotFoundException("Year should be between 1950 and 2100");
        }
        return demographicsRepository.findDistinctWorldViewsByLocTypeIDAndTime(1, year);
    }


    @Cacheable(cacheNames = "getRegions")
    public List<RegionView> getRegions() {
        return demographicsRepository.findDistinctRegionViewsByLocTypeID(12);
    }


    @Cacheable(cacheNames = "specificRegion")
    public List<DemographicsData> getDemographicsSpecificRegion(int locId) throws RegionNotFoundException {
        List<DemographicsData> result = demographicsRepository.findDistinctRegionViewsByLocTypeIDAndLocID(12, locId);

        if (result.isEmpty()) {
            throw new RegionNotFoundException("No region found for locId: " + locId);
        }

        return result;
    }


    @Cacheable(cacheNames = "specificRegionYear")
    public List<DemographicsData> getDemographicsSpecificRegionYear(int locId, int year) throws YearNotFoundException, RegionNotFoundException {
        if (year < 1950 || year > 2100) {
            throw new YearNotFoundException("Year should be between 1950 and 2100");
        }

        List<DemographicsData> result = demographicsRepository.findDistinctRegionViewsByLocTypeIDAndLocIDAndTime(12, locId, year);
        if (result.isEmpty()) {
            throw new RegionNotFoundException("No region found for locId: " + locId);
        }

        return result;
    }


    private boolean isNumeric(String str) {
        return str.matches("-?\\d+");
    }

    private boolean isAlpha(String str) {
        return str.chars().allMatch(Character::isLetter);
    }
}