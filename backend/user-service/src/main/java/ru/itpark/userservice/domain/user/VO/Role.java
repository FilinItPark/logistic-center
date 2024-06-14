package ru.itpark.userservice.domain.user.VO;

import jakarta.persistence.Embeddable;

@Embeddable
public enum Role {
    DRIVER,
    MANAGER
}
