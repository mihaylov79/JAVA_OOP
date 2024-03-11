package Polymorphism.calculator;

public class ExtendedInterpreter extends InputInterpreter {

    public ExtendedInterpreter(CalculationEngine engine) {
        super(engine);
    }

    public Operation getOperation(String operation) {
        if (operation.equals("/")) {
            return new DivisionOperation();
        }

        return null;
    }
}
