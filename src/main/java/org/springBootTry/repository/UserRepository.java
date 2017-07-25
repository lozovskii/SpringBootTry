package org.springBootTry.repository;

import org.springBootTry.model.User;

public interface UserRepository {

    User createUser(User user);

    User getOne(int id);

}
