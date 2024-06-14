package ru.itpark.userservice.domain.DriverLicense;

import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
