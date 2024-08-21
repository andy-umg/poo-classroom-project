/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo.classroom.project;

/**
 *
 * @author Andy Macnab
 */
public class PooClassroomProject {

    public static void main(String[] args) {
        Proveedor proveedor1 = new Proveedor("Proveedor A");

        ProductoElectronico laptop = new ProductoElectronico("Laptop", 1200, 10, proveedor1, 2);
        ProductoAlimenticio manzana = new ProductoAlimenticio("Manzana", 0.5, 100, proveedor1, "20-08-2024");

        proveedor1.agregarProducto(laptop);
        proveedor1.agregarProducto(manzana);

        Categoria categoriaElectronicos = new Categoria("Electronicos");
        categoriaElectronicos.agregarProducto(laptop);

        GestorDeInventario gestor = new GestorDeInventario(new CalculadorDePrecioSinDescuento());
        Producto[] inventario = {laptop, manzana};

        System.out.println("Precio total sin descuento: " + gestor.calcularTotalInventario(inventario));

        gestor.cambiarCalculador(new CalculadorDePrecioConDescuento(0.1));
        System.out.println("Precio total con descuento: " + gestor.calcularTotalInventario(inventario));

        gestor.cambiarCalculador(new CalculadorDePrecioPorCategoria(categoriaElectronicos));
        System.out.println("Precio total de electronicos: " + gestor.calcularTotalInventario(inventario));
    }
    
}
