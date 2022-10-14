package OOPWithNLayeredApp.dataAccess;

import OOPWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
    public void add(Product product){
        //Sadece ve sadece db erişim kodları buraya yazılır... SQL
        System.out.println("JDBC ile veritabanina eklendi");
    }
}
