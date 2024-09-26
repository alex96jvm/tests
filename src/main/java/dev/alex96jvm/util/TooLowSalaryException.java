package dev.alex96jvm.util;

public class TooLowSalaryException extends RuntimeException{
    TooLowSalaryException(String message){
        super(message);
    }
}
