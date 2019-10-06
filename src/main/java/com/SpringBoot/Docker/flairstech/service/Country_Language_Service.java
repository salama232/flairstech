package com.SpringBoot.Docker.flairstech.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.Docker.flairstech.Repository.Country_Language_Repository;
import com.SpringBoot.Docker.flairstech.util.Country_Language;

@Service
public class Country_Language_Service {
	 @Autowired
	 Country_Language_Repository country_Language_Repository;
	 public List<Country_Language> findAll(){
		 //return courses;
		 List<Country_Language> countries=new ArrayList<>();
		 country_Language_Repository.findAll().forEach(countries::add);
		 return countries; 
	 }
    public List<Country_Language>  getcountry(String id) {
    	 //TODO Auto-generated method stub
    	Iterable<Country_Language> countries=new ArrayList<>();
    	List<Country_Language> countr=new ArrayList<>();
    	countries=country_Language_Repository.findAll();
    	for (Country_Language  s :countries)
    	{ 
		 if (s.getCountry_code().equals(id) && s.isIs_official())
			{countr.add(s);
		     return countr;
			}
    	}
		 return countr;
    	 
    	
    }
  
}
