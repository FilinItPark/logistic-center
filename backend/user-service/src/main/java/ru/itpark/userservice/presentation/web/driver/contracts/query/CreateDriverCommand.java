package ru.itpark.userservice.presentation.web.driver.contracts.query;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.UUID;


public record CreateDriverCommand(@NotNull(message = "Пройденный путь не может быть = 0 ") Float sumWay,
                                  @NotNull(message = "Опыт не может быть равным 0") @Min(message = "Стаж должен быть от 12 месяцев", value = 12) Integer experienceMonth,
                                  @NotNull(message = "Рейтинг не может быть 0") Float rating, UUID driverLicenseId,
                                  Long ownerId) implements Serializable {
}