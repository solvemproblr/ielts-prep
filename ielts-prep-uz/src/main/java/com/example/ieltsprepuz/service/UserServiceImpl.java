package com.example.ieltsprepuz.service;

import com.example.ieltsprepuz.exception.UserNotFoundException;
import com.example.ieltsprepuz.model.UserDTO;
import com.example.ieltsprepuz.repository.UserRepository;
import org.springframework.stereotype.Service;

import static com.example.ieltsprepuz.converter.UserConverter.fromDTO;
import static com.example.ieltsprepuz.converter.UserConverter.toDTO;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        return toDTO(userRepository.save(fromDTO(userDTO)));
    }

    @Override
    public UserDTO getUserById(Long id) {
        return toDTO(userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id)));
    }

    @Override
    public boolean isConfimedUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id)).isConfirmed();
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserDTO updateUser(UserDTO userDTO) {
        return createUser(userDTO);
    }
}
