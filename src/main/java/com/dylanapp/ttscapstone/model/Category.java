package com.dylanapp.ttscapstone.model;

import javax.persistence.*;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoryid")
    private int categoryid;

    @Column(name = "categoryname")
    private String categoryname;

    public Category() {
    }

    public Category( String categoryName) {
        this.categoryname = categoryName;
    }

    public int getCategoryId() {
        return categoryid;
    }

    public void setCategoryId(int categoryId) {
        this.categoryid = categoryId;
    }

    public String getCategoryName() {
        return categoryname;
    }

    public void setCategoryName(String categoryName) {
        this.categoryname = categoryName;
    }
}
