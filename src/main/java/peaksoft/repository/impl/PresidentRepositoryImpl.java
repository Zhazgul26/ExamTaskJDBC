package peaksoft.repository.impl;

import jakarta.persistence.EntityManager;
import peaksoft.config.HibernateConfig;
import peaksoft.entity.Country;
import peaksoft.entity.President;
import peaksoft.repository.PresidentRepository;

import java.util.List;

public class PresidentRepositoryImpl implements PresidentRepository {

    private final EntityManager entityManager = HibernateConfig.getEntityManager();

    @Override
    public President savePresident(President president) {
        entityManager.getTransaction().begin();
        entityManager.persist(president);
        entityManager.getTransaction().commit();
        entityManager.close();
        return president;
    }

    @Override
    public List<President> getAllCountry() {
        entityManager.getTransaction().begin();
        List<President> presidents = entityManager.createQuery("select p from President p", President.class).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return presidents;
    }

    @Override
    public void updateCountry(Long id, President course) {
        entityManager.getTransaction().commit();
        President president = entityManager.find(President.class, id);
        president.setFirstName(president.getFirstName());
        president.setLastName(president.getLastName());
        president.setGender(president.getGender());
        president.setEmail(president.getEmail());
        entityManager.persist(president);
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println("Updated successfully!");

    }

    @Override
    public void deleteCountryById(Long id) {
        entityManager.getTransaction().begin();
        entityManager.find(Country.class, id);
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println("Deleted successfully!");

    }
}
