package business;

import core.logging.Logger;
import dataAccess.CategoryDao;
import entities.Category;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }
    public void add(Category category)throws Exception{
        for(Category turnCategory : categoryDao.getAll()){
            if(turnCategory.getCategoryName().equals(category.getCategoryName())){
                throw new Exception("Kategori ismi tekrar edemez!!");
            }
            categoryDao.add(category);
            for(Logger turnLogger : loggers){
                turnLogger.log(category.getCategoryName());
            }
        }
    }
}
