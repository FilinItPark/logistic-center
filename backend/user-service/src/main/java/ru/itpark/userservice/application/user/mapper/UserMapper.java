package ru.itpark.userservice.application.user.mapper;

import org.mapstruct.Mapper;
import ru.itpark.userservice.application.user.response.UserResponse;
import ru.itpark.userservice.domain.user.User;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    List<UserResponse> toUserResponseList(List<User> userList);
}
