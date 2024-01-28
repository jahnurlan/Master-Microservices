package com.example.person.service.impl;

import com.example.person.model.dto.request.UserRequestDto;
import com.example.person.model.entity.User;
import com.example.person.repository.UserRepository;
import com.example.person.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService {
    private final UserRepository userRepository;

    @Override
    public String saveUser(UserRequestDto userRequestDto) {
        User user = User.builder()
                .name(userRequestDto.getName())
                .surname(userRequestDto.getSurname())
                .build();
        userRepository.save(user);

        return "Save is successfully!";
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }
}
