package com.example.ieltsprepuz.service;

import com.example.ieltsprepuz.model.UserDTO;

public interface UserService {

    UserDTO createUser(UserDTO userDTO);

    UserDTO getUserById(Long id);

    boolean isConfimedUserById(Long id);

    void deleteUserById(Long id);

    UserDTO updateUser(UserDTO userDTO);

}
