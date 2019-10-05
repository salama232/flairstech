package com.SpringBoot.Docker.flairstech.Repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.Docker.flairstech.util.Country_Language;

@Repository
public interface Country_Language_Repository extends CrudRepository<Country_Language, String> {


}


