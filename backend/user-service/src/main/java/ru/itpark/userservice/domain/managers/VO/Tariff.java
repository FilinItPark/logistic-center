package ru.itpark.userservice.domain.managers.VO;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Tariff {
    private Float distance;
    private Float price;
}
