package a6.calculator.model;

public class DivisionByZeroException extends RuntimeException {
    public DivisionByZeroException(String message) {
        super(message);
    }
}
