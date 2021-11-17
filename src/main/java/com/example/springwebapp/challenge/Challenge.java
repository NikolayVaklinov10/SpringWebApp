package com.example.springwebapp.challenge;

import lombok.Data;
import lombok.Value;

import javax.persistence.Entity;

/**
 * This class represents a Challenge to solve a Multiplication (a * b)
 */


@Value
//@Entity
public class Challenge {

    int factorA;
    int factorB;
}
