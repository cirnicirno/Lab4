package lab4;

public class Validator {
    public Validator() {
    }

    public static boolean isInt(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException var2) {
            return false;
        }
    }
}
