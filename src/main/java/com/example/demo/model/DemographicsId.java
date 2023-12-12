package com.example.demo.model;

import java.io.Serializable;

public class DemographicsId implements Serializable {
    private Integer locID;
    private Integer time;


    public DemographicsId() {
    }
    public DemographicsId(Integer locID, Integer time) {
        this.locID = locID;
        this.time = time;
    }

    public Integer getLocID() {
        return locID;
    }

    public void setLocID(Integer locID) {
        this.locID = locID;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }
}
