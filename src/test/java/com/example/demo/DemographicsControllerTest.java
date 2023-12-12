package com.example.demo;

import com.example.demo.exception.RegionNotFoundException;
import com.example.demo.model.DemographicsData;
import com.example.demo.repository.DemographicsRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class DemographicsControllerTest {
    @Autowired
    MockMvc mockMvc;
    @Autowired
    ObjectMapper mapper;

    @MockBean
    DemographicsRepository demographicsRepository;

    @Test
    public void testGetAllCountryRecordsSuccess() throws Exception {
        // Mock-Daten erstellen
        DemographicsData record1 = new DemographicsData(276, "", "DEU", "DE", 276, 4, "Country/Area", 926, "Germany", 2, "Medium", 1950, 71077.882, 70964.095, 32442.329, 38521.766, 203.5922, 84.2182, 33.4188, 400.749, 5.622, -227.574, -0.321, 0.0, 1156.316, 83.849, 16.222, 2.0895, 0.9345, 27.81, 107.3, 755.567, 397.028, 358.539, 10.6, 66.7975, 64.1338, 69.2685, 56.8594, 54.6058, 58.8312, 13.0974, 12.2333, 13.8584, 5.2935, 5.0932, 5.4441, 66.633, 57.6126, 1104.682, 75.502, 65.8884, 106.2173, 124.6529, 89.488, 222.6089, 270.3704, 181.8154, 73.7736, 91.5401, 59.306, 162.5962, 206.8157, 127.0085, -628.332, -8.815);

        List<DemographicsData> demographicsDataList = List.of(record1);

        ObjectMapper objectMapper = new ObjectMapper();
        String expectedJson = objectMapper.writeValueAsString(demographicsDataList);

        // Mock-Verhalten festlegen
        when(demographicsRepository.findDistinctCountryViewsByLocTypeIDAndLocIDAndTime(4,276, 1950)).thenReturn(demographicsDataList);


        // Test durchführen
        mockMvc.perform(MockMvcRequestBuilders
                        .get("/countries/276/1950")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json(expectedJson));
    }

    @Test
    public void testGetAllCountryRecordsFail() throws Exception {

        // Mock-Verhalten festlegen
        when(demographicsRepository.findDistinctCountryViewsByLocTypeIDAndLocIDAndTime(4,279, 1950)).thenReturn(Collections.emptyList());


        // Test durchführen
        mockMvc.perform(MockMvcRequestBuilders
                        .get("/countries/279/1950")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is5xxServerError());
    }

    @Test
    public void testGetAllRegionRecordsSuccess() throws Exception {
        // Mock-Daten erstellen
        DemographicsData record1 = new DemographicsData(1834, "", "", "", 202, 12, "SDG region", 1828, "Sub-Saharan Africa", 2, "Medium", 1987, 449462.086, 456194.222, 225894.847, 230299.376,20.8643, 98.0875, 16.0942, 13190.939, 28.918, 13464.272, 2.952, 23.4806, 20821.866, 3419.065, 45.647, 6.5061, 2.3058, 29.656, 103.7, 7630.927, 4037.385, 3593.542, 16.729, 48.8325, 46.928, 50.7877, 47.4296, 45.6783, 49.1909, 11.9243, 11.3925, 12.4037, 5.3373, 5.0633, 5.5518, 2276.366, 110.1063, 19243.165, 3762.014, 186.4324, 349.9936, 371.2749, 328.4974, 517.018, 552.7848, 480.4839, 249.3048, 276.7248, 222.0759, 374.8682, 414.1526, 335.6472, 273.344, 0.599 );

                List<DemographicsData> demographicsDataList = List.of(record1);

        ObjectMapper objectMapper = new ObjectMapper();
        String expectedJson = objectMapper.writeValueAsString(demographicsDataList);

        // Mock-Verhalten festlegen
        when(demographicsRepository.findDistinctRegionViewsByLocTypeIDAndLocIDAndTime(12,1834, 1987)).thenReturn(demographicsDataList);


        // Test durchführen
        mockMvc.perform(MockMvcRequestBuilders
                        .get("/regions/1834/1987")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json(expectedJson));
    }

    @Test
    public void testGetAllRegionRecordsFail() throws Exception {

        // Mock-Verhalten festlegen
        when(demographicsRepository.findDistinctRegionViewsByLocTypeIDAndLocIDAndTime(12,1848, 1987)).thenReturn(Collections.emptyList());


        // Test durchführen
        mockMvc.perform(MockMvcRequestBuilders
                        .get("/regions/1848/1987")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is5xxServerError());
    }

    @Test
    public void testGetAllWorldRecordsSuccess() throws Exception {
        // Mock-Daten erstellen
        DemographicsData record1 = new DemographicsData(900,"", "", "", 1, 1, "World", 0, "World", 2, "Medium", 2002, 6271638.043, 6312407.36, 3173877.429, 3138529.931,48.4068, 101.1262, 25.6795, 81539.012, 12.917, 81538.634, 1.292, 53.6492, 134020.459, 17903.854, 21.231, 2.6722, 1.1592, 27.368, 107.4, 52481.447, 28000.845, 24480.602, 8.314, 67.1373, 64.7096, 69.6363, 58.0745, 55.5743, 60.6348, 15.6749, 14.1938, 16.974, 7.2988, 6.4652, 7.8311, 6717.427, 50.14, 128918.717, 9426.121, 70.5963, 134.189, 143.7983, 124.1745, 246.9995, 281.5213, 210.9571, 97.8975, 116.2636, 78.8532, 178.1477, 214.1085, 140.7457, 0.0, 0.0);
        List<DemographicsData> demographicsDataList = List.of(record1);

        ObjectMapper objectMapper = new ObjectMapper();
        String expectedJson = objectMapper.writeValueAsString(demographicsDataList);

        // Mock-Verhalten festlegen
        when(demographicsRepository.findDistinctWorldViewsByLocTypeIDAndTime(1,2002)).thenReturn(demographicsDataList);


        // Test durchführen
        mockMvc.perform(MockMvcRequestBuilders
                        .get("/world/2002")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json(expectedJson));
    }

    @Test
    public void testGetAllWorldRecordsFail() throws Exception {

        // Mock-Verhalten festlegen
        when(demographicsRepository.findDistinctWorldViewsByLocTypeIDAndTime(1,2138)).thenReturn(Collections.emptyList());


        // Test durchführen
        mockMvc.perform(MockMvcRequestBuilders
                        .get("/regions/1848/1987")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is5xxServerError());
    }


}
