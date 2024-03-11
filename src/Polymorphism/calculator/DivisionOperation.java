package Polymorphism.calculator;

import java.util.ArrayList;
import java.util.List;

public class DivisionOperation implements Operation{

    private List<Integer> operands;
    private int result;

    public DivisionOperation() {
        this.operands = new ArrayList<>();
    }

    @Override
    public void addOperand(int operand) {
        operands.add(operand);
    }

    @Override
    public int getResult() {
        return operands.get(0) / operands.get(1);
    }

    @Override
    public boolean isCompleted() {

        return this.operands.size() == 2;
    }
}
