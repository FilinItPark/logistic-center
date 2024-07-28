package ru.itpark.userservice.infrastructure.repositories.driverLicense;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.itpark.userservice.domain.DriverLicense.DriverLicense;

import java.util.UUID;

@Repository
public interface DriverLicenseRepository extends JpaRepository<DriverLicense, UUID> {
}
