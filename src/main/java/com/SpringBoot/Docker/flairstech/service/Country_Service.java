package com.SpringBoot.Docker.flairstech.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.Docker.flairstech.Repository.Country_Repository;
import com.SpringBoot.Docker.flairstech.util.Country;


@Service
public class Country_Service {
	@PersistenceUnit
    private EntityManagerFactory emf;
    @Autowired
	Country_Repository  country_Repository;    
    public List<Country> findAll(){
		 List<Country> countries=new ArrayList<>();
		 country_Repository.findAll().forEach(countries::add);
		 return countries;
	 }
    public Optional<Country> getcountry(String code) {
    	 return country_Repository.findByCountryLanguageCode(code);
    	
    }
    
    @SuppressWarnings("unchecked")
	public List<Country> getCountries(String code)
    {   EntityManager em = emf.createEntityManager();
		List<Country> country = new ArrayList<Country>();
    	country.addAll(em.createNativeQuery("select name,continent,population,life_expectancy,language from country_language"
    			+ " inner join country on country.code=country_language.country_code  and country.code='"+code+"' and country_language.is_official=true").getResultList());
    	
    	
    	return country;
    }
    
    public Optional<Country> getcou(String id) {
    	// TODO Auto-generated method stub
    	 return country_Repository.findById(id);
    	
    }
}
