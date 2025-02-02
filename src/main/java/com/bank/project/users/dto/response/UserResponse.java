package com.bank.project.users.dto.response;

import lombok.Data;
import java.time.LocalDate;

@Data
public class UserResponse {

    private Long Id;

    private String name;

    private String surname;

    private LocalDate birthDate;

    private String phone;

    private String address;

    private String pin;
}
