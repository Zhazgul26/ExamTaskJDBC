package peaksoft.service.Impl;

import peaksoft.entity.President;
import peaksoft.service.PresidentService;

import java.util.List;

public class PresidentServiceImpl implements PresidentService {

    private final PresidentService presidentService = new PresidentServiceImpl();
    @Override
    public President savePresident(President president) {
        return presidentService.savePresident(president);
    }

    @Override
    public List<President> getAllCountry() {
        return presidentService.getAllCountry();
    }

    @Override
    public void updateCountry(Long id, President course) {
presidentService.updateCountry(id, course);
    }

    @Override
    public void deleteCountryById(Long id) {
presidentService.deleteCountryById(id);
    }
}
