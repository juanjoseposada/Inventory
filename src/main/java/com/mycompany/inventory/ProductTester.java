/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inventory;


public class ProductTester extends Product{
    
  public static void main(String[] args) {
        // Productos creados mediante el constructor vacio
        Product product1 = new Product();
        product1.setItemNumber(1);
        product1.setName("Sacapuntas");
        product1.setQuantityInStock(21);
        product1.setPrice(1000);
        Product product2 = new Product();
        product2.setItemNumber(2);
        product2.setName("Borrador");
        product2.setQuantityInStock(19);
        product2.setPrice(1100);

        // Productos con valores para los argumentos que coinciden con los parametros del constructor
        Product product3 = new Product(3, "Block", 55, 4000);
        Product product4 = new Product(4, "Corrector", 40, 3550);
        Product product5 = new Product(5, "Lapicero", 61, 2100);
        Product product6 = new Product(6, "Cuaderno cuadricularo", 24, 6000);
        
        // Imprimir los detalles de cada producto
        System.out.println(product1);       
        System.out.println();
        System.out.println(product2);
        System.out.println();
        System.out.println(product3);
        System.out.println();
        System.out.println(product4);
        System.out.println();
        System.out.println(product5);
        System.out.println();
        System.out.println(product6);
    }
}

