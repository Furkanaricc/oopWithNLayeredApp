package oopWithNLayeredApp.business;

import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;


import java.util.logging.Logger;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao,Logger[]loggers) {
        this.productDao = productDao;
        this.loggers=loggers;
    }

    public ProductManager(JdbcProductDao productDao, oopWithNLayeredApp.core.logging.Logger[] loggers) {
    }

    public void add(Product product) throws Exception { //response request
        //iş kuralları
        if (product.getUnitPrice() < 10) {
            throw new Exception("Ürün fiyatı 10 dan  küçük olamaz.");
        }

        productDao.add(product);




    }
}
