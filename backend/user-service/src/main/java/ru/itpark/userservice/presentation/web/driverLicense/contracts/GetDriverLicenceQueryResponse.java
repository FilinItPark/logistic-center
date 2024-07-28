package ru.itpark.userservice.presentation.web.driverLicense.contracts;

import java.io.Serializable;
import java.util.UUID;

public record GetDriverLicenceQueryResponse(UUID id, String name) implements Serializable {
}