package com.xyz.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@PropertySource(value = { "classpath:application.properties" })
@EnableTransactionManagement
@EnableJpaRepositories("com.xyz.repository.*")
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class DBConfig {

@Value("${spring.datasource.driver-class-name}")
public String driver;

@Value("${spring.datasource.url}")
public String url;

@Value("${spring.datasource.username}")
public String username;

@Value("${spring.datasource.password}")
public String password;

@Value("${spring.jpa.properties.hibernate.dialect}")
public String dialect;

@Value("${spring.jpa.hibernate.ddl-auto}")
public String ddl;

@Bean(name = "dataSource")
public DriverManagerDataSource dataSource() {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName(driver);
    dataSource.setUrl(url);
    dataSource.setUsername(username);
    dataSource.setPassword(password);

    return dataSource;
}


@Bean(name = "sessionFactory")
public LocalSessionFactoryBean hibernateSessionFactory(DataSource dataSource) {
    LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
    sessionFactory.setDataSource(dataSource());
    sessionFactory.setPackagesToScan(new String[] { "com.xyz.model.*" });
    sessionFactory.setHibernateProperties(hibernateProperties());
    return sessionFactory;
}


@Bean
HibernateTransactionManager transactionManagerHib(SessionFactory sessionFactory) {
    HibernateTransactionManager transactionManager = new HibernateTransactionManager();
    transactionManager.setSessionFactory(sessionFactory);
    return transactionManager;
}

/*@Bean
@Qualifier(value = "entityManager")
public EntityManager entityManager(EntityManagerFactory entityManagerFactory) {
    return entityManagerFactory.createEntityManager();
}*/

@Bean
public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
    return new PersistenceExceptionTranslationPostProcessor();
}

@Bean
 public LocalContainerEntityManagerFactoryBean entityManagerFactory() {

HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
 vendorAdapter.setDatabase(Database.MYSQL);
 vendorAdapter.setGenerateDdl(true);

 LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
 em.setDataSource(dataSource());
 em.setPackagesToScan("com.xyz.model.*");
em.setJpaVendorAdapter(vendorAdapter);
 em.setJpaProperties(hibernateProperties());

 return em;
}

@Bean
 public PlatformTransactionManager transactionManager(EntityManagerFactory emf){
 JpaTransactionManager transactionManager = new JpaTransactionManager();
 transactionManager.setEntityManagerFactory(emf);

 return transactionManager;
}

Properties hibernateProperties() {
    return new Properties() {
        {
            setProperty("hibernate.hbm2ddl.auto", ddl);
            setProperty("hibernate.connection.useUnicode", "true");
            setProperty("spring.jpa.hibernate.ddl-auto", ddl);
            setProperty("hibernate.dialect", dialect);
            setProperty("spring.jpa.properties.hibernate.dialect", dialect);
            setProperty("hibernate.globally_quoted_identifiers", "true");
            setProperty("hibernate.connection.CharSet", "utf8mb4");
            setProperty("hibernate.connection.characterEncoding", "utf8");

        }
    };
}

}