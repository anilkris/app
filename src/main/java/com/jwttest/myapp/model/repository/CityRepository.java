package com.jwttest.myapp.model.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jwttest.myapp.model.db.City;

@Repository
public interface CityRepository extends JpaRepository<City, UUID>{

}
