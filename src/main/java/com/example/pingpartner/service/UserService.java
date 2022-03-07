package com.example.pingpartner.service;

import com.example.pingpartner.dto.UserDTO;

import java.util.List;

public interface UserService {

    public void saveUser(UserDTO userDTO);

    public void updateUser(UserDTO userDTO);

    public List<UserDTO> findAllUser();

    public UserDTO findUserById(Long id);
}
