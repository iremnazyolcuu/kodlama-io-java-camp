package oopDemo;

public class CustomerManager {
    private CustomerDao customerDao;

    public CustomerManager(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    // is mantigi kodlari
    public void add(){
        customerDao.add();
    }

}
