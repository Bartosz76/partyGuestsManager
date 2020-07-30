package design.exceptions;

public class IncorrectTaxValueException extends Throwable {

    private String message;

    public IncorrectTaxValueException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
