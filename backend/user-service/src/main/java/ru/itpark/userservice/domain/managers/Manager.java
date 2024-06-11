package ru.itpark.userservice.domain.managers;

import jakarta.persistence.*;
import lombok.*;
import ru.itpark.userservice.domain.managers.VO.Tariff;
import ru.itpark.userservice.domain.managers.converters.TariffConverter;
import ru.itpark.userservice.domain.user.User;

@Entity
@Table(name = "managers")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Setter
@ToString
public class Manager {
    @Id
    private Long id;

    @OneToOne
    private User owner;
    private Float rating;

    @Column(name = "tariff", columnDefinition = "jsonb")
    @Convert(converter = TariffConverter.class)
    private Tariff tariff;
}
