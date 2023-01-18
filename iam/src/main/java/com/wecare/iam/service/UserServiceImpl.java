package com.wecare.iam.service;

import com.wecare.iam.domain.Coach;
import com.wecare.iam.domain.User;
import com.wecare.iam.dto.CoachDTO;
import com.wecare.iam.dto.UserDTO;
import com.wecare.iam.repository.CoachRepository;
import com.wecare.iam.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
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
