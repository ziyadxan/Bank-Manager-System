package com.bank.project.users.service.impl;

import com.bank.project.users.dto.request.UserRequest;
import com.bank.project.users.dto.response.UserResponse;
import com.bank.project.users.mapper.UserMapper;
import com.bank.project.users.repository.UserRepository;
import com.bank.project.users.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserResponse getById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Long id, UserRequest user) {

    }

    @Override
    public void create(UserRequest userRequest) {

    }
}
