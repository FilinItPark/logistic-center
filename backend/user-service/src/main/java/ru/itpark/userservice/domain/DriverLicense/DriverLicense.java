package ru.itpark.userservice.domain.DriverLicense;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "DriversLicenses")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class DriverLicense {
    @Id
    private Long id;

    private String name;
}
