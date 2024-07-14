package ru.itpark.userservice.infrastructure.repositories.driver;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itpark.userservice.domain.driver.Driver;

public interface DriverRepository extends JpaRepository<Driver, Long> {
}