package ru.itpark.userservice.application.driver;

import org.mapstruct.Mapper;
import ru.itpark.userservice.application.driver.response.SearchDriverQueryResponse;
import ru.itpark.userservice.domain.driver.Driver;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DriverMapper {
    List<SearchDriverQueryResponse> toDto(List<Driver> driversdriver);
}
