package com.jwttest.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jwttest.myapp.service.MyAppService;

@RestController
@RequestMapping("/home")
public class MyAppController {

	@Autowired
	MyAppService service;

	@GetMapping("/cert")
	public @ResponseBody ResponseEntity < String > getCert() {
        return new ResponseEntity < String > ("Response from GET", HttpStatus.OK);
    }

	
	@PostMapping("/cert/add")
	public @ResponseBody ResponseEntity < String > addCert() {
		
		
		String[] states = {"1"};
		String[] chain = {"2"};
		service.addCert("1", "2", states, chain);
        return new ResponseEntity < String > ("Response from POST", HttpStatus.OK);
    }

}
