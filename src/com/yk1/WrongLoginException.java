package com.yk1;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
        super(" меньше 20 символов и не должен содержать пробелы.");
    }
}
