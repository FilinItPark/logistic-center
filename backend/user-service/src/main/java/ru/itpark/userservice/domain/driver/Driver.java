package ru.itpark.userservice.domain.driver;

import jakarta.persistence.*;
import lombok.*;
import ru.itpark.userservice.domain.DriverLicense.DriverLicense;
import ru.itpark.userservice.domain.user.User;

@Entity
@Table(name = "Drivers")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Setter
@ToString
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sum_way")
    private Float sumWay;

    @Column(name = "experience_month")
    private Integer experienceMonth;

    private Float rating;

    @OneToOne(fetch = FetchType.LAZY)
    private DriverLicense driverLicense;

    @OneToOne(fetch = FetchType.LAZY)
    private User owner;

    public void update(
            Float sumWay,
            Integer experienceMonth,
            Float rating,
            DriverLicense driverLicense
    ) {
        this.sumWay = sumWay;
        this.experienceMonth = experienceMonth;
        this.rating = rating;
        this.driverLicense = driverLicense;
    }


}
