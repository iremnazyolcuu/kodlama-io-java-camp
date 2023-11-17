package oop1.abstractClassesDemo;

public class Main {

    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        customerManager.baseDatabaseManager = new OracleDatabaseManager();
        customerManager.getCustomers();
    }
}
