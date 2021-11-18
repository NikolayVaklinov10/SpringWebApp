package com.example.springwebapp.challenge;

import org.hibernate.procedure.spi.ParameterRegistrationImplementor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ChallengeGeneratorServiceImpl implements ChallengeGeneratorService {

    private final static int MINIMUM_FACTOR = 11;
    private final static int MAXIMUM_FACTOR = 100;


    private final Random random;

    ChallengeGeneratorServiceImpl(){
        this.random = new Random();
    }

    protected ChallengeGeneratorServiceImpl(final Random random){
        this.random = random;
    }

    private int next(){
        return random.nextInt(MAXIMUM_FACTOR - MINIMUM_FACTOR) + MINIMUM_FACTOR;
    }

    @Override
    public Challenge randomChallenge() {

        return new Challenge(next(), next());
    }
}
