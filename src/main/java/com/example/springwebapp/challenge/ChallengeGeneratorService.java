package com.example.springwebapp.challenge;

public interface ChallengeGeneratorService {

    /**
     *
     * @return a randomly-generated challenges with factors between 11 and 99
     */

    Challenge randomChallenge();
}
