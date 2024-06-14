package ru.itpark.userservice.application.driver.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.itpark.userservice.application.user.response.UserResponse;
import ru.itpark.userservice.domain.DriverLicense.DriverLicense;
import ru.itpark.userservice.domain.user.User;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DriverResponse {
    private Long id;

    private Float sumWay;

    private Integer experienceMonth;

    private Float rating;

    private DriverLicense driverLicense;

    private UserResponse owner;
}
