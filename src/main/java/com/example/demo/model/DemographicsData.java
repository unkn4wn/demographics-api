package com.example.demo.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "demographics")
public class DemographicsData {


    @Id
    @Column(name = "LocID")
    @Schema(example = "840")
    private Integer locID;

    @Column(name = "Notes")
    @Schema(example = "31")
    private String notes;

    @Column(name = "ISO3_code")
    @Schema(example = "USA")
    private String iso3Code;

    @Column(name = "ISO2_code")
    @Schema(example = "US")
    private String iso2Code;

    @Column(name = "SDMX_code")
    @Schema(example = "840")
    private Integer sdmxCode;

    @Column(name = "LocTypeID")

    @Schema(example = "4")
    private Integer locTypeID;

    @Column(name = "LocTypeName")
    @Schema(example = "Country/Area")
    private String locTypeName;

    @Column(name = "ParentID")
    @Schema(example = "918")
    private Integer parentID;

    @Column(name = "Location")
    @Schema(example = "United States of America")
    private String location;

    @Column(name = "VarID")
    @Schema(example = "2")
    private Integer varID;

    @Column(name = "Variant")
    @Schema(example = "Medium")
    private String variant;

    @Column(name = "Time")
    @Schema(example = "2023")
    private Integer time;

    @Column(name = "PopDensity")
    @Schema(example = "37.1679")
    private Double popDensity;

    @Column(name = "PopSexRatio")
    @Schema(example = "98.0164")
    private Double popSexRatio;

    @Column(name = "MedianAgePop")
    @Schema(example = "38.0989")
    private Double medianAgePop;

    @Column(name = "NatChange")
    @Schema(example = "832.959")
    private Double natChange;

    @Column(name = "NatChangeRT")
    @Schema(example = "2.453")
    private Double natChangeRT;

    @Column(name = "PopChange")
    @Schema(example = "1832.657")
    private Double popChange;

    @Column(name = "PopGrowthRate")
    @Schema(example = "0.539")
    private Double popGrowthRate;

    @Column(name = "DoublingTime")
    @Schema(example = "128.5987")
    private Double doublingTime;

    @Column(name = "Births")
    @Schema(example = "3745.361")
    private Double births;

    @Column(name = "Births1519")
    @Schema(example = "157.297")
    private Double births1519;

    @Column(name = "CBR")
    @Schema(example = "11.032")
    private Double cbr;

    @Column(name = "TFR")
    @Schema(example = "1.6623")
    private Double tfr;

    @Column(name = "NRR")
    @Schema(example = "0.8003")
    private Double nrr;

    @Column(name = "MAC")
    @Schema(example = "29.817")
    private Double mac;

    @Column(name = "SRB")
    @Schema(example = "104.9")
    private Double srb;

    @Column(name = "Deaths")
    @Schema(example = "2912.402")
    private Double deaths;

    @Column(name = "DeathsMale")
    @Schema(example = "1537.175")
    private Double deathsMale;

    @Column(name = "DeathsFemale")
    @Schema(example = "1375.226")
    private Double deathsFemale;

    @Column(name = "CDR")
    @Schema(example = "8.579")
    private Double cdr;

    @Column(name = "LEx")
    @Schema(example = "79.7384")
    private Double lEx;

    @Column(name = "lExMale")
    @Schema(example = "77.2714")
    private Double lExMale;

    @Column(name = "lExFemale")
    @Schema(example = "82.2333")
    private Double lExFemale;

    @Column(name = "LE15")
    @Schema(example = "65.2854")
    private Double le15;

    @Column(name = "LE15Male")
    @Schema(example = "62.8563")
    private Double le15Male;

    @Column(name = "LE15Female")
    @Schema(example = "67.7361")
    private Double le15Female;

    @Column(name = "LE65")
    @Schema(example = "20.271")
    private Double le65;

    @Column(name = "LE65Male")
    @Schema(example = "18.9103")
    private Double le65Male;

    @Column(name = "LE65Female")
    @Schema(example = "21.4998")
    private Double le65Female;

