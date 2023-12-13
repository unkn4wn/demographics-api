# World Demographics API Documentation

Welcome to the Demographics API documentation. This API provides access to demographic data for countries, regions, and the world. Below, you will find detailed information on available endpoints, parameters, and examples of how to use them.

## Endpoints

##### Get Countries with ISO3/ISO2 Codes and locId
- **Endpoint:** `/countries`
- **Summary:** Get Countries with ISO3/ISO2 Codes and locId
- **Description:** Retrieve a list of countries along with their ISO3/ISO2 codes and locId.
- **Parameters:** no parameter required

##### Get Demographics Data for a Specific Country in a Specific Year
- **Endpoint:** `/countries/{countrycode}`
- **Summary:** Get Demographics Data for a Specific Country in a Specific Year
- **Description:** Retrieve demographics data for a specific country in a specific year using its ISO3/ISO2 codes or locId and a year.
- **Parameters:**
  - (required): `countrycode` -&gt; ISO3/ISO2 code or locId
  - (optional): `time` -&gt; The specific year for which demographics data is requested.
    - Example: 2023
    - Schema: Integer, Minimum: 1950, Maximum: 2100

##### Get Regions with locId Codes
- **Endpoint:** `/regions`
- **Summary:** Get Regions with locId Codes
- **Description:** Retrieve a list of regions along with their locId.
- **Parameters:** No parameters required

##### Get Demographics Data for a Specific Region in a Specific Year
- **Endpoint:** `/regions/{regioncode}`
- **Summary:** Get Demographics Data for a Specific Region and Year
- **Description:** Retrieve demographics data for a specific region in a specific year using its locId and a year.
- **Parameters:**
  - (required): `regioncode` -&gt; locId of the region
    - Example: 908
  - (optional): `time` -&gt; The specific year for which demographics data is requested.
    - Example: 2023
    - Schema: Integer, Minimum: 1950, Maximum: 2100

##### Get Demographics Data for the World in a Specific Year
- **Endpoint:** `/world`
- **Summary:** Get World Demographics Data for a Specific Year
- **Description:** Retrieve demographics data for the entire world in a specific year.
- **Parameters:**
  - (optional): `time` -&gt; The specific year for which demographics data is requested.
    - Example: 2023
    - Schema: Integer, Minimum: 1950, Maximum: 2100


## Demographic Indicators

###### `locID`
- **Name:** Location ID
- **Description:** A unique identifier for the location.

###### `notes`
- **Name:** Notes
- **Description:** Additional notes or information related to the data for the location.

###### `iso3Code`
- **Name:** ISO 3-Code
- **Description:** The ISO 3166-1 alpha-3 code for the location.

###### `iso2Code`
- **Name:** ISO 2-Code
- **Description:** The ISO 3166-1 alpha-2 code for the location.

###### `sdmxCode`
- **Name:** SDMX Code
- **Description:** The SDMX code for the location.

###### `locTypeID`
- **Name:** Location Type ID
- **Description:** The ID indicating the type of location.

###### `locTypeName`
- **Name:** Location Type Name
- **Description:** The name of the location type.

###### `parentID`
- **Name:** Parent ID
- **Description:** The ID of the parent location, if applicable.

###### `location`
- **Name:** Location
- **Description:** The name of the location.

###### `varID`
- **Name:** Variant ID
- **Description:** The ID indicating the demographic variant.

###### `variant`
- **Name:** Variant
- **Description:** The name of the demographic variant.

###### `time`
- **Name:** Time
- **Description:** The specific year for which the demographic data is provided.

###### `popDensity`
- **Name:** Population Density, as of 1 July
- **Description:** Indicates the number of people living per square kilometer of land area in the specified location as of 1 July. Expressed as persons per square kilometer.

###### `popSexRatio`
- **Name:** Population Sex Ratio, as of 1 July
- **Description:** Provides the sex ratio in the specified location as of 1 July, expressed as the number of males per 100 females in the population.

###### `medianAgePop`
- **Name:** Median Age, as of 1 July
- **Description:** Represents the median age of the population in the specified location as of 1 July, indicating that half of the population is older and half is younger than this age. Measured in years.

