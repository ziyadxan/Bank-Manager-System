package com.bank.project.users.mapper;

import com.bank.project.users.dto.request.UserRequest;
import com.bank.project.users.dto.response.UserResponse;
import com.bank.project.users.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "Spring")
public interface UserMapper {

    UserResponse toDto(User user);

    User toEntity(UserRequest userRequest);

    void updateFromDto(UserRequest userRequest, @MappingTarget User userUpdate);
}
