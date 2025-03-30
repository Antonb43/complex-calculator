package service;

import model.*;

public class OperationFactory {
    public static Operation getOperation(String type) {
        return switch (type) {
            case "add" -> new Addition();
            case "multiply" -> new Multiplication();
            case "divide" -> new Division();
            default -> throw new IllegalArgumentException("Неизвестная операция: " + type);
        };
    }
}
