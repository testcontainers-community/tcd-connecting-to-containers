package com.testcontainers.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.devtools.restart.RestartScope;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;

@TestConfiguration(proxyBeanMethods = false)
public class TestProductServiceApplication {

    @Bean
    @ServiceConnection
    @RestartScope
    PostgreSQLContainer<?> postgresContainer() {
        return new PostgreSQLContainer<>(
                DockerImageName.parse("postgres:16-alpine"))
                .withUsername("postgres")
                .withPassword("postgres")
                .withDatabaseName("products")
                .withReuse(true)
                .withLabel("com.testcontainers.desktop.service", "products-postgres");
    }

    public static void main(String[] args) {
        SpringApplication.from(ProductServiceApplication::main).with(TestProductServiceApplication.class).run(args);
    }

}
