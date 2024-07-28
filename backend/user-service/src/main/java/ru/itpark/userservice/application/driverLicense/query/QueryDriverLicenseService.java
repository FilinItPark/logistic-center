package ru.itpark.userservice.application.driverLicense.query;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.itpark.userservice.application.driverLicense.DriverLicenseMapper;
import ru.itpark.userservice.domain.DriverLicense.DriverLicense;
import ru.itpark.userservice.infrastructure.repositories.driverLicense.DriverLicenseRepository;
import ru.itpark.userservice.presentation.web.driverLicense.contracts.GetDriverLicenceQueryResponse;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class QueryDriverLicenseService {
    private final DriverLicenseRepository repository;
    private final DriverLicenseMapper mapper;

    public List<GetDriverLicenceQueryResponse> get() {
        return mapper.toListDto(repository.findAll());
    }

    public DriverLicense get(UUID id) {
        DriverLicense entity = repository.findById(id).orElseThrow(EntityNotFoundException::new);

        return entity;
    }
}
