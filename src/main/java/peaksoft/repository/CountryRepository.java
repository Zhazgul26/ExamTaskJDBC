package peaksoft.repository;

import peaksoft.entity.Country;

import java.util.List;

public interface CountryRepository {


    void saveCountry(Country country);


    List<Country> getAllCountry();

    void updateCountry(Long id, Country course);

    void deleteCountryById(Long id);


}
