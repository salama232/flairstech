package com.SpringBoot.Docker.flairstech.control;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.Docker.flairstech.service.Country_Service;
import com.SpringBoot.Docker.flairstech.util.CodeNotFoundException;
import com.SpringBoot.Docker.flairstech.util.Country;
@RestController
public class Country_Controller {
	 
	@Autowired
	public Country_Service country_Service;
	@RequestMapping("/lang/country")
	 public List<Country> getall()
	 {

		 return country_Service.findAll();
			 
	 }
	
	@RequestMapping("/lang/{country_code}/country/{code}")
	 public Optional<Country> gelangs(@PathVariable String country_code) {
			
			 return country_Service.getcountry(country_code);
			
		}
	@RequestMapping("/country/{country_code}")
	 public Country gelang(@PathVariable String country_code) {
			
			 return country_Service.getcou(country_code.toUpperCase()).orElseThrow(() -> new CodeNotFoundException(country_code));
			
		}
	
	 @RequestMapping("/{country_code}")
	 public List<Country> gelang1(@PathVariable String country_code){
			 
			 return country_Service.getCountries(country_code.toUpperCase());
			
		}


}
