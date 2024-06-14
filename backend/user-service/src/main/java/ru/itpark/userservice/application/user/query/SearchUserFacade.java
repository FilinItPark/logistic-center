package ru.itpark.userservice.application.user.query;

import lombok.RequiredArgsConstructor;
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


    public List<UserResponse> search(SearchParams params) {
        return mapper.toUserResponseList(query.search(params));
    }
}
