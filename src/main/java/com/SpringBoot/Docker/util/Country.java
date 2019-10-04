package com.SpringBoot.Docker.util;

public class Country {
    private String Name;
    private String Continent;
    private int Population;
    private int Life_Expectancy;
    private String Country_Language;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getContinent() {
		return Continent;
	}
	public void setContinent(String continent) {
		Continent = continent;
	}
	public int getPopulation() {
		return Population;
	}
	public void setPopulation(int population) {
		Population = population;
	}
	public int getLife_Expectancy() {
		return Life_Expectancy;
	}
	public void setLife_Expectancy(int life_Expectancy) {
		Life_Expectancy = life_Expectancy;
	}
	public String getCountry_Language() {
		return Country_Language;
	}
	public void setCountry_Language(String country_Language) {
		Country_Language = country_Language;
	}
    
}
