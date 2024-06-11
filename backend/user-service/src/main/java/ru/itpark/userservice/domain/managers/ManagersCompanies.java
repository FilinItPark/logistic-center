package ru.itpark.userservice.domain.managers;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;

@Table
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Setter
@ToString
public class ManagersCompanies {
    @Id
    private Long id;

    @OneToOne
    private Manager manager;

    private Long companyId;
}
