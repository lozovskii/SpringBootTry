package org.springBootTry.service;

import org.springBootTry.model.User;
import org.springBootTry.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        return this.userRepository.createUser(user);
    }

    @Override
    public User getOne(int id) {
        return this.userRepository.getOne(id);
    }
}