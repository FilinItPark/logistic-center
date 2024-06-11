package ru.itpark.userservice.application.user.command;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.itpark.userservice.domain.user.UserFactory;
import ru.itpark.userservice.infrastructure.repositories.UserRepository;
import ru.itpark.userservice.presentation.web.user.contracts.FillUserDataCommand;

@Service
@RequiredArgsConstructor
public class UserCommandService {
    private final UserRepository userRepository;

    public void create(FillUserDataCommand fillUserDataCommand) {
        var user = UserFactory.createUser(fillUserDataCommand.fullName(),
                fillUserDataCommand.email(),
                fillUserDataCommand.login(),
                fillUserDataCommand.languages()
        );

        userRepository.save(user);
    }
}
