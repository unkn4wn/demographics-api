package com.example.demo.controller;

import com.example.demo.exception.CountryNotFoundException;
import com.example.demo.exception.RegionNotFoundException;
import com.example.demo.exception.YearNotFoundException;
import com.example.demo.model.CountryView;
import com.example.demo.model.DemographicsData;
import com.example.demo.model.RegionView;
import com.example.demo.service.DemographicsService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@OpenAPIDefinition(
        info = @Info(
                title = "Demographics API",
                version = "v1"
        ),
        servers = {
                @Server(
                        url = "https://demographics-19dcfaf35b9f.herokuapp.com"
                ),
        }
)

@CrossOrigin
@RestController
public class DemographicsController {

    private final DemographicsService demographicsService;
    
    public DemographicsController(DemographicsService demographicsService) {
        this.demographicsService = demographicsService;
    }

    @GetMapping("/countries")
    @Operation(
            summary = "Get Countries with ISO Codes and locId",
            description = "Retrieve a list of countries along with their ISO codes and locId.",
            tags = {"countries"}
    )
    public List<CountryView> getCountries() {
        return demographicsService.getCountries();
    }

    @Parameter(
            name = "countrycode",
            description = "The ISO code or locId of the country.",
            required = true
    )
    @GetMapping("/countries/{countrycode}")
    @Operation(
            summary = "Get Demographics Data for a Specific Country",
            description = "Retrieve demographics data for a specific country using its ISO codes or locId.",
            tags = {"countries"}
    )
    public List<DemographicsData> getDemographicsSpecificCountry(
            @PathVariable(name = "countrycode") String countryIso) throws CountryNotFoundException {
        return demographicsService.getDemographicsSpecificCountry(countryIso);
    }

    @GetMapping("/countries/{countrycode}/{year}")
    @Operation(
            summary = "Get Demographics Data for a Specific Country in a Specific Year",
            description = "Retrieve demographics data for a specific country in a specific year using its ISO codes or locId and a year.",
            tags = {"countries"}
    )
    @Parameter(
            name = "countrycode",
            description = "The ISO code or locId of the country.",
            required = true
    )
    @Parameter(
            name = "year",
            description = "The specific year for which demographics data is requested.",
            example = "2023",
            required = true,
            schema = @Schema(type = "integer", minimum = "1950", maximum = "2100")
    )
    public List<DemographicsData> getDemographicsSpecificCountryYear(
            @PathVariable(name = "countrycode") String countryIso,
            @PathVariable(name = "year") int year) throws CountryNotFoundException, YearNotFoundException {
        return demographicsService.getDemographicsSpecificCountryYear(countryIso, year);
    }

    @CrossOrigin
    @GetMapping("/world")
    @Operation(
            summary = "Get World Demographics Data",
            description = "Retrieve demographics data for the entire world.",
            tags = {"world"}
    )
    public List<DemographicsData> getDemographicsWorld() {
        return demographicsService.getDemographicsWorld();
    }

    @GetMapping("/world/{year}")
    @Operation(
            summary = "Get World Demographics Data for a Specific Year",
            description = "Retrieve demographics data for the entire world in a specific year.",
            tags = {"world"}
    )
    @Parameter(
            name = "year",
            description = "The specific year for which demographics data is requested.",
            example = "2023",
            required = true,
            schema = @Schema(type = "integer", minimum = "1950", maximum = "2100")
    )
    public List<DemographicsData> getDemographicsWorldYear(
            @PathVariable(name = "year") int year) throws YearNotFoundException {
        return demographicsService.getDemographicsWorldYear(year);
    }

    @GetMapping("/regions")
    @Operation(
            summary = "Get Regions with locId Codes",
            description = "Retrieve a list of regions along with their locId.",
            method = "region list",
            tags = {"regions"}
    )
    public List<RegionView> getRegions() {
        return demographicsService.getRegions();
    }

    @GetMapping("/regions/{regioncode}")
    @Operation(
            summary = "Get Demographics Data for a Specific Region",
            description = "Retrieve demographics data for a specific region using its locId.",
            tags = {"regions"}
    )
    @Parameter(
            name = "regioncode",
            description = "locId of the region",
            example = "908",
            required = true,
            schema = @Schema(type = "integer")
    )
    public List<DemographicsData> getDemographicsSpecificRegion(
            @PathVariable(name = "regioncode") int locId) throws RegionNotFoundException {
        return demographicsService.getDemographicsSpecificRegion(locId);
    }

    @GetMapping("/regions/{regioncode}/{year}")
    @Operation(
            summary = "Get Demographics Data for a Specific Region and Year",
            description = "Retrieve demographics data for a specific region in a specific year using its locId and a year.",
            tags = {"regions"}
    )
    @Parameter(
            name = "regioncode",
            description = "locId of the region",
            example = "908",
            required = true,
            schema = @Schema(type = "integer")
    )
    @Parameter(
            name = "year",
            description = "The specific year for which demographics data is requested.",
            example = "2023",
            required = true,
            schema = @Schema(type = "integer", minimum = "1950", maximum = "2100")
    )
    public List<DemographicsData> getDemographicsSpecificRegionYear(
            @PathVariable(name = "regioncode") int locId,
            @PathVariable(name = "year") int year) throws YearNotFoundException, RegionNotFoundException {
        return demographicsService.getDemographicsSpecificRegionYear(locId, year);
    }
}