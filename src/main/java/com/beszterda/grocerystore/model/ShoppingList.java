package com.beszterda.grocerystore.model;

import java.util.HashMap;

public class ShoppingList {
  private HashMap<String, Integer> products;

  public ShoppingList() {
    this.products = new HashMap<>();
  }

  public HashMap<String, Integer> getProducts() {
    return products;
  }
}
