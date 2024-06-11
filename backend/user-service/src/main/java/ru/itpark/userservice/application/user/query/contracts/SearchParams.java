package ru.itpark.userservice.application.user.query.contracts;

import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.itpark.userservice.domain.user.VO.DateInfo;
import ru.itpark.userservice.domain.user.VO.Language;

import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@Builder
@Getter
@Setter
@NoArgsConstructor
public class SearchParams {
    Long id;
    String fullName;
    String email;
    String login;
    List<Language> languages;
    DateInfo dateInfo;
    Integer limit = 15;
    Integer offset = 0;
}
