package oop1.interfaces;

public class CustomerManager {

    private ICustomerDal iCustomerDal;

    public CustomerManager(ICustomerDal iCustomerDal) {
        this.iCustomerDal = iCustomerDal;
    }

    // is kodlari yazilir
    public void add() {
        iCustomerDal.add();
    }

}
