package project.u5d13.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.u5d13.entities.User;
import project.u5d13.repository.UserRepository;

// UserService.java
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void registerUser(User user) {
    }

}
