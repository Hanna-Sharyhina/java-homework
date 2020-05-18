package com.training.java.secondstage.exceptions.customexceptions;

public class FacultyHasNoGroupException extends Exception {
    public FacultyHasNoGroupException() {
        super();
    }

    public FacultyHasNoGroupException(String message) {
        super(message);
    }

    public FacultyHasNoGroupException(String message, Throwable cause) {
        super(message, cause);
    }

    public FacultyHasNoGroupException(Throwable cause) {
        super(cause);
    }

    @Override
    public String toString() {
        return "На факультете отсутствуют группы! ";
    }
}