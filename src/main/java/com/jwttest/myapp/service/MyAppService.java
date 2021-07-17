package com.jwttest.myapp.service;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwttest.myapp.model.db.City;
import com.jwttest.myapp.model.repository.CityRepository;

import antlr.collections.List;

@Service
public class MyAppService {
	

	@Autowired
	private CityRepository cityRepository;

	public MyAppService() {
		
	}
	
	public void addCert(String type, String user, String[] states, String[]  chain) {

	
	
		City city = City.builder()
						.id(UUID.randomUUID())
						.name(user)
						.nameType(user)
						.states(states)
						.chains(chain)
						.build();
		cityRepository.save(city);
		
		
	}

}
