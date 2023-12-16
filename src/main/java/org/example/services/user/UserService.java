package org.example.services.user;

import org.example.models.User;
import org.example.repositories.user.UserRepository;

public class UserService implements IUserService {
    private final UserRepository userRepository;

    public UserService() {
        userRepository = UserRepository.getInstance();
    }

    @Override
    public User createUser(String name, String email, String phone) {
        if (email.isEmpty()) {
            System.out.println("User is empty");
            return null;
        }
        return userRepository.addUser(name, email, phone);
    }
}
