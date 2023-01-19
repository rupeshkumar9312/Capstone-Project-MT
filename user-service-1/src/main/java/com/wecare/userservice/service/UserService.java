package com.wecare.userservice.service;

import com.wecare.userservice.dto.UserDTO;

public interface UserService {

    UserDTO createUser(UserDTO userDTO);

    UserDTO getUserById(String userId);
}
