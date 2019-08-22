package com.chat.service;

import com.chat.model.User;
import com.chat.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.time.LocalDateTime;

@Service
@Transactional
public class UserService implements Serializable {

    @Autowired
    private UserRepository userRepository;

    public Long addUser(String userName){
        User user = new User();
        user.setUsername(userName);
        user.setCreated_at(LocalDateTime.now());
        User createdUser = userRepository.save(user);

        return createdUser.getId();
    }
}
