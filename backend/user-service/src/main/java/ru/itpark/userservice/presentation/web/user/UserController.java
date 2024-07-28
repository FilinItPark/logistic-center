package ru.itpark.userservice.presentation.web.user;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;
import ru.itpark.userservice.application.user.facade.UserFacade;
import ru.itpark.userservice.application.user.mapper.UserMapper;
import ru.itpark.userservice.application.user.query.SearchUserFacade;
import ru.itpark.userservice.application.user.query.contracts.SearchParams;
import ru.itpark.userservice.application.user.response.UserResponse;
import ru.itpark.userservice.presentation.web.user.contracts.FillUserDataCommand;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/user")
@Slf4j
@RestController
public class UserController {
    private final UserFacade userFacade;
    private final UserMapper mapper;
    private final SearchUserFacade searchUserFacade;

    @PostMapping("/create")
    @PreAuthorize("isAuthenticated()")
    public void create(@RequestBody FillUserDataCommand fillUserDataCommand) {
        log.info("пук");
        userFacade.create(fillUserDataCommand);
    }

    @PostMapping("/search")
    public List<UserResponse> search(@RequestBody SearchParams params) {
        return mapper.toUserResponseList(searchUserFacade.search(params));
    }

    @PreAuthorize("isAuthenticated()")
    @PutMapping("/update/{id}")
    public void update(@PathVariable("id") Long userId, @RequestBody FillUserDataCommand updateUserDataCommand, AuthenticationPrincipal principal)
    {
        userFacade.update(userId, updateUserDataCommand);
    }
}
