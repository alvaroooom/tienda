package com.miempresa.entidad;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class TiendaTest {
    private Tienda tienda;
    private Producto producto1;
    private Producto producto2;

    @BeforeEach
    void setUp() {
        tienda = new Tienda();
        producto1 = new Producto("Producto 1", 10.0);
        producto2 = new Producto("Producto 2", 20.0);
    }

    @Test
    @DisplayName("Test de Agregar Producto")
    void testAgregarProducto() {
        tienda.agregarProducto(producto1);
        List<Producto> productos = tienda.obtenerProductos();
        assertEquals(1, productos.size());
        assertEquals(producto1, productos.get(0));
    }

    @Test
    @DisplayName("Test de Obtener Productos")
    void testObtenerProductos() {
        tienda.agregarProducto(producto1);
        tienda.agregarProducto(producto2);
        List<Producto> productos = tienda.obtenerProductos();
        assertEquals(2, productos.size());
        assertTrue(productos.contains(producto1));
        assertTrue(productos.contains(producto2));
    }

    @Test
    @DisplayName("Test de Calcular el total del precio")
    void testCalcularPrecioTotal() {
        tienda.agregarProducto(producto1);
        tienda.agregarProducto(producto2);
        double total = tienda.calcularPrecioTotal();
        assertEquals(30.0, total, 0.01);
    }
}