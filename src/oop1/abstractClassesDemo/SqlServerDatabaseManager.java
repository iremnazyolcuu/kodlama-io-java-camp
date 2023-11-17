package oop1.abstractClassesDemo;

public class SqlServerDatabaseManager extends BaseDatabaseManager {
    @Override
    public void getData() {
        System.out.println("Data access: SQL");
    }
}
