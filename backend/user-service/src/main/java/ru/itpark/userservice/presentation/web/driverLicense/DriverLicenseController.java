package ru.itpark.userservice.presentation.web.driverLicense;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import ru.itpark.userservice.application.driverLicense.DriverLicenseFacade;
import ru.itpark.userservice.application.driverLicense.command.CreateDriverLicenseCommand;
import ru.itpark.userservice.presentation.web.driverLicense.contracts.GetDriverLicenceQueryResponse;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/driver-license")
@RequiredArgsConstructor
public class DriverLicenseController {
    private final DriverLicenseFacade facade;

    @PostMapping
    @PreAuthorize("isAuthenticated()")
    public void createDriverLicense(@RequestBody CreateDriverLicenseCommand command) {
        facade.create(command);
    }

    @GetMapping
//    @PreAuthorize("isAuthenticated()")
    public List<GetDriverLicenceQueryResponse> get() {
        return facade.get();
    }

    @GetMapping("{id}")
    @PreAuthorize("isAuthenticated()")
    public GetDriverLicenceQueryResponse get(@PathVariable UUID id) {
        return facade.get(id);
    }
}
