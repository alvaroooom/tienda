package com.miempresa.entidad;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProductoTest {
    private Producto producto;

    @BeforeEach
    void setUp() {
        producto = new Producto("Laptop", 1200.50);
    }

    @Test
    @DisplayName("Prueba de obtener el precio")
    void testGetPrecio() {
        assertEquals(1200.50, producto.getPrecio(), 0.01);
    }

    @Test
    @DisplayName("Prueba de obtener el nombre")
    void testGetNombre() {
        assertEquals("Laptop", producto.getNombre());
    }

    @Test
    @DisplayName("Prueba de Setear el nombre")
    void testSetNombre() {
        producto.setNombre("Tablet");
        assertEquals("Tablet", producto.getNombre());
    }

    @Test
    @DisplayName("Prueba Excepcion de SetPrecio")
    void testSetPrecioNoDebeSerNegativo() {
        assertThrows(IllegalArgumentException.class, () -> producto.setPrecio(-100.00));
    }
}