    @Column(name = "LE80")
    @Schema(example = "9.8934")
    private Double le80;

    @Column(name = "LE80Male")
    @Schema(example = "9.1248")
    private Double le80Male;

    @Column(name = "LE80Female")
    @Schema(example = "10.4902")
    private Double le80Female;

    @Column(name = "InfantDeaths")
    @Schema(example = "18.346")
    private Double infantDeaths;

    @Column(name = "IMR")
    @Schema(example = "4.8988")
    private Double imr;

    @Column(name = "lbSurvivingAge1")
    @Schema(example = "3729.572")
    private Double lbSurvivingAge1;

    @Column(name = "Under5Deaths")
    @Schema(example = "21.893")
    private Double under5Deaths;

    @Column(name = "Q5")
    @Schema(example = "5.8421")
    private Double q5;

    @Column(name = "Q0040")
    @Schema(example = "33.9092")
    private Double q0040;

    @Column(name = "Q0040Male")
    @Schema(example = "44.2837")
    private Double q0040Male;

    @Column(name = "Q0040Female")
    @Schema(example = "23.0976")
    private Double q0040Female;

    @Column(name = "Q0060")
    @Schema(example = "110.1701")
    private Double q0060;

    @Column(name = "Q0060Male")
    @Schema(example = "137.2823")
    private Double q0060Male;

    @Column(name = "Q0060Female")
    @Schema(example = "82.1789")
    private Double q0060Female;

    @Column(name = "Q1550")
    @Schema(example = "51.0169")
    private Double q1550;

    @Column(name = "Q1550Male")
    @Schema(example = "66.1509")
    private Double q1550Male;

    @Column(name = "Q1550Female")
    @Schema(example = "35.331")
    private Double q1550Female;

    @Column(name = "Q1560")
    @Schema(example = "103.8952")
    private Double q1560;

    @Column(name = "Q1560Male")
    @Schema(example = "130.5566")
    private Double q1560Male;

    @Column(name = "Q1560Female")
    @Schema(example = "76.4217")
    private Double q1560Female;

    @Column(name = "NetMigrations")
    @Schema(example = "999.7")
    private Double netMigrations;

    @Column(name = "CNMR")
    @Schema(example = "2.945")
    private Double cnmr;

    @Column(name = "TPopulation1Jan")
    @Schema(example = "339080.235")
    private Double tpopulation1Jan;

    @Column(name = "TPopulation1July")
    @Schema(example = "339996.563")
    private Double tpopulation1July;

    @Column(name = "TPopulationMale1July")
    @Schema(example = "168295.333")
    private Double tpopulationMale1July;

    @Column(name = "TPopulationFemale1July")
    @Schema(example = "171701.23")
    private Double tpopulationFemale1July;

