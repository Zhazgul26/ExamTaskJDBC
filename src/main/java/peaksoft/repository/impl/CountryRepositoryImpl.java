package peaksoft.repository.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.internal.SessionFactoryImpl;
import peaksoft.config.HibernateConfig;
import peaksoft.entity.Country;
import peaksoft.repository.CountryRepository;

import java.util.List;

public class CountryRepositoryImpl implements CountryRepository {

    private final EntityManager entityManager = HibernateConfig.getEntityManager();

    @Override
    public void saveCountry(Country country) {
        entityManager.getTransaction().begin();
        entityManager.persist(country);
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println("Saved successfully!");

    }

    @Override
    public List<Country> getAllCountry() {
entityManager.getTransaction().begin();
List<Country> countries = entityManager.createQuery("select  c from  Country c", Country.class).getResultList();
entityManager.getTransaction().commit();
entityManager.close();


        return countries;
    }

    @Override
    public void updateCountry(Long id, Country course) {
        entityManager.getTransaction().begin();
        Country country = entityManager.find(Country.class, id);
        country.setArea(country.getArea());
        country.setPresident(country.getPresident());
        country.setPopulation(country.getPopulation());
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
        System.out.println("deleted Successfully!");

    }
}
