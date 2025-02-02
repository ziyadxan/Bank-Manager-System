package com.bank.project.users.service;

import com.bank.project.users.dto.request.UserRequest;
import com.bank.project.users.dto.response.UserResponse;

public interface UserService {

    UserResponse getById(Long id);

    void delete(Long id);

    void update(Long id, UserRequest user);

    void create(UserRequest userRequest);
}
