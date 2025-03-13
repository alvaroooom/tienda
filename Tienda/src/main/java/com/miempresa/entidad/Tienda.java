package com.miempresa.entidad;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase Tienda representa una tienda que contiene una lista de productos.
 * Proporciona métodos para agregar productos, obtener la lista de productos
 * y calcular el precio total de todos los productos en la tienda.
 */
public class Tienda {
    private List<Producto> productos;

    /**
     * Constructor de la clase Tienda.
     * Inicializa una lista de productos.
     */
    public Tienda() {
        this.productos = new ArrayList<>();
    }

    /**
     * Agrega un producto a la tienda.
     * @param p Producto a agregar.
     */
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    /**
     * Obtiene la lista de productos de la tienda.
     * @return Una nueva lista con los productos actuales en la tienda.
     */
    public List<Producto> obtenerProductos() {
        return new ArrayList<>(productos);
    }

    /**
     * Calcula el precio total de todos los productos en la tienda.
     * @return La suma de los precios de todos los productos.
     */
    public double calcularPrecioTotal() {
        return productos.stream().mapToDouble(Producto::getPrecio).sum();
    }
}