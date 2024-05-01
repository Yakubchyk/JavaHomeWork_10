package com.yk1;

public class WrongPassException extends Exception {
    public WrongPassException() {
        super(" меньше 20 символов и не должен содержать пробелы." +
                " Обратите внимание, что пароль и повторение " +
                "должны слвпадать!");
    }

}
