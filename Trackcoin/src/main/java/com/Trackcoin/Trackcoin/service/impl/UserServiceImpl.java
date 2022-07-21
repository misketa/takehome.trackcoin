package com.Trackcoin.Trackcoin.service.impl;

import com.Trackcoin.Trackcoin.model.User;
import com.Trackcoin.Trackcoin.repository.UserRepository;
import com.Trackcoin.Trackcoin.service.UserService;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long user_id) {
        return userRepository.findById(user_id).orElseThrow(() -> new RuntimeException("User not found"));
    }



}
