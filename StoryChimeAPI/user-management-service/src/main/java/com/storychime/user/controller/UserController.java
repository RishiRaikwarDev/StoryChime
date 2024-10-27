package com.storychime.user.controller;

import com.storychime.user.model.User;
import com.storychime.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controller for managing user accounts.
 * Exposes API endpoints for user registration, login, and management.
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * Registers a new user.
     *
     * @param user The user information to register.
     * @return A response entity indicating the result of the registration.
     */
    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        userService.register(user);
        return ResponseEntity.ok("User registered successfully!");
    }

    // Additional endpoints for login, getting user info, etc. can be added here
}
