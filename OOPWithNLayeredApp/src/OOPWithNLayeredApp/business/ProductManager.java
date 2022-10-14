package OOPWithNLayeredApp.business;

import OOPWithNLayeredApp.core.logging.Logger;
import OOPWithNLayeredApp.dataAccess.HibernateProductDao;
import OOPWithNLayeredApp.dataAccess.JdbcProductDao;
import OOPWithNLayeredApp.dataAccess.ProductDao;
import OOPWithNLayeredApp.entities.Product;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;
    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        //İş kuralları
        if(product.getUnitePrice()<10){
            throw new Exception("Ürün fiyatı 10 dan düşük olamaz");
        }
        productDao.add(product);

        for(Logger logger : loggers){
            logger.log(product.getName());
        }
    }
}
