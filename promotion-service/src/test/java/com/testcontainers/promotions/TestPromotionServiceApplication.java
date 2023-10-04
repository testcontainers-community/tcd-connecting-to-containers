package com.testcontainers.promotions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.devtools.restart.RestartScope;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;

@TestConfiguration(proxyBeanMethods = false)
public class TestPromotionServiceApplication {

    @Bean
    @ServiceConnection
    @RestartScope
    PostgreSQLContainer<?> postgresContainer() {
        return new PostgreSQLContainer<>(
                DockerImageName.parse("postgres:16-alpine"))
                .withUsername("postgres")
                .withPassword("postgres")
                .withDatabaseName("promotions")
                .withReuse(true)
                .withLabel("com.testcontainers.desktop.service", "promotions-postgres");
    }

    public static void main(String[] args) {
        SpringApplication.from(PromotionServiceApplication::main)
                .with(TestPromotionServiceApplication.class).run(args);
    }

}
