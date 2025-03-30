package service;

import model.ComplexNumber;
import model.Operation;

public class Calculator {
    public ComplexNumber calculate(String operation, ComplexNumber a, ComplexNumber b) {
        Logger.getInstance().log("Операция: " + operation + " над " + a + " и " + b);
        Operation op = OperationFactory.getOperation(operation);
        return op.execute(a, b);
    }
}
