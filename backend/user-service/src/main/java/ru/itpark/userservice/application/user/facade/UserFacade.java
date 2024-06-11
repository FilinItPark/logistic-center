package ru.itpark.userservice.application.user.facade;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.itpark.userservice.application.user.command.UserCommandService;
import ru.itpark.userservice.presentation.web.user.contracts.FillUserDataCommand;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserFacade {
    private final UserCommandService userInfoService;

    public void create(FillUserDataCommand fillDataCommand) {
        log.debug("UserFacade.updateUserInfo() | fillDataCommand = {}", fillDataCommand);

        userInfoService.create(fillDataCommand);
    }
}
