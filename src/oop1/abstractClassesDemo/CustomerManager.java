package oop1.abstractClassesDemo;

public class CustomerManager {
    BaseDatabaseManager baseDatabaseManager;

    public void getCustomers() {
        baseDatabaseManager.getData();
    }
}
