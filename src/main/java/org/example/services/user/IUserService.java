package org.example.services.user;

import org.example.models.User;

public interface IUserService {
    public User createUser(String name, String email, String phone);

}
