package oop1.polymorphismDemo;

public class CustomerManager {
    private BaseLogger baseLogger;

    public CustomerManager(BaseLogger baseLogger) {
        this.baseLogger = baseLogger;
    }

    public void add() {
        System.out.println("Customer has been added.");
        this.baseLogger.log(" Log message");
    }
}
