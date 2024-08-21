/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo.classroom.project;

/**
 *
 * @author Andy Macnab
 */
public class GestorDeDescuentos {
    public void aplicarDescuento(Descuento descuento, Producto[] productos) {
        for (Producto producto : productos) {
            double nuevoPrecio = descuento.aplicarDescuento(producto);
            System.out.println("Nuevo precio del producto " + producto.nombre + ": " + nuevoPrecio);
        }
    }
}
