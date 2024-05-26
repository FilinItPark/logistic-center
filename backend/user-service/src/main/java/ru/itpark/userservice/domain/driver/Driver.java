package ru.itpark.userservice.domain.driver;

import jakarta.persistence.*;
import lombok.*;
import ru.itpark.userservice.domain.user.User;

@Entity
@Table(name = "Drivers")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Driver {

    @Id
    private Long id;

    @Column(name = "sum_way")
    private Float sumWay;

    @Column(name = "experience_month")
    private Integer experienceMonth;

    private Float rating;

    @OneToOne(fetch = FetchType.LAZY)
    private User owner;

}
