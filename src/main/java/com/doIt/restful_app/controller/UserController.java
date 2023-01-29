package com.doIt.restful_app.controller;

import com.doIt.restful_app.entity.User;
import com.doIt.restful_app.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/api/users")
public class UserController {

    private UserService userService;

    // Build create user REST API
    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);

    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Long userId) {
        return userService.getUserById(userId);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable("id") Long userId, @RequestBody User user) {
        user.setId(Math.toIntExact(userId));
        return userService.updateUser(user);
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable("id") Long userId) {
        userService.deleteUser(userId);
    }
}
