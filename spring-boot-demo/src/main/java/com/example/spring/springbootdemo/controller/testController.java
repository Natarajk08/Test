package com.example.spring.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.spring.springbootdemo.domain.student;

@RestController
public class testController {
	
	welcomehghggugv
	welcome
	dfghjk
	testedr
	123456
	
	@RequestMapping(value="/test", method= RequestMethod.GET)
	public String getData() {
		String uri ="http://localhost:7001/tfs/catalog-mgmt/v1";
		 student st = new student();
		 st.setId(1);
		 st.setName("xx");
		 UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(uri).queryParam("id", st.getId()).queryParam("mobile", st.getMobile() != null ? st.getMobile() : "null" );
		 builder.buildAndExpand(builder).toUri();
		
		return "welcome to spring boot";
	}

}
