package com.network.server.dtos;

import java.time.LocalDate;

public class UserDto {

    private String firstName;

    private String lastName;

    private LocalDate birthDate;

    public UserDto(String firstName, String lastName, LocalDate birthDate ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }
}
