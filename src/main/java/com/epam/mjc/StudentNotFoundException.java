package com.epam.mjc;

public class StudentNotFoundException extends IllegalArgumentException {
    public StudentNotFoundException (String msg, IllegalArgumentException cause) {
        super(msg, cause);
    }

    public StudentNotFoundException (String msg) {
        super(msg);
    }
}
