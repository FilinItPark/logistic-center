package ru.itpark.userservice.application.driver.command;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.itpark.userservice.domain.DriverLicense.DriverLicense;
import ru.itpark.userservice.domain.driver.Driver;
import ru.itpark.userservice.domain.user.User;
import ru.itpark.userservice.infrastructure.repositories.driver.DriverRepository;
import ru.itpark.userservice.presentation.web.driver.contracts.query.CreateDriverCommand;

@AllArgsConstructor
@Slf4j
@Service
public class CommandDriverService {
    private final DriverRepository repository;

    public void save(CreateDriverCommand createDriverCommand, User owner, DriverLicense driverLicense) {
        Driver entity = Driver.builder()
                .driverLicense(driverLicense)
                .owner(owner)
                .sumWay(createDriverCommand.sumWay())
                .rating(createDriverCommand.rating())
                .experienceMonth(createDriverCommand.experienceMonth())
                .build();

        repository.save(entity);
    }
}
