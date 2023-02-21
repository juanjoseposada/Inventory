/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventory;


public class Product {
    //Instance field declarations
    private int itemNumber;
    private String name;
    private int quantityInStock;
    private double price;
  //Este metodo es para asignar el numero de item al producto
    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }
 //Este metodo es para asignar el nombre al producto 
    public void setName(String name) {
        this.name = name;
    }
//Este metodo es para asignar la cantidad de productos en stock
    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
//Este metodo es para asignar el precio 
    public void setPrice(double price) {
        this.price = price;
    }
//Este metodo es para obetener el numero de item del producto 
    public int getItemNumber() {
        return itemNumber;
    }
//Este metodo es para obetener el nombre del producto 
    public String getName() {
        return name;
    }
//Este metodo es para la cantidad de productos en stock
    public int getQuantityInStock() {
        return quantityInStock;
    }
//Este metodo es para obetener el precio del producto 
    public double getPrice() {
        return price;
    }

    
   
      // Constructor predeterminado sin parametros para crear un objeto con valores predeterminados 
    public Product() {
    
    }

    // Constructor sobrecargado con argumentos, su objetivo es pasar argumentos especificos para inicializar las variables de instancia 
    public Product(int itemNumber, String name, int quantityInStock, double price) {
        this.itemNumber = itemNumber;
        this.name = name;
        this.quantityInStock = quantityInStock;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Item Number: " + itemNumber + "\n" +
               "Name: " + name + "\n" +
               "Quantity in stock: " + quantityInStock + "\n" +
               "Price: " + price;
    }
}
