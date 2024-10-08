package ru.netology.springboots_rest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.springboots_rest.repository.UserRepository;

import java.util.List;

import static ru.netology.springboots_rest.enums.Authorities.*;

@Configuration
public class ApplicationConfig {

    @Bean
    public UserRepository userRepositoryStub() {
        final var repo = new UserRepository();
        repo.save("user", "1234", List.of(READ));
        repo.save("manager", "1234", List.of(READ, WRITE));
        repo.save("admin", "1234", List.of(READ, WRITE, DELETE));
        return repo;
    }

}