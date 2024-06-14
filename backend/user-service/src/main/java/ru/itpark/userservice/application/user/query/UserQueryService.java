package ru.itpark.userservice.application.user.query;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.itpark.userservice.application.user.query.contracts.SearchParams;
import ru.itpark.userservice.domain.user.User;
import ru.itpark.userservice.infrastructure.repositories.user.custom.CustomUserRepository;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UserQueryService {
    private final CustomUserRepository repository;

    public List<User> search(SearchParams searchParams) {
        return repository.search(searchParams);
    }
}
