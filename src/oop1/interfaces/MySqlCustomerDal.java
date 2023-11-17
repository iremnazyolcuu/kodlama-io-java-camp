package oop1.interfaces;

public class MySqlCustomerDal implements ICustomerDal {
    @Override
    public void add() {
        System.out.println("Mysql");
    }
}
