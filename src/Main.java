import model.ComplexNumber;
import service.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Введите действительную и мнимую часть первого числа: ");
        ComplexNumber a = new ComplexNumber(scanner.nextDouble(), scanner.nextDouble());

        System.out.print("Введите действительную и мнимую часть второго числа: ");
        ComplexNumber b = new ComplexNumber(scanner.nextDouble(), scanner.nextDouble());

        System.out.print("Выберите операцию (add, multiply, divide): ");
        String operation = scanner.next();

        try {
            ComplexNumber result = calculator.calculate(operation, a, b);
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        scanner.close();
    }
}
