package calculator;

public class CalculationException extends Exception {

    /**
     * Creates a new instance of <code>CalculationException</code> without
     * detail message.
     */
    public CalculationException() {
    }

    /**
     * Constructs an instance of <code>CalculationException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public CalculationException(String msg) {
        super(msg);
    }
}
