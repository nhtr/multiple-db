package com.htcnp.multipledb.orcldb.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "orclEntityManagerFactory",
        transactionManagerRef = "orclTransactionManager",
        basePackages = {
                "com.htcnp.multipledb.orcldb"
        }
)
public class OrclConfig {

    @Bean(name = "orclDataSource")
    @ConfigurationProperties(prefix = "db3.datasource")
    public DataSource customerDataSource() {
        return DataSourceBuilder.create().type(HikariDataSource.class).build();
    }

    @Bean(name = "orclEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean
    entityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("orclDataSource") DataSource dataSource
    ) {
        return builder
                .dataSource(dataSource)
                .packages("com.htcnp.multipledb.orcldb.entity")
                .persistenceUnit("db3")
                .build();
    }

    @Bean(name = "orclTransactionManager")
    public PlatformTransactionManager customerTransactionManager(
            @Qualifier("orclEntityManagerFactory") EntityManagerFactory customerEntityManagerFactory
    ) {
        return new JpaTransactionManager(customerEntityManagerFactory);
    }
}