###### `natChange`
- **Name:** Natural Change, Births minus Deaths
- **Description:** Indicates the natural change in population in the specified location due to births and deaths, measured in thousands.

###### `natChangeRT`
- **Name:** Rate of Natural Change
- **Description:** Represents the rate at which the population of the specified location is changing due to births and deaths per 1,000 people.

###### `popChange`
- **Name:** Population Change
- **Description:** Represents the overall change in the population of the specified location, measured in thousands.

###### `popGrowthRate`
- **Name:** Population Growth Rate
- **Description:** Indicates the rate at which the population of the specified location is growing as a percentage of its current population.

###### `doublingTime`
- **Name:** Population Annual Doubling Time
- **Description:** Represents the number of years it would take for the population of the specified location to double at its current growth rate.

###### `births`
- **Name:** Births
- **Description:** Represents the total number of live births that occurred in the specified location, measured in thousands.

###### `births1519`
- **Name:** Births by women aged 15 to 19
- **Description:** Indicates the number of live births to women in the age group 15 to 19 in the specified location, measured in thousands.

###### `cbr`
- **Name:** Crude Birth Rate
- **Description:** Represents the crude birth rate, which is the number of live births per 1,000 population in the specified location.

###### `tfr`
- **Name:** Total Fertility Rate
- **Description:** Indicates the total fertility rate, representing the average number of live births a woman would have during her lifetime in the specified location.

###### `nrr`
- **Name:** Net Reproduction Rate
- **Description:** Represents the net reproduction rate, indicating the number of surviving daughters per woman in the specified location.

###### `mac`
- **Name:** Mean Age Childbearing
- **Description:** Indicates the mean age at which women in the specified location give birth to children, measured in years.

###### `srb`
- **Name:** Sex Ratio at Birth
- **Description:** Provides the sex ratio at birth, expressed as the number of males per 100 female births in the specified location.

###### `deaths`
- **Name:** Total Deaths
- **Description:** Represents the total number of deaths that occurred in the specified location, measured in thousands.

###### `deathsMale`
- **Name:** Male Deaths
- **Description:** Indicates the number of male deaths in the specified location, measured in thousands.

###### `deathsFemale`
- **Name:** Female Deaths
- **Description:** Indicates the number of female deaths in the specified location, measured in thousands.

###### `cdr`
- **Name:** Crude Death Rate
- **Description:** Represents the crude death rate, which is the number of deaths per 1,000 population in the specified location.

###### `lEx`
- **Name:** Life Expectancy at Birth, both sexes
- **Description:** Represents the life expectancy at birth for both sexes in the specified location, measured in years.

###### `lExMale`
- **Name:** Male Life Expectancy at Birth
- **Description:** Indicates the life expectancy at birth for males in the specified location, measured in years.

###### `lExFemale`
- **Name:** Female Life Expectancy at Birth
- **Description:** Indicates the life expectancy at birth for females in the specified location, measured in years.

###### `le15`
- **Name:** Life Expectancy at Age 15, both sexes
- **Description:** Represents the life expectancy at age 15 for both sexes in the specified location, measured in years.

###### `le15Male`
- **Name:** Male Life Expectancy at Age 15
- **Description:** Indicates the life expectancy at age 15 for males in the specified location, measured in years.

###### `le15Female`
- **Name:** Female Life Expectancy at Age 15
- **Description:** Indicates the life expectancy at age 15 for females in the specified location, measured in years.

###### `le65`
- **Name:** Life Expectancy at Age 65, both sexes
- **Description:** Represents the life expectancy at age 65 for both sexes in the specified location, measured in years.

###### `le65Male`
- **Name:** Male Life Expectancy at Age 65
- **Description:** Indicates the life expectancy at age 65 for males in the specified location, measured in years.

###### `le65Female`
- **Name:** Female Life Expectancy at Age 65
- **Description:** Indicates the life expectancy at age 65 for females in the specified location, measured in years.

###### `le80`
- **Name:** Life Expectancy at Age 80, both sexes
- **Description:** Represents the life expectancy at age 80 for both sexes in the specified location, measured in years.

###### `le80Male`
- **Name:** Male Life Expectancy at Age 80
- **Description:** Indicates the life expectancy at age 80 for males in the specified location, measured in years.

