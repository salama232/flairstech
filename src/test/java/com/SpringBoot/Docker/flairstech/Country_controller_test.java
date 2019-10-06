package com.SpringBoot.Docker.flairstech;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class Country_controller_test {

    // bind the above RANDOM_PORT
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getCountry1() throws Exception {
    	String code = "BHR";
        ResponseEntity<String> response = restTemplate.getForEntity(
			new URL("http://localhost:" + port + "/country/"+code).toString(), String.class);
        assertEquals("[[\"Bahrain\",\"Asia\",617000,73.0,\"Arabic\"]]", response.getBody());

    }
    
    @Test
    public void getcoun() throws Exception {
    	String code = "BHR";
        ResponseEntity<String> response = restTemplate.getForEntity(
			new URL("http://localhost:" + port + "/"+code).toString(), String.class);
        assertEquals("{\"life_expectancy\":\"73\",\"code\":\"BHR\",\"continent\":\"Asia\",\"population\":617000,\"country_Language\":null,\"name\":\"Bahrain\"}", response.getBody());
    }

}
