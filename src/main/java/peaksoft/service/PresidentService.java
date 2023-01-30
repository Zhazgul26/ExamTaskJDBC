package peaksoft.service;

import peaksoft.entity.President;

import java.util.List;

public interface PresidentService {
    President savePresident(President president);


    List<President> getAllCountry();

    void updateCountry(Long id, President course);

    void deleteCountryById(Long id);

}
