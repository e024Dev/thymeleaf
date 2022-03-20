package dev.esdras.pw3.thymeleaf.model;

public class Category {

    private Integer id;
    private String category;

    public Category(String category) {
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public Category setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public Category setCategory(String category) {
        this.category = category;
        return this;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", category='" + category + '\'' +
                '}';
    }
}
