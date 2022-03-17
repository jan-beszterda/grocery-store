package com.beszterda.grocerystore.model;

public class ShopInitializer {

  public static Shop initialiseShop() {
    Shop shop = new Shop("Grocery Store", "5th Avenue 43259 NY");

    shop.getProductsInStock().put("FV-B-01", new Product("FV-B-01", "Banana", "Fresh Fruit Co.",
        "Ecological bananas", "Fruit", "", 4.99));
    shop.getStockStatus().put("FV-B-01", 100);
    shop.getProductsInStock().put("FV-B-02", new Product("FV-B-02", "Banana", "Best Fruits & Vegetables Co.",
        "Organic bananas", "Fruit", "", 5.99));
    shop.getStockStatus().put("FV-B-02", 50);
    shop.getProductsInStock().put("B-B-01", new Product("B-B-01", "Bread", "Local Bakery Co.",
        "Sourdough bread, loaf", "Bread", "", 2.99));
    shop.getStockStatus().put("B-B-01", 20);
    shop.getEmployees().add(new Employee("Jan", "1XXW2Z"));
    return shop;
  }
}
