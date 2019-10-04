package com.SpringBoot.Docker.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SpringBoot.Docker.service.Country_Service;
import com.SpringBoot.Docker.util.Country;



public class Country_Controller {
	@Autowired
	private Country_Service country_Service;
	
	@RequestMapping("/{countryname}")
	
	 public List<Country> getallcourse(@PathVariable String countryname)
	 {

		// return coursesservice.getallcourses(topicid);
		return null;
			 
	 }

}
