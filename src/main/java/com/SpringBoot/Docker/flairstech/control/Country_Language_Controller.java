package com.SpringBoot.Docker.flairstech.control;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.Docker.flairstech.service.Country_Language_Service;
import com.SpringBoot.Docker.flairstech.util.Country_Language;


@RestController
public class Country_Language_Controller {
	@Autowired
	private Country_Language_Service country_Language_Service;
	@RequestMapping("/lang")
	 public List<Country_Language> getall()
	 {

		 return country_Language_Service.findAll();
			 
	 }
	
	 @RequestMapping("/lang/{id}")
	 public List<Country_Language> getcountry(@PathVariable String id) {
			return country_Language_Service.getcountry(id);
		}
	 
	


}
