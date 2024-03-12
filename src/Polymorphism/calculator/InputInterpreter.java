package Polymorphism.calculator;

public class InputInterpreter {
    private CalculationEngine engine;
    private MemoryStorageOperation memoryStorageOperation;




    public InputInterpreter(CalculationEngine engine){
        this.engine = engine;
        this.memoryStorageOperation = new MemoryStorageOperation();

    }

    public boolean interpret(String input) {
        try {
            engine.pushNumber(Integer.parseInt(input));
        }catch (Exception ex){
            engine.pushOperation(this.getOperation(input));
        }
        return true;
    }
    public Operation getOperation(String operation) {
            switch (operation){
                case "*":
                    return new MultiplicationOperation();
                case "/":
                    return new DivisionOperation();
                case "mr":
                    return new MemoryRecallOperation(memoryStorageOperation);
                case "ms":
                    return this.memoryStorageOperation;
                default:
                    return getOperation(operation);
            }
    }
}
