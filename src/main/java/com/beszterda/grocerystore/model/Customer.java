package com.beszterda.grocerystore.model;

public class Customer extends Person {
  private int age;
  private ShoppingList shoppingList;

  public Customer(String name, int age) {
    super(name);
    this.age = age;
    this.shoppingList = new ShoppingList();
  }

  public int getAge() {
    return age;
  }

  public ShoppingList getShoppingList() {
    return shoppingList;
  }
}
