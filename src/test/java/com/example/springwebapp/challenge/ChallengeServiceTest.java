package com.example.springwebapp.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.BDDAssertions.then;

public class ChallengeServiceTest {

    private ChallengeService challengeService;

    @BeforeEach
    void setUp() {
        challengeService = new ChallengeServiceImpl();
    }

    @Test
    public void checkCorrectAttemptTest(){
        // given
        ChallengeAttemptDTO attemptDTO =
                new ChallengeAttemptDTO(50,60, "maria", 3000);
        // when
        ChallengeAttempt result = challengeService.verifyAttempt(attemptDTO);
        // then
        then(result.isCorrect()).isTrue();
    }

    @Test
    public void checkWrongAttemptTest(){
        // given
        ChallengeAttemptDTO attemptDTO = new ChallengeAttemptDTO(50, 60, "maria", 5000);
        // when
        ChallengeAttempt resultAttempt = challengeService.verifyAttempt(attemptDTO);
        // then
        then(resultAttempt.isCorrect()).isFalse();



    }



}