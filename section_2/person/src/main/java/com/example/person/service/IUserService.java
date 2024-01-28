package com.example.person.service;

import com.example.person.model.dto.request.UserRequestDto;
import com.example.person.model.entity.User;

import java.util.List;

/**
 * @author Nurlan Jahangirzada
 * @version 1.0
 * @since 10.27.2023
 */
public interface IUserService {
    String saveUser(UserRequestDto userRequestDto);
    List<User> getAllUser();

}


