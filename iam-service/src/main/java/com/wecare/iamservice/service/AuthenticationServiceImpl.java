package com.wecare.iamservice.service;

import com.wecare.iamservice.client.CoachClient;
import com.wecare.iamservice.client.UserClient;
import com.wecare.iamservice.domain.Coach;
import com.wecare.iamservice.domain.User;
import com.wecare.iamservice.dto.CoachDTO;
import com.wecare.iamservice.dto.UserDTO;
import com.wecare.iamservice.repository.CoachRepository;
import com.wecare.iamservice.repository.UserRepository;
import com.wecare.iamservice.response.LoginRequest;
import com.wecare.iamservice.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CoachRepository coachRepository;

    @Autowired
    private UserClient userClient;

    @Autowired
    private CoachClient coachClient;

    @Override
    public LoginResponse authenticate(LoginRequest loginRequest) {
        LoginResponse loginResponse = new LoginResponse();
        switch (loginRequest.getLoginAs()) {
            case USER:
                Optional<UserDTO> user = userClient.validateCredentials(loginRequest).getBody();
                if (user.isPresent()) {
                    loginResponse.setIsAuthenticated(true);

                } else {
                    loginResponse.setIsAuthenticated(false);
                }
                break;
            case COACH:
                Optional<CoachDTO> coach = coachClient.validateCoach(loginRequest);
                if (coach.isPresent()) {
                    loginResponse.setIsAuthenticated(true);
                } else {
                    loginResponse.setIsAuthenticated(false);
                }
                break;
            default:
                loginResponse.setIsAuthenticated(false);
        }
        return loginResponse;
    }
}
