package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

// buraya sadece db erisim kodlari yazilir
public class HibernateProductDao implements ProductDao{
    public void add(Product product) {
        System.out.println("An item has been added to the database using Hibernate.");
    }
}
