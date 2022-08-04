package bai14.exceptions;

public class InvalidPhoneNumberException extends Exception{
    public InvalidPhoneNumberException(String errorMessage) {
        super(errorMessage);
    }
}