    public DemographicsData(Integer locID, String notes, String iso3Code, String iso2Code, Integer sdmxCode, Integer locTypeID, String locTypeName, Integer parentID, String location, Integer varID, String variant, Integer time, Double tpopulation1Jan, Double tpopulation1July, Double tpopulationMale1July, Double tpopulationFemale1July, Double popDensity, Double popSexRatio, Double medianAgePop, Double natChange, Double natChangeRT, Double popChange, Double popGrowthRate, Double doublingTime, Double births, Double births1519, Double cbr, Double tfr, Double nrr, Double mac, Double srb, Double deaths, Double deathsMale, Double deathsFemale, Double cdr, Double lEx, Double lExMale, Double lExFemale, Double le15, Double le15Male, Double le15Female, Double le65, Double le65Male, Double le65Female, Double le80, Double le80Male, Double le80Female, Double infantDeaths, Double imr, Double lbSurvivingAge1, Double under5Deaths, Double q5, Double q0040, Double q0040Male, Double q0040Female, Double q0060, Double q0060Male, Double q0060Female, Double q1550, Double q1550Male, Double q1550Female, Double q1560, Double q1560Male, Double q1560Female, Double netMigrations, Double cnmr) {
        this.locID = locID;
        this.notes = notes;
        this.iso3Code = iso3Code;
        this.iso2Code = iso2Code;
        this.sdmxCode = sdmxCode;
        this.locTypeID = locTypeID;
        this.locTypeName = locTypeName;
        this.parentID = parentID;
        this.location = location;
        this.varID = varID;
        this.variant = variant;
        this.time = time;
        this.tpopulation1Jan = tpopulation1Jan;
        this.tpopulation1July = tpopulation1July;
        this.tpopulationMale1July = tpopulationMale1July;
        this.tpopulationFemale1July = tpopulationFemale1July;
        this.popDensity = popDensity;
        this.popSexRatio = popSexRatio;
        this.medianAgePop = medianAgePop;
        this.natChange = natChange;
        this.natChangeRT = natChangeRT;
        this.popChange = popChange;
        this.popGrowthRate = popGrowthRate;
        this.doublingTime = doublingTime;
        this.births = births;
        this.births1519 = births1519;
        this.cbr = cbr;
        this.tfr = tfr;
        this.nrr = nrr;
        this.mac = mac;
        this.srb = srb;
        this.deaths = deaths;
        this.deathsMale = deathsMale;
        this.deathsFemale = deathsFemale;
        this.cdr = cdr;
        this.lEx = lEx;
        this.lExMale = lExMale;
        this.lExFemale = lExFemale;
        this.le15 = le15;
        this.le15Male = le15Male;
        this.le15Female = le15Female;
        this.le65 = le65;
        this.le65Male = le65Male;
        this.le65Female = le65Female;
        this.le80 = le80;
        this.le80Male = le80Male;
        this.le80Female = le80Female;
        this.infantDeaths = infantDeaths;
        this.imr = imr;
        this.lbSurvivingAge1 = lbSurvivingAge1;
        this.under5Deaths = under5Deaths;
        this.q5 = q5;
        this.q0040 = q0040;
        this.q0040Male = q0040Male;
        this.q0040Female = q0040Female;
        this.q0060 = q0060;
        this.q0060Male = q0060Male;
        this.q0060Female = q0060Female;
        this.q1550 = q1550;
        this.q1550Male = q1550Male;
        this.q1550Female = q1550Female;
        this.q1560 = q1560;
        this.q1560Male = q1560Male;
        this.q1560Female = q1560Female;
        this.netMigrations = netMigrations;
        this.cnmr = cnmr;
    }

    public DemographicsData() {

    }


    public Integer getLocID() {
        return locID;
    }

