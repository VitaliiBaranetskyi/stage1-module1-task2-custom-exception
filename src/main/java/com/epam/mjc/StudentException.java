package com.epam.mjc;

public class StudentException extends IllegalArgumentException{

    public StudentException(String s) {
        super("Could not find student with ID " + s);
    }
}
