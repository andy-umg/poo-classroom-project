/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo.classroom.project;

/**
 *
 * @author Andy Macnab
 */
public class CalculadorDePrecioPorCategoria implements CalculadorDePrecio {
    private Categoria categoria;

    public CalculadorDePrecioPorCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public double calcularPrecioTotal(Producto[] productos) {
        double total = 0;
        for (Producto producto : productos) {
            for (Producto prodCat : categoria.getProductos()) {
                if (producto.equals(prodCat)) {
                    total += producto.getPrecio() * producto.getCantidad();
                }
            }
        }
        return total;
    }
    
}