    public void setLocID(Integer locID) {
        this.locID = locID;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getIso3Code() {
        return iso3Code;
    }

    public void setIso3Code(String iso3Code) {
        this.iso3Code = iso3Code;
    }

    public String getIso2Code() {
        return iso2Code;
    }

    public void setIso2Code(String iso2Code) {
        this.iso2Code = iso2Code;
    }

    public Integer getSdmxCode() {
        return sdmxCode;
    }

    public void setSdmxCode(Integer sdmxCode) {
        this.sdmxCode = sdmxCode;
    }

    public Integer getLocTypeID() {
        return locTypeID;
    }

    public void setLocTypeID(Integer locTypeID) {
        this.locTypeID = locTypeID;
    }

    public String getLocTypeName() {
        return locTypeName;
    }

    public void setLocTypeName(String locTypeName) {
        this.locTypeName = locTypeName;
    }

    public Integer getParentID() {
        return parentID;
    }

    public void setParentID(Integer parentID) {
        this.parentID = parentID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getVarID() {
        return varID;
    }

    public void setVarID(Integer varID) {
        this.varID = varID;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Double getTpopulation1Jan() {
        return tpopulation1Jan;
    }

    public void settpopulation1Jan(Double tpopulation1Jan) {
        this.tpopulation1Jan = tpopulation1Jan;
    }

    public Double getTpopulation1July() {
        return tpopulation1July;
    }

    public void settpopulation1July(Double tpopulation1July) {
        this.tpopulation1July = tpopulation1July;
    }

    public Double getTpopulationMale1July() {
        return tpopulationMale1July;
    }

    public void settpopulationMale1July(Double tpopulationMale1July) {
        this.tpopulationMale1July = tpopulationMale1July;
    }

    public Double getTpopulationFemale1July() {
        return tpopulationFemale1July;
    }

    public void settpopulationFemale1July(Double tpopulationFemale1July) {
        this.tpopulationFemale1July = tpopulationFemale1July;
    }

    public Double getPopDensity() {
        return popDensity;
    }

    public void setPopDensity(Double popDensity) {
        this.popDensity = popDensity;
    }

    public Double getPopSexRatio() {
        return popSexRatio;
    }

    public void setPopSexRatio(Double popSexRatio) {
        this.popSexRatio = popSexRatio;
    }

    public Double getMedianAgePop() {
        return medianAgePop;
    }

    public void setMedianAgePop(Double medianAgePop) {
        this.medianAgePop = medianAgePop;
    }

    public Double getNatChange() {
        return natChange;
    }

    public void setNatChange(Double natChange) {
        this.natChange = natChange;
    }

    public Double getNatChangeRT() {
        return natChangeRT;
    }

    public void setNatChangeRT(Double natChangeRT) {
        this.natChangeRT = natChangeRT;
    }

    public Double getPopChange() {
        return popChange;
    }

    public void setPopChange(Double popChange) {
        this.popChange = popChange;
    }

    public Double getPopGrowthRate() {
        return popGrowthRate;
    }

    public void setPopGrowthRate(Double popGrowthRate) {
        this.popGrowthRate = popGrowthRate;
    }

    public Double getDoublingTime() {
        return doublingTime;
    }

    public void setDoublingTime(Double doublingTime) {
        this.doublingTime = doublingTime;
    }

    public Double getBirths() {
        return births;
    }

    public void setBirths(Double births) {
        this.births = births;
    }

    public Double getBirths1519() {
        return births1519;
    }

    public void setBirths1519(Double births1519) {
        this.births1519 = births1519;
    }

    public Double getCbr() {
        return cbr;
    }

    public void setCbr(Double cbr) {
        this.cbr = cbr;
    }

    public Double getTfr() {
        return tfr;
    }

    public void setTfr(Double tfr) {
        this.tfr = tfr;
    }

    public Double getNrr() {
        return nrr;
    }

    public void setNrr(Double nrr) {
        this.nrr = nrr;
    }

    public Double getMac() {
        return mac;
    }

    public void setMac(Double mac) {
        this.mac = mac;
    }

    public Double getSrb() {
        return srb;
    }

    public void setSrb(Double srb) {
        this.srb = srb;
    }

    public Double getDeaths() {
        return deaths;
    }

    public void setDeaths(Double deaths) {
        this.deaths = deaths;
    }

    public Double getDeathsMale() {
        return deathsMale;
    }

    public void setDeathsMale(Double deathsMale) {
        this.deathsMale = deathsMale;
    }

    public Double getDeathsFemale() {
        return deathsFemale;
    }

    public void setDeathsFemale(Double deathsFemale) {
        this.deathsFemale = deathsFemale;
    }

    public Double getCdr() {
        return cdr;
    }

    public void setCdr(Double cdr) {
        this.cdr = cdr;
    }

    public Double getlEx() {
        return lEx;
    }

    public void setlEx(Double lEx) {
        this.lEx = lEx;
    }

    public Double getlExMale() {
        return lExMale;
    }

    public void setlExMale(Double lExMale) {
        this.lExMale = lExMale;
    }

    public Double getlExFemale() {
        return lExFemale;
    }

    public void setlExFemale(Double lExFemale) {
        this.lExFemale = lExFemale;
    }

    public Double getLe15() {
        return le15;
    }

    public void setLe15(Double le15) {
        this.le15 = le15;
    }

    public Double getLe15Male() {
        return le15Male;
    }

    public void setLe15Male(Double le15Male) {
        this.le15Male = le15Male;
    }

    public Double getLe15Female() {
        return le15Female;
    }

    public void setLe15Female(Double le15Female) {
        this.le15Female = le15Female;
    }

    public Double getLe65() {
        return le65;
    }

    public void setLe65(Double le65) {
        this.le65 = le65;
    }

    public Double getLe65Male() {
        return le65Male;
    }

    public void setLe65Male(Double le65Male) {
        this.le65Male = le65Male;
    }

    public Double getLe65Female() {
        return le65Female;
    }

    public void setLe65Female(Double le65Female) {
        this.le65Female = le65Female;
    }

    public Double getLe80() {
        return le80;
    }

    public void setLe80(Double le80) {
        this.le80 = le80;
    }

    public Double getLe80Male() {
        return le80Male;
    }

    public void setLe80Male(Double le80Male) {
        this.le80Male = le80Male;
    }

    public Double getLe80Female() {
        return le80Female;
    }

    public void setLe80Female(Double le80Female) {
        this.le80Female = le80Female;
    }

    public Double getInfantDeaths() {
        return infantDeaths;
    }

    public void setInfantDeaths(Double infantDeaths) {
        this.infantDeaths = infantDeaths;
    }

    public Double getImr() {
        return imr;
    }

    public void setImr(Double imr) {
        this.imr = imr;
    }

    public Double getLbSurvivingAge1() {
        return lbSurvivingAge1;
    }

    public void setLbSurvivingAge1(Double lbSurvivingAge1) {
        this.lbSurvivingAge1 = lbSurvivingAge1;
    }

    public Double getUnder5Deaths() {
        return under5Deaths;
    }

    public void setUnder5Deaths(Double under5Deaths) {
        this.under5Deaths = under5Deaths;
    }

    public Double getQ5() {
        return q5;
    }

    public void setQ5(Double q5) {
        this.q5 = q5;
    }

    public Double getQ0040() {
        return q0040;
    }

    public void setQ0040(Double q0040) {
        this.q0040 = q0040;
    }

    public Double getQ0040Male() {
        return q0040Male;
    }

    public void setQ0040Male(Double q0040Male) {
        this.q0040Male = q0040Male;
    }

    public Double getQ0040Female() {
        return q0040Female;
    }

    public void setQ0040Female(Double q0040Female) {
        this.q0040Female = q0040Female;
    }

    public Double getQ0060() {
        return q0060;
    }

    public void setQ0060(Double q0060) {
        this.q0060 = q0060;
    }

    public Double getQ0060Male() {
        return q0060Male;
    }

    public void setQ0060Male(Double q0060Male) {
        this.q0060Male = q0060Male;
    }

    public Double getQ0060Female() {
        return q0060Female;
    }

    public void setQ0060Female(Double q0060Female) {
        this.q0060Female = q0060Female;
    }

    public Double getQ1550() {
        return q1550;
    }

    public void setQ1550(Double q1550) {
        this.q1550 = q1550;
    }

    public Double getQ1550Male() {
        return q1550Male;
    }

    public void setQ1550Male(Double q1550Male) {
        this.q1550Male = q1550Male;
    }

    public Double getQ1550Female() {
        return q1550Female;
    }

    public void setQ1550Female(Double q1550Female) {
        this.q1550Female = q1550Female;
    }

    public Double getQ1560() {
        return q1560;
    }

    public void setQ1560(Double q1560) {
        this.q1560 = q1560;
    }

    public Double getQ1560Male() {
        return q1560Male;
    }

    public void setQ1560Male(Double q1560Male) {
        this.q1560Male = q1560Male;
    }

    public Double getQ1560Female() {
        return q1560Female;
    }

    public void setQ1560Female(Double q1560Female) {
        this.q1560Female = q1560Female;
    }

    public Double getNetMigrations() {
        return netMigrations;
    }

    public void setNetMigrations(Double netMigrations) {
        this.netMigrations = netMigrations;
    }

    public Double getCnmr() {
        return cnmr;
    }

    public void setCnmr(Double cnmr) {
        this.cnmr = cnmr;
    }

}
