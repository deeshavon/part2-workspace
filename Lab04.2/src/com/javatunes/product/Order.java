/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.product;

import java.util.Collection;

public class Order {
  private String id;
  
  public Order(String id) {
    this.id = id;
  }
  
  /**
   * TODO:
   * get the items from the cart and iterate over them, print each item's product code
   * get cart total and print
   */
  public void processCart(ShoppingCart<? extends Product> cart) { //this is a shopping cart of some type tha extends Product
    for (Product item : cart.allItems()) { //an iterable or array is required within the parentheses
      System.out.println(item.getCode());
    }
    System.out.println(cart.total());
  }
  
  public String getId() {
    return id;
  }
}