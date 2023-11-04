package Input;

import java.util.Scanner;

public class NumericInput {
    private Scanner inputScanner;

    public NumericInput() {
        this.inputScanner = new Scanner(System.in);
    }

    public double getInputNumber() {
        double number;
        while (true) {
            try {
                System.out.println("Введите числовое значение:");
                number = inputScanner.nextDouble();
                break;
            } catch (java.util.InputMismatchException ex) {
                System.out.println("Ошибка: введено некорректное значение. Пожалуйста, повторите ввод.");
                inputScanner.nextLine();
            }
        }
        return number;
    }
}
