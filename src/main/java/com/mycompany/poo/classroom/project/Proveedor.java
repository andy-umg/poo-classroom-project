/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo.classroom.project;

/**
 *
 * @author Andy Macnab
 */
public class Proveedor {
    private String nombre;
    private Producto[] productos;
    private int numProductos;

    public Proveedor(String nombre) {
        this.nombre = nombre;
        this.productos = new Producto[100]; // Tamaño fijo arbitrario
        this.numProductos = 0;
    }

    public void agregarProducto(Producto producto) {
        if (numProductos < productos.length) {
            productos[numProductos++] = producto;
        }
    }

    public Producto[] getProductos() {
        Producto[] productosActuales = new Producto[numProductos];
        for (int i = 0; i < numProductos; i++) {
            productosActuales[i] = productos[i];
        }
        return productosActuales;
    }

    public String getNombre() {
        return nombre;
    }
    
}
