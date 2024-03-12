package Polymorphism.calculator;

import java.util.ArrayDeque;
import java.util.Deque;

public class MemoryStorageOperation implements Operation{

    private Deque<Integer> memoryData;

    public MemoryStorageOperation() {
        this.memoryData = new ArrayDeque<>();
    }

    @Override
    public void addOperand(int operand) {
        this.memoryData.push(operand);

    }

    @Override
    public int getResult() {
        return this.memoryData.pop();
    }

    @Override
    public boolean isCompleted() {
        return false;
    }
}
