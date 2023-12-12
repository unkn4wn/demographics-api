package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"locID", "location","iso3Code", "iso2Code"})
public interface CountryView {
    Integer getLocID();
    String getIso2Code();
    String getIso3Code();
    String getLocation();
}
