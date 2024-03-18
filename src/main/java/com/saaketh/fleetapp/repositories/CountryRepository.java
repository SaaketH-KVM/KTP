package com.saaketh.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saaketh.fleetapp.models.Country;

@Repository

public interface CountryRepository extends JpaRepository<Country, Integer> {

}
