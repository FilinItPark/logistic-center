package ru.itpark.userservice.domain.DriverLicense;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "DriversLicenses")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class DriverLicense {
    @Id
    private UUID id;

    private String name;
}
