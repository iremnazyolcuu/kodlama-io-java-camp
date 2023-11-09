package oop1.classes;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.addition(3, 4));

        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);

        Product productTwo = new Product(3, "Coffee machine", "Philips espresso machine", 12000, 4);


        ProductManager productManager = new ProductManager();
        productManager.add(product);
        productManager.add(productTwo);

    }

}
