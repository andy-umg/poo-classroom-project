/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo.classroom.project;

/**
 *
 * @author Andy Macnab
 */
public class GestorDeInventario {
    private CalculadorDePrecio calculadorDePrecio;

    public GestorDeInventario(CalculadorDePrecio calculadorDePrecio) {
        this.calculadorDePrecio = calculadorDePrecio;
    }

    public double calcularTotalInventario(Producto[] productos) {
        return calculadorDePrecio.calcularPrecioTotal(productos);
    }

    public void cambiarCalculador(CalculadorDePrecio nuevoCalculador) {
        this.calculadorDePrecio = nuevoCalculador;
    }
}
