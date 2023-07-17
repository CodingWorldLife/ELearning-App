package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("country")
public class Country {
@Value("${country.president}")	
private String president;
@Value("${country.pm}")
private String PM;
@Value("${country.fm}")
private String FM;
@Value("${country.um}")
private String UM;
@Value("${country.khasdar}")
private Integer khasadar;
@Override
public String toString() {
	return "Country [president=" + president + ", PM=" + PM + ", FM=" + FM + ", UM=" + UM + ", khasadar=" + khasadar
			+ "]";
}
	
	
	
	
}
