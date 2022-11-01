package entities;

public class Category {
    private String programming;
    private String categoryName;
    public Category(){

    }

    public Category(String programming, String categoryName) {
        this.categoryName = categoryName;
        this.programming = programming;
    }

    public String getProgramming() {
        return programming;
    }

    public void setProgramming(String programming) {
        this.programming = programming;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
