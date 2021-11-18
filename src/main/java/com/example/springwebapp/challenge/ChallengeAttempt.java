package com.example.springwebapp.challenge;

import lombok.AllArgsConstructor;
import lombok.Data;
import com.example.springwebapp.user.User;

/**
 * Identifies the attempt from a {@link User} to solve a challenge
 */

@Data
@AllArgsConstructor
public class ChallengeAttempt {
    private Long id;
    private User userId;
    private int factorA;
    private int factorB;
    private int resultAttempt;
    private boolean correct;


}
