package com.SpringBoot.Docker.flairstech.util;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country_Language {
	@Id
	private String country_code;
	private String language;
	private boolean is_official;
	
	
    
    public Country_Language()
    {
    	
    }
	public Country_Language(String country_code, String language, boolean is_official) {
		super();
		this.country_code = country_code;
		this.language = language;
		this.is_official = is_official;
	}



	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public boolean isIs_official() {
		return is_official;
	}

	public void setIs_official(boolean is_official) {
		this.is_official = is_official;
	}
    
    
}
