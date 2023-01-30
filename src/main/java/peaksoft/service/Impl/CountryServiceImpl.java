package peaksoft.service.Impl;

import peaksoft.entity.Country;
import peaksoft.repository.CountryRepository;

import peaksoft.repository.impl.CountryRepositoryImpl;
import peaksoft.service.CountryService;

import java.util.List;

public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository = new CountryRepositoryImpl();
    @Override
    public void saveCountry(Country country) {
       countryRepository.saveCountry(country);
    }

    @Override
    public List<Country> getAllCountry() {
        return countryRepository.getAllCountry();
    }

    @Override
    public void updateCountry(Long id, Country course) {
     countryRepository.updateCountry(id, course);
    }

    @Override
    public void deleteCountryById(Long id) {
       countryRepository.deleteCountryById(id);
    }
}
