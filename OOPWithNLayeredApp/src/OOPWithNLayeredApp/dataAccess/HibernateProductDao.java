package OOPWithNLayeredApp.dataAccess;

import OOPWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
    public void add(Product product){
        //Sadece ve sadece db erişim kodları buraya yazılır... SQL
        System.out.println("Hibernate ile veritabanina eklendi");
    }
}
