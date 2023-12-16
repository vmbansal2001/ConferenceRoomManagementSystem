package org.example.repositories.user;

import org.example.models.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository implements IUserRepository {

    private final Map<Integer, User> users;
    private static UserRepository repo = null;
    private static int USERS_COUNT = 1000;

    private UserRepository() {
        users = new HashMap<Integer, User>();
    }

    public static UserRepository getInstance() {
        if (repo == null) {
            repo = new UserRepository();
        }
        return repo;
    }

    @Override
    public User addUser(String name, String email, String phone) {
        User user = new User(USERS_COUNT, name, email, phone);
        users.put(user.getUserId(), user);
        USERS_COUNT += 1;
        return user;
    }

    @Override
    public User getUserByUserId(int userId) {
        return users.get(userId);
    }

    public Map<Integer, User> getAllUsers() {
        return users;
    }


}
