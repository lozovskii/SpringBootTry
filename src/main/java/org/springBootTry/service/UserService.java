package org.springBootTry.service;

import org.springBootTry.model.User;

public interface UserService {

    User createUser(User user);

    User getOne(int id);

}
