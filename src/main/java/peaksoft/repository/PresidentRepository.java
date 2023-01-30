package peaksoft.repository;

import peaksoft.entity.Country;
import peaksoft.entity.President;

import java.util.List;

public interface PresidentRepository {
    President savePresident(President president);


    List<President> getAllCountry();

    void updateCountry(Long id, President course);

    void deleteCountryById(Long id);

}
