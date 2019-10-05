package com.SpringBoot.Docker.flairstech.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.Docker.flairstech.service.Country_Service;
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
	
	@RequestMapping("/{id}")
	 public List<Country> gelangs(@PathVariable String id) {
			
			 return country_Service.getcountry(id);
			
		}
	
	 @RequestMapping("lang/{code}/country/{id}")
	 public List<Country> gelang(@PathVariable String id) {
			
			 return country_Service.getCountries(id);
			
		}
	 
	@RequestMapping("/h")
	 public String hello()
	 {

		 return "hello";
			 
	 }


}
