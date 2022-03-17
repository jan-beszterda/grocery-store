package com.beszterda.grocerystore.controller;

import com.beszterda.grocerystore.model.Customer;
import com.beszterda.grocerystore.model.CustomerInitializer;
import com.beszterda.grocerystore.model.ShoppingList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

  private Customer customer = CustomerInitializer.initialiseCustomer();

  @GetMapping("/name")
  public String getCustomerName() {
    return customer.getName();
  }

  @GetMapping("/age")
  public int getCustomerAge() {
    return customer.getAge();
  }

  @GetMapping("")
  public Customer getCustomer() {
    return customer;
  }

  @GetMapping("/shopping-list")
  public ShoppingList getShoppingList() {
    return customer.getShoppingList();
  }
}
