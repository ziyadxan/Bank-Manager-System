package com.bank.project.users.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String surname;

    @Column(name = "birth_date", nullable = false)
    LocalDate birthDate;

    @Column(nullable = false)
    String phone;

    @Column(nullable = false)
    String address;

    @Column(nullable = false)
    String pin;

    @Column(nullable = false)
    String password;

    @Column(name = "is_active", nullable = false)
    Boolean isActive;
}
