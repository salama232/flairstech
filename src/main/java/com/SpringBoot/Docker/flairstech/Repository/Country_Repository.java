package com.SpringBoot.Docker.flairstech.Repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import com.SpringBoot.Docker.flairstech.util.Country;



	public interface Country_Repository extends CrudRepository<Country, String> {
	   public Optional<Country> findByCountryLanguageCode(String countryLanguagecode);
	   public List<Country> findAll();


	}

