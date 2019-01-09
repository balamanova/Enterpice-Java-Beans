package calculator;

public class Calculation{

    public String compute(String number1, String number2, String operation) throws CalculationException {
        int num1=0, num2=0;
        String result;
        try {
            num1 = Integer.parseInt(number1);
        } catch (NumberFormatException ex) {
            throw new CalculationException("\"" + number1 + "\" is invalid format.");
        }
        try {
            num2 = Integer.parseInt(number2);
        } catch (NumberFormatException ex) {
            throw new CalculationException("\"" + number2 + "\" is invalid format.");
        }
        switch (operation) {
            case "+":
                result = Integer.toString(num1 + num2);
                break;
            case "-":
                result = Integer.toString(num1 - num2);
                break;
            case "*":
                result = Integer.toString(num1 * num2);
                break;
            case "/":
                if (num2 == 0) {
                    throw new CalculationException("Number 2 must not be zero in division");
                }
                result = Integer.toString(num1 / num2);
                break;
            default:
                throw new CalculationException("Operation invalid");
        }
        return result;
    }
}
