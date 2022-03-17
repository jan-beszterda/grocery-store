package com.beszterda.grocerystore.model;

public class CustomerInitializer {

  public static Customer initialiseCustomer() {
    Customer customer = new Customer("Sofia", 33);
    customer.getShoppingList().getProducts().put("Banana", 2);
    customer.getShoppingList().getProducts().put("Bread", 1);

    return customer;
  }
}
