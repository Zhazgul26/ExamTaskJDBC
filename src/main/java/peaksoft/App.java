package peaksoft;

import peaksoft.config.HibernateConfig;
import peaksoft.enams.Gender;
import peaksoft.entity.Country;
import peaksoft.entity.President;
import peaksoft.service.CountryService;
import peaksoft.service.Impl.CountryServiceImpl;
import peaksoft.service.Impl.PresidentServiceImpl;
import peaksoft.service.PresidentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println("Hello World!");
        HibernateConfig.getEntityManager();
    }
}
