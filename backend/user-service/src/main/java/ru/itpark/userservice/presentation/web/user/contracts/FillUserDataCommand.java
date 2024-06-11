package ru.itpark.userservice.presentation.web.user.contracts;

import ru.itpark.userservice.domain.user.VO.Language;

import java.util.List;

public record FillUserDataCommand(
        String fullName,
        String email,
        String login,
        List<Language> languages
) {
}
