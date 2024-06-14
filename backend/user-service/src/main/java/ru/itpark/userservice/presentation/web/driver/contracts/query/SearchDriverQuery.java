package ru.itpark.userservice.presentation.web.driver.contracts.query;

import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class SearchDriverQuery {
    Long id;
    Float sumWay;
    Integer experienceMonth;
    Float rating;
    Long driverLicenseId;
    Long ownerId;
    Integer limit;
    Integer offset;
}