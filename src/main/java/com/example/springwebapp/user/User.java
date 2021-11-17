package com.example.springwebapp.user;


import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Stores information to identify the user
 */

@Data
@AllArgsConstructor
public class User {
    private Long id;
    private String alias;

    public User(final String userAlias) {
        this(null, userAlias);
    }
}
