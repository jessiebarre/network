package com.network.server.services;

import com.network.server.dtos.UserCreateDto;
import com.network.server.dtos.UserDto;
import com.network.server.entities.User;
import com.network.server.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> getOneUser(int id) {
        return userRepository.findById(id);
    }

    @Override
    public void createUser(UserCreateDto userCreateDto) {
        User user = new User();
        user.setFirstName(userCreateDto.getFirstName());
        user.setLastName(userCreateDto.getLastName());
        user.setEmail(userCreateDto.getEmail());
        user.setPassword(userCreateDto.getPassword());
        user.setBirthDate(userCreateDto.getBirthDate());
        userRepository.save(user);
    }
}
