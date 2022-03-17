package com.beszterda.grocerystore.model;

import java.util.ArrayList;
import java.util.HashMap;

public class Shop {

  private String shopName;
  private String shopAddress;
  private HashMap<String, Product> productsInStock;
  private HashMap<String, Integer> stockStatus;
  private ArrayList<Person> employees;


  public Shop(String shopName, String shopAddress) {
    this.shopName = shopName;
    this.shopAddress = shopAddress;
    this.productsInStock = new HashMap<>();
    this.stockStatus = new HashMap<>();
    this.employees = new ArrayList<>();
  }

  public String getShopName() {
    return shopName;
  }

  public String getShopAddress() {
    return shopAddress;
  }

  public HashMap<String, Product> getProductsInStock() {
    return productsInStock;
  }

  public HashMap<String, Integer> getStockStatus() {
    return stockStatus;
  }

  public ArrayList<Person> getEmployees() {
    return employees;
  }
}
