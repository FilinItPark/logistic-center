package ru.itpark.userservice.application.driver;

import org.mapstruct.Mapper;
import ru.itpark.userservice.application.driver.response.DriverResponse;
import ru.itpark.userservice.domain.driver.Driver;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DriverMapper {
    List<DriverResponse> toDto(List<Driver> driversdriver);
}
