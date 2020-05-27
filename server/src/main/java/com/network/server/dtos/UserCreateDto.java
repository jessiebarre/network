package com.network.server.dtos;

import javax.validation.constraints.*;
import java.time.LocalDate;

public class UserCreateDto {

    @Size(min = 2, max = 512)
    @NotBlank
    private String firstName;

    @Size(min = 2, max = 512)
    @NotBlank
    private String lastName;

    @Size(max = 512)
    @NotNull
    @Email
    private String email;

    @Size(min = 6, max = 12)
    @NotEmpty
    private String password;

    @NotNull
    @Past
    private LocalDate birthDate;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
