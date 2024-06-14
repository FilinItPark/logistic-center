package ru.itpark.userservice.application.user.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.itpark.userservice.domain.user.VO.DateInfo;
import ru.itpark.userservice.domain.user.VO.Language;
import ru.itpark.userservice.domain.user.VO.Role;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserResponse {
    private Long id;

    private String fullName;

    private String email;

    private String login;

    private List<Language> languages;

    private Role role;

    private DateInfo dateInfo;
}
