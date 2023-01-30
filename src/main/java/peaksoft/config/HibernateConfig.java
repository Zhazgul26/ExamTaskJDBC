package peaksoft.config;

import jakarta.persistence.EntityManager;
import org.hibernate.cfg.Configuration;
import peaksoft.entity.Country;
import peaksoft.entity.President;

import static org.hibernate.cfg.AvailableSettings.*;

public class HibernateConfig {
    public static EntityManager getEntityManager() {
        Configuration configuration = new Configuration();
        configuration.setProperty(DRIVER, "org.postgresql.Driver");
        configuration.setProperty(URL, "jdbc:postgresql://localhost:5432/ExamTask");
        configuration.setProperty(USER, "postgres");
        configuration.setProperty(PASS, "1234");
        configuration.setProperty(HBM2DDL_AUTO, "create");
        configuration.setProperty(DIALECT, "org.hibernate.dialect.PostgreSQL10Dialect");
        configuration.setProperty(SHOW_SQL, "true");
        configuration.addAnnotatedClass(Country.class);
        configuration.addAnnotatedClass(President.class);

        return configuration.buildSessionFactory().createEntityManager();
    }
}
