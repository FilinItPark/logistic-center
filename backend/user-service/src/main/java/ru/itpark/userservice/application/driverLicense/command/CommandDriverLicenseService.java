package ru.itpark.userservice.application.driverLicense.command;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.itpark.userservice.application.driverLicense.DriverLicenseMapper;
import ru.itpark.userservice.infrastructure.repositories.driverLicense.DriverLicenseRepository;

import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class CommandDriverLicenseService {
    private final DriverLicenseRepository driverLicenseRepository;
    private final DriverLicenseMapper mapper;

    public void create(CreateDriverLicenseCommand command) {
        var license = mapper.toEntity(command);

        license.setId(UUID.randomUUID());
        driverLicenseRepository.save(license);
    }
}
