package com.miempresa.entidad;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {
    private Producto producto;

    @BeforeEach
    void setUp() {
        producto = new Producto("Laptop", 1200.50);
    }

    @Test
    void testGetPrecio() {
        assertEquals(1200.50, producto.getPrecio(), 0.01);
    }

    @Test
    void testGetNombre() {
        assertEquals("Laptop", producto.getNombre());
    }

    @Test
    void testSetNombre() {
        producto.setNombre("Tablet");
        assertEquals("Tablet", producto.getNombre());
    }

    @Test
    void testSetNombreNoDebeSerNuloNiVacio() {
        assertThrows(IllegalArgumentException.class, () -> producto.setNombre(null));
        assertThrows(IllegalArgumentException.class, () -> producto.setNombre(""));
    }

    @Test
    void testSetPrecioNoDebeSerNegativo() {
        assertThrows(IllegalArgumentException.class, () -> producto.setPrecio(-100.00));
    }
}
