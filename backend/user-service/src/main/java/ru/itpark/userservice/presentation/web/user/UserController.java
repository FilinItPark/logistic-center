package ru.itpark.userservice.presentation.web.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.itpark.userservice.application.user.facade.UserFacade;
import ru.itpark.userservice.application.user.query.SearchUserFacade;
import ru.itpark.userservice.application.user.query.contracts.SearchParams;
import ru.itpark.userservice.application.user.response.UserResponse;
import ru.itpark.userservice.presentation.web.user.contracts.FillUserDataCommand;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/user")
@RestController
public class UserController {
    private final UserFacade userFacade;
    private final SearchUserFacade searchUserFacade;

    @PostMapping("/create")
    public void create(@RequestBody FillUserDataCommand fillUserDataCommand) {

        userFacade.create(fillUserDataCommand);
    }

    @PostMapping("/search")
    public List<UserResponse> search(@RequestBody SearchParams params) {
        return searchUserFacade.search(params);
    }
}
