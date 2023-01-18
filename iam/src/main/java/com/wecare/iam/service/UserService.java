package com.wecare.iam.service;

import com.wecare.iam.dto.CoachDTO;
import com.wecare.iam.dto.UserDTO;

public interface UserService {

    UserDTO createUser(UserDTO userDTO);

    UserDTO getUserById(String userId);
}
