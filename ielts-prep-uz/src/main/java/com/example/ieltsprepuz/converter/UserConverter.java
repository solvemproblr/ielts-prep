package com.example.ieltsprepuz.converter;

import com.example.ieltsprepuz.entity.User;
import com.example.ieltsprepuz.model.UserDTO;

public class UserConverter {

    public static User fromDTO(UserDTO userDTO) {
        return new User(
                userDTO.getFirstName(),
                userDTO.getLastName(),
                userDTO.getBirthDate(),
                userDTO.getUserName(),
                userDTO.getPassword()
        );
    }

    public static UserDTO toDTO(User user) {
        return new UserDTO(
                user.getFirstName(),
                user.getLastName(),
                user.getBirthDate(),
                user.getUserName(),
                user.getPassword()
        );
    }

}
