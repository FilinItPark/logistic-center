package ru.itpark.userservice.application.driverLicense;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.itpark.userservice.application.driverLicense.command.CommandDriverLicenseService;
import ru.itpark.userservice.application.driverLicense.command.CreateDriverLicenseCommand;
import ru.itpark.userservice.application.driverLicense.query.QueryDriverLicenseService;
import ru.itpark.userservice.presentation.web.driverLicense.contracts.GetDriverLicenceQueryResponse;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class DriverLicenseFacade {
    private final CommandDriverLicenseService commandService;
    private final QueryDriverLicenseService queryService;
    private final DriverLicenseMapper mapper;


    public void create(CreateDriverLicenseCommand command) {
        commandService.create(command);
    }

    public List<GetDriverLicenceQueryResponse> get() {
        return queryService.get();
    }

    public GetDriverLicenceQueryResponse get(UUID id) {
        return mapper.toDto(queryService.get(id));
    }
}
