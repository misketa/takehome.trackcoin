package com.Trackcoin.Trackcoin.controller;

import com.Trackcoin.Trackcoin.model.Token;
import com.Trackcoin.Trackcoin.model.User;
import com.Trackcoin.Trackcoin.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping(path = "/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}/tokens")
    public ResponseEntity<Set<Token>> getAllUsersTokens(@PathVariable Long id){
        User user= userService.findById(id);
        return new ResponseEntity<>(user.getTokens(), HttpStatus.FOUND);
    }

}