###### `le80Female`
- **Name:** Female Life Expectancy at Age 80
- **Description:** Indicates the life expectancy at age 80 for females in the specified location, measured in years.

###### `infantDeaths`
- **Name:** Infant Deaths, under age 1
- **Description:** Represents the total number of infant deaths (deaths under age 1) in the specified location, measured in thousands.

###### `imr`
- **Name:** Infant Mortality Rate
- **Description:** Indicates the infant mortality rate, which is the number of infant deaths per 1,000 live births in the specified location.

###### `lbSurvivingAge1`
- **Name:** Live births Surviving to Age 1
- **Description:** Represents the total number of live births that survive to age 1 in the specified location, measured in thousands.

###### `under5Deaths`
- **Name:** Deaths under age 5
- **Description:** Indicates the total number of deaths of children under the age of 5 in the specified location, measured in thousands.

###### `q5`
- **Name:** Under-five Mortality Rate
- **Description:** Represents the under-five mortality rate, which is the number of deaths under age 5 per 1,000 live births in the specified location.

###### `q0040`
- **Name:** Mortality before Age 40, both sexes
- **Description:** Represents the mortality rate before age 40 for both sexes in the specified location, measured as the number of deaths under age 40 per 1,000 live births.

###### `q0040Male`
- **Name:** Male mortality before Age 40
- **Description:** Indicates the mortality rate before age 40 for males in the specified location, measured as the number of deaths under age 40 per 1,000 male live births.

###### `q0040Female`
- **Name:** Female mortality before Age 40
- **Description:** Indicates the mortality rate before age 40 for females in the specified location, measured as the number of deaths under age 40 per 1,000 female live births.

###### `q0060`
- **Name:** Mortality between Age 15 and 60, both sexes
- **Description:** Represents the mortality rate between age 15 and 60 for both sexes in the specified location, measured as the number of deaths under age 60 per 1,000 alive at age 15.

###### `q0060Male`
- **Name:** Male mortality between Age 15 and 60
- **Description:** Indicates the mortality rate between age 15 and 60 for males in the specified location, measured as the number of deaths under age 60 per 1,000 males alive at age 15.

###### `q0060Female`
- **Name:** Female mortality between Age 15 and 60
- **Description:** Indicates the mortality rate between age 15 and 60 for females in the specified location, measured as the number of deaths under age 60 per 1,000 females alive at age 15.

###### `q1550`
- **Name:** Mortality between Age 15 and 50, both sexes
- **Description:** Represents the mortality rate between age 15 and 50 for both sexes in the specified location, measured as the number of deaths under age 50 per 1,000 alive at age 15.

###### `q1550Male`
- **Name:** Male mortality between Age 15 and 50
- **Description:** Indicates the mortality rate between age 15 and 50 for males in the specified location, measured as the number of deaths under age 50 per 1,000 males alive at age 15.

###### `q1550Female`
- **Name:** Female mortality between Age 15 and 50
- **Description:** Indicates the mortality rate between age 15 and 50 for females in the specified location, measured as the number of deaths under age 50 per 1,000 females alive at age 15.

###### `q1560`
- **Name:** Mortality between Age 15 and 60, both sexes
- **Description:** Represents the mortality rate between age 15 and 60 for both sexes in the specified location, measured as the number of deaths under age 60 per 1,000 alive at age 15.

###### `q1560Male`
- **Name:** Male mortality between Age 15 and 60
- **Description:** Indicates the mortality rate between age 15 and 60 for males in the specified location, measured as the number of deaths under age 60 per 1,000 males alive at age 15.

###### `q1560Female`
- **Name:** Female mortality between Age 15 and 60
- **Description:** Indicates the mortality rate between age 15 and 60 for females in the specified location, measured as the number of deaths under age 60 per 1,000 females alive at age 15.

###### `netMigrations`
- **Name:** Net Number of Migrants
- **Description:** Represents the net number of migrants, indicating the difference between the number of immigrants and emigrants in the specified location, measured in thousands.

###### `cnmr`
- **Name:** Net Migration Rate
- **Description:** Represents the net migration rate, which is the net number of migrants per 1,000 population in the specified location.

