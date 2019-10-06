package com.SpringBoot.Docker.flairstech.util;



public class CodeNotFoundException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CodeNotFoundException(String code) {
        super("INVALID_COUNTRY_CODE " + code);
    }

}