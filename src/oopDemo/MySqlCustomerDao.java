package oopDemo;

public class MySqlCustomerDao implements CustomerDao {

    @Override
    public void add() {
        System.out.println("MySql has been added.");
    }

}
