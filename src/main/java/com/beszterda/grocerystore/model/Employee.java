package com.beszterda.grocerystore.model;

public class Employee extends Person {
  private String id;

  public Employee(String name, String id) {
    super(name);
    this.id = id;
  }

  public String getId() {
    return id;
  }
}
