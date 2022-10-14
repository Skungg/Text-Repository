package OOPWithNLayeredApp;

import OOPWithNLayeredApp.business.ProductManager;
import OOPWithNLayeredApp.core.logging.DatabaseLogger;
import OOPWithNLayeredApp.core.logging.FileLogger;
import OOPWithNLayeredApp.core.logging.Logger;
import OOPWithNLayeredApp.core.logging.MailLogger;
import OOPWithNLayeredApp.dataAccess.HibernateProductDao;
import OOPWithNLayeredApp.dataAccess.JdbcProductDao;
import OOPWithNLayeredApp.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1,"IPhone XR",10000);

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(),new MailLogger()};

        ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
        productManager.add(product1);
    }
}
