package com.example.manageremp.ultis;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

@Configuration
public class HibernateUltiCfg {
    @Autowired
    private EntityManager entityManager;

    @Bean
    public SessionFactory getSessionFactory() {
        if (entityManager.unwrap(SessionFactory.class) == null) {
            throw new NullPointerException("factory is not a hibernate factory");
        }
        return entityManager.unwrap(SessionFactory.class);
    }
}
