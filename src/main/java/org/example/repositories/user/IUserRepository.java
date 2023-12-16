package org.example.repositories.user;

import org.example.models.User;

public interface IUserRepository {
    public User addUser(String name, String email, String phone);

    public User getUserByUserId(int userId);
}
