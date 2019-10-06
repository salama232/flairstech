package com.SpringBoot.Docker.flairstech.util;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Country {
    @Id
    private String code;
    private String Name;
    private String Continent;
    private int Population;
    private String life_expectancy;
    @ManyToOne
    private Country_Language countryLanguage;
    
    public Country()
    {
    	
    }
	public Country(String name, String continent, int population, String life_expectancy, String code,String country_code) {
		super();
		Name = name;
		Continent = continent;
		Population = population;
		this.life_expectancy = life_expectancy;
		this.code = code;
		countryLanguage=new Country_Language();
		countryLanguage.setCountry_code(country_code);
	}

	public Country_Language getCountry_Language() {
		return countryLanguage;
	}

	public void setCountry_Language(Country_Language country_Language) {
		this.countryLanguage = country_Language;
	}

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
	

	public String getLife_expectancy() {
		return life_expectancy;
	}

	public void setLife_expectancy(String life_expectancy) {
		this.life_expectancy = life_expectancy;
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
    
}
