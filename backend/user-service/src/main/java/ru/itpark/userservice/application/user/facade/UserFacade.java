package ru.itpark.userservice.application.user.facade;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import ru.itpark.userservice.application.user.command.UserCommandService;
import ru.itpark.userservice.application.user.query.UserQueryService;
import ru.itpark.userservice.application.user.query.contracts.SearchParams;
import ru.itpark.userservice.domain.user.User;
import ru.itpark.userservice.presentation.web.user.contracts.FillUserDataCommand;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserFacade {
    private final UserCommandService userInfoService;
    private final UserQueryService userQueryService;
    private final KafkaTemplate<String, User> kafkaTemplate;

    public void create(FillUserDataCommand fillDataCommand) {
        log.debug("UserFacade.updateUserInfo() | fillDataCommand = {}", fillDataCommand);

        userInfoService.create(fillDataCommand);

        final List<User> users = userQueryService.search(SearchParams.builder().login(fillDataCommand.login()).build());

    }

    public void update(Long userId, FillUserDataCommand updateUserDataCommand) {
        log.debug("UserFacade.updateUserInfo() | updateUserDataCommand = {}", updateUserDataCommand);

        userInfoService.update(userId,
                updateUserDataCommand);
    }
}
