package com.wonit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

@DataJdbcTest
class UserRepositoryTest {

    @Container
    GenericContainer postgres = new GenericContainer(DockerImageName.parse("postgresql"))
            .withExposedPorts(5432);

    @Autowired
    UserRepository repository;

    @Test
    void name() {
        Optional<User> byId = repository.findById(1L);
    }
}