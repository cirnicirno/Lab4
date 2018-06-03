package lab4;

import java.util.Scanner;

public class NumberScanner {

    private int number;
    private Scanner in;
    private String line;

    public NumberScanner() {
        this.in = new Scanner(System.in);
    }

    public boolean isIntNumber() {
        this.line = this.in.nextLine();
        if (Validator.isInt(this.line)) {
            this.number = Integer.parseInt(this.line);
            return true;
        } else {
            return false;
        }
    }

    public int getNumber() {
        return this.number;
    }
}
