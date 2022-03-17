package com.beszterda.grocerystore.controller;

import com.beszterda.grocerystore.model.Person;
import com.beszterda.grocerystore.model.Product;
import com.beszterda.grocerystore.model.Shop;
import com.beszterda.grocerystore.model.ShopInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/shop")
public class ShopController {

  private Shop shop = ShopInitializer.initialiseShop();

  @GetMapping("")
  public Shop getShop() {
    return shop;
  }

  @GetMapping("/name")
  public String getShopName() {
    return shop.getShopName();
  }

  @GetMapping("/address")
  public String getShopAddress() {
    return shop.getShopAddress();
  }

  @GetMapping("/products")
  public List<Product> getProductsInStock() {
    return shop.getProductsInStock().values().stream().toList();
  }

  @GetMapping("/products/{productName}")
  public List<Product> getProductsByProductName(@PathVariable("productName") String productName) {
    return shop.getProductsInStock().values().stream()
        .filter(product -> product.getProductName().equalsIgnoreCase(productName))
        .toList();
  }

  @GetMapping("/products-status/{productName}")
  public List<List<String>> getProductsWithStockStatusByProductName(@PathVariable("productName") String productName) {
    List<List<String>> productsWithStatus = new ArrayList<>();
    for (Product p : shop.getProductsInStock().values()) {
      List<String> productData = new ArrayList<>();
      if (p.getProductName().equalsIgnoreCase(productName)) {
        productData.add(p.getProductName());
        productData.add(p.getBrandName());
        productData.add(p.getDescription());
        productData.add(shop.getStockStatus().get(p.getProductId()).toString());
        productsWithStatus.add(productData);
      }
    }
    return productsWithStatus;
  }

  @GetMapping("/employees")
  public List<Person> getEmployees() {
    return shop.getEmployees();
  }
}
