package com.example.demo.repository;


import com.example.demo.model.CountryView;
import com.example.demo.model.DemographicsData;
import com.example.demo.model.RegionView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DemographicsRepository extends JpaRepository<DemographicsData, Integer> {

    // Country Views

    List<CountryView> findDistinctCountryViewsByLocTypeID(Integer locTypeID);

    List<DemographicsData> findDistinctCountryViewsByLocTypeIDAndLocID(Integer locTypeID, Integer locID);

    List<DemographicsData> findDistinctCountryViewsByLocTypeIDAndIso2Code(Integer locTypeID, String iso2code);

    List<DemographicsData> findDistinctCountryViewsByLocTypeIDAndIso3Code(Integer locTypeID, String iso3code);

    List<DemographicsData> findDistinctCountryViewsByLocTypeIDAndLocIDAndTime(Integer locTypeID, Integer locID, Integer time);

    List<DemographicsData> findDistinctCountryViewsByLocTypeIDAndIso2CodeAndTime(Integer locTypeID, String iso2code, Integer time);

    List<DemographicsData> findDistinctCountryViewsByLocTypeIDAndIso3CodeAndTime(Integer locTypeID, String iso3code, Integer time);

    // Region Views

    List<RegionView> findDistinctRegionViewsByLocTypeID(Integer locTypeID);

    List<DemographicsData> findDistinctRegionViewsByLocTypeIDAndLocID(Integer locTypeID, Integer locID);

    List<DemographicsData> findDistinctRegionViewsByLocTypeIDAndLocIDAndTime(Integer locTypeID, Integer locID, Integer time);

    // World Views

    List<DemographicsData> findDistinctWorldViewsByLocTypeID(Integer locTypeID);

    List<DemographicsData> findDistinctWorldViewsByLocTypeIDAndTime(Integer locTypeID, Integer time);
}