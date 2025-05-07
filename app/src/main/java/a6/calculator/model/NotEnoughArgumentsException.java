package a6.calculator.model;

public class NotEnoughArgumentsException extends RuntimeException {
    public NotEnoughArgumentsException(String message) {
        super(message);
    }
}
