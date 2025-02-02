package com.bank.project.users.dto.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserRequest {

    private String name;

    private String surname;

    private LocalDate birthDate;

    private String phone;

    private String address;

    private String password;
}
