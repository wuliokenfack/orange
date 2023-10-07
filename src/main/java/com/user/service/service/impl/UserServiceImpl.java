package com.user.service.service.impl;

import com.user.service.dto.UserRequestRecord;
import com.user.service.model.User;
import com.user.service.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@Slf4j
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(UserRequestRecord userRequestRecord) {
        log.info("create user start: {}" , userRequestRecord.firstName());
        User user =  new User();
        user.setFirstName(userRequestRecord.firstName());
        user.setLastName(userRequestRecord.lastName());
        user.setEmail(userRequestRecord.email());
        user.setCreatedAt(LocalDate.now());
        log.info("create user success: {}" , userRequestRecord.firstName());
        return userRepository.save(user);
    }
}
