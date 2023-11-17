package oop1.abstractClassesDemo;

public class OracleDatabaseManager extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("Data access: Oracle");
    }
}
