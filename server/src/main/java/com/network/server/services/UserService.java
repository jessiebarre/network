package com.network.server.services;

import com.network.server.dtos.UserCreateDto;
import com.network.server.entities.User;

import java.util.Optional;

public interface UserService {

    Optional<User> getOneUser(int id);

    void createUser(UserCreateDto userCreateDto);
}
