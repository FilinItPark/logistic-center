package ru.itpark.userservice.domain.user;

import ru.itpark.userservice.domain.user.VO.DateInfo;
import ru.itpark.userservice.domain.user.VO.Language;

import java.time.LocalDateTime;
import java.util.List;

public class UserFactory {

    public static User createUser() {
        return new User();
    }

    public static User createUser(String fullName,
                                  String email,
                                  String login,
                                  List<Language> languages) {
        return User.builder()
                .email(email)
                .login(login)
                .fullName(fullName)
                .languages(languages)
                .dateInfo(
                        DateInfo.builder()
                                .createdAt(LocalDateTime.now())
                                .build()
                )
                .build();
    }


}
