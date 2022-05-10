package Test;

import Clase.Producto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class ProductoTest {

    private Producto producto;

    @Test //No es necesario esto, porque se prueba en los set.
    void getDescripcion() throws Exception {
        producto = new Producto("Café", 25.45);
        assertEquals("Café", producto.getDescripcion());
    }

    @Test
    void setDescripcionCN() throws Exception {
        assertEquals("Café",new Producto("Café",1.0).getDescripcion());
    }

    @Test
    void setDescripcionCN2() {
        boolean saltaExcepcion = false;
        try {
            producto = new Producto("", 25.45);
        } catch (Exception e){
            saltaExcepcion = true;
        }
        assertTrue(saltaExcepcion, "La excepción no ha saltado como debería.");
    }

    @Test
    void setDescripcionCN3() {
        boolean saltaExcepcion = false;
        try {
            producto = new Producto("ñaskldfgfgfgashdgñlásdiadhfgàsiñxcjhvzxjhgvñzxjklhyio<sdfyhopdhgàsiopdgh", 25.45);
        } catch (Exception e){
            saltaExcepcion = true;
        }
        assertTrue(saltaExcepcion, "La excepción no ha saltado como debería.");
    }

    @Test //No es necesario esto, porque se prueba en los set.
    void getPrecio() throws Exception {
        producto = new Producto("Café", 25.45);
        assertEquals(25.45, producto.getPrecio());
    }

    @Test
    void setPrecioCN() throws Exception {
        assertEquals(1.0,new Producto("Café",1.0).getPrecio());
    }

    @Test
    void setPrecioCN2() {
        boolean saltaExcepcion = false;
        try {
            producto = new Producto("Café", 0.0);
        } catch (Exception e){
            saltaExcepcion = true;
        }
        assertTrue(saltaExcepcion, "La excepción no ha saltado como debería.");
    }
}