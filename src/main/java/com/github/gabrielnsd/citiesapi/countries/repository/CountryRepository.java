package com.github.gabrielnsd.citiesapi.countries.repository;

import com.github.gabrielnsd.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {
}
