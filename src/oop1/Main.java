package oop1;

import oop1.inheritance.CorporateCustomer;
import oop1.inheritance.Customer;
import oop1.inheritance.IndividualCustomer;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setName("Delonghi Coffee Machine");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image1.jpg");

        Product product2 = new Product();
        product2.setName("Smeg Coffee Machine");
        product2.setDiscount(4);
        product2.setUnitPrice(6500);
        product2.setUnitsInStock(5);
        product2.setImageUrl("image2.jpg");

        Product product3 = new Product();
        product3.setName("Philips Coffee Machine");
        product3.setDiscount(3);
        product3.setUnitPrice(4500);
        product3.setUnitsInStock(9);
        product3.setImageUrl("image3.jpg");

        Product[] products = {product1, product2, product3};

        for (Product product : products) {
            System.out.println(product.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhoneNumber("1234567890");
        individualCustomer.setCustomerNumber("1212");
        individualCustomer.setFirstName("Peter");
        individualCustomer.setLastName("Parker");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhoneNumber("246810");
        corporateCustomer.setTaxNumber("0101");
        corporateCustomer.setCustomerNumber("54321");

        Customer[] customers = {individualCustomer, corporateCustomer};

    }

}
