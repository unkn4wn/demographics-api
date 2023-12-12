package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"locID", "location"})
public interface RegionView {
    Integer getLocID();
    String getLocation();
}
