package com.greeting.services;

import com.greeting.dto.UserDTO;
import com.greeting.entities.User;
import com.greeting.mapper.UserMapper;
import com.greeting.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public List<UserDTO> getUsers() {
        List<User> fetchedUsers = userRepository.findAll();
        return userMapper.toListUserDTO(fetchedUsers);
    }

}
