package ru.itpark.userservice.application.user.query;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.itpark.userservice.application.user.query.contracts.SearchParams;
import ru.itpark.userservice.domain.user.User;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SearchUserFacade {
    private final UserQueryService query;


    public List<User> search(SearchParams params) {
        return query.search(params);
    }
}
