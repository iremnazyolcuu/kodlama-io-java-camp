package kodlamaioHomePage.business;

import kodlamaioHomePage.core.logging.Logger;
import kodlamaioHomePage.dataAccess.CategoryDao;
import kodlamaioHomePage.entities.Category;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;
    private Category[] categories;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers, Category[] categories) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.categories = categories;
    }

    public void add(Category category) throws Exception {
        for (Category cat : categories) {
            if (cat.getCategoryName().equals(category.getCategoryName())) {
                throw new Exception("Category already exists!");
            }
        }
        categoryDao.add(category);

        for (Logger logger : loggers) {
            logger.log(category.getCategoryName());
        }
    }
}
