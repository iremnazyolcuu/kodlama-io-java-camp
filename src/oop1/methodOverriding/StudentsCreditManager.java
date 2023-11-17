package oop1.methodOverriding;

public class StudentsCreditManager extends BaseCreditManager {
    @Override
    public double calculate(double amount) {
        return amount * 1.10;
    }
}
