package com.beszterda.grocerystore.model;

public class Product {
  private String productId;
  private String productName;
  private String brandName;
  private String description;
  private String categoryName;
  private String expiryDate;
  private double price;


  public Product(String productId, String productName, String brandName, String description, String categoryName, String expiryDate, double price) {
    this.productId = productId;
    this.productName = productName;
    this.brandName = brandName;
    this.description = description;
    this.categoryName = categoryName;
    this.expiryDate = expiryDate;
    this.price = price;
  }

  public String getProductId() {
    return productId;
  }

  public String getProductName() {
    return productName;
  }

  public String getBrandName() {
    return brandName;
  }

  public String getDescription() {
    return description;
  }

  public String getCategoryName() {
    return categoryName;
  }

  public String getExpiryDate() {
    return expiryDate;
  }

  public double getPrice() {
    return price;
  }
}
