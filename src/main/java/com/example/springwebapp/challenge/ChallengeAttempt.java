package com.example.springwebapp.challenge;

import lombok.Data;
import com.example.springwebapp.user.User;

/**
 * Identifies the attempt from a {@link User} to solve a challenge
 */

@Data
public class ChallengeAttempt {
    private Long id;
    private Long userId;
    private int factorA;
    private int factorB;
    private int resultAttempt;
    private boolean correct;

}
