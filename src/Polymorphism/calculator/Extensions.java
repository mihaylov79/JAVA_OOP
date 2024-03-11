package Polymorphism.calculator;

public class Extensions {

    private Extensions() {
    }

    public static InputInterpreter buildInterpreter(CalculationEngine engine) {
        return new InputInterpreter(engine);
    }
}
