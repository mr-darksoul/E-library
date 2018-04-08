package com.example.manav.e_library.Utility;

/**
 * Created by manav on 4/1/18.
 */

public class Book {
    private String name;
    private String author;
    private String category;
    private String Department;
    private double price;

    public Book() {
    }

    public Book(String name, String author, String category, String department, double price) {
        this.name = name;
        this.author = author;
        this.category = category;
        Department = department;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
