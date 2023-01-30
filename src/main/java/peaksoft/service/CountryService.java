package peaksoft.service;

import peaksoft.entity.Country;

import java.util.List;

public interface CountryService {
    void saveCountry(Country country);


    List<Country> getAllCountry();

    void updateCountry(Long id, Country course);

    void deleteCountryById(Long id);
}
