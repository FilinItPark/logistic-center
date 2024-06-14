package ru.itpark.userservice.domain.user.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Language {
    @JsonProperty("language")
    private String language;
    @JsonProperty("level")
    private String level;
}
