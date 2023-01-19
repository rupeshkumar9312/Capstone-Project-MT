package com.wecare.userservice.service;

import com.wecare.userservice.domain.User;
import com.wecare.userservice.dto.UserDTO;
import com.wecare.userservice.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);
        user = userRepository.save(user);
        BeanUtils.copyProperties(user, userDTO);
        return userDTO;
    }

    @Override
    public UserDTO getUserById(String userId) {
        User dbUser = userRepository.findById(userId)
                .orElse(new User());
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(dbUser, userDTO);
        return userDTO;
    }
}
