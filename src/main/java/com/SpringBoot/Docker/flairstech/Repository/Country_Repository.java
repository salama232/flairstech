package com.SpringBoot.Docker.flairstech.Repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.Docker.flairstech.util.Country;

@Repository

	public interface Country_Repository extends CrudRepository<Country, String> {
	   public List<Country> findAllByCode(String code);
	   public List<Country> findAllByCountryLanguage(String countryLanguage);
	   public List<Country> getAllByCode(String code);
	   public List<Country> findAll();


	}

