package com.agrotech1.service;

import com.agrotech1.model.User;
import com.agrotech1.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;


public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}