package com.example.pingpartner.service.impl;

import com.example.pingpartner.dto.UserDTO;
import com.example.pingpartner.model.User;
import com.example.pingpartner.repository.UserRepository;
import com.example.pingpartner.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;


    @Autowired
    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void saveUser(UserDTO userDTO) {
        User user = modelMapper.map(userDTO, User.class);
        this.userRepository.save(user);
    }

    @Override
    public void updateUser(UserDTO userDTO) {

    }

    @Override
    public List<UserDTO> findAllUser() {
        List<User> userList = this.userRepository.findAll();
        return userList.stream()
                .map(user -> modelMapper.map(user, UserDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public UserDTO findUserById(Long id) {
        return null;
    }
}
