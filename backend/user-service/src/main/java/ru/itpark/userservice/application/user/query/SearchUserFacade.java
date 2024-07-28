package ru.itpark.userservice.application.user.query;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import ru.itpark.userservice.application.user.mapper.UserMapper;
import ru.itpark.userservice.application.user.query.contracts.SearchParams;
import ru.itpark.userservice.application.user.response.UserResponse;
import ru.itpark.userservice.domain.user.User;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SearchUserFacade {
    private final UserQueryService query;
    private final UserMapper mapper;
    private final KafkaTemplate<String, User> kafkaTemplate;

    public List<User> search(SearchParams params) {

        var users = query.search(params);
        kafkaTemplate.send("user-create", String.valueOf(users.get(1).getId().hashCode()), users.get(1));
        return users;
    }
}
