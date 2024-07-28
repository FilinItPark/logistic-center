package ru.itpark.userservice.application.driverLicense;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import ru.itpark.userservice.application.driver.response.SearchDriverQueryResponse;
import ru.itpark.userservice.application.driverLicense.command.CreateDriverLicenseCommand;
import ru.itpark.userservice.domain.DriverLicense.DriverLicense;
import ru.itpark.userservice.domain.driver.Driver;
import ru.itpark.userservice.presentation.web.driverLicense.contracts.GetDriverLicenceQueryResponse;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DriverLicenseMapper {
    DriverLicense toEntity(CreateDriverLicenseCommand command);

    DriverLicense toEntity(GetDriverLicenceQueryResponse getDriverLicenceQueryResponse);

    GetDriverLicenceQueryResponse toDto(DriverLicense driverLicense);

    List<GetDriverLicenceQueryResponse> toListDto(List<DriverLicense> entities);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    DriverLicense partialUpdate(GetDriverLicenceQueryResponse getDriverLicenceQueryResponse, @MappingTarget DriverLicense driverLicense);
}
