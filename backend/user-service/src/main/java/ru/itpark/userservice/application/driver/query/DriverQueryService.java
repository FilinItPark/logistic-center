package ru.itpark.userservice.application.driver.query;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.itpark.userservice.domain.driver.Driver;
import ru.itpark.userservice.domain.user.User;
import ru.itpark.userservice.infrastructure.repositories.driver.custom.CustomDriverRepository;
import ru.itpark.userservice.presentation.web.driver.contracts.query.SearchDriverQuery;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class DriverQueryService {
    private final CustomDriverRepository repository;

    public List<Driver> search(SearchDriverQuery searchParams) {
        log.info("Searching drivers by params: " + searchParams);
        return repository.search(searchParams);
    }
}
