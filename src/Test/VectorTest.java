package Test;

import Clase.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VectorTest {

    public Vector vector = new Vector(new double[]{1.0, 15.6, -60.78, 0.0, 55.14, -2.0});
    public Vector vectorNulo = new Vector(new double[0]);

    @Test
    void VectorCN1() {
        double[] datos = new double[]{1.0, 15.6, -60.78, 0.0, 55.14, -2.0};
        assertArrayEquals(new Vector(datos).vector, datos, "(0010)Error del constructor.");
    }

    @Test
    void VectorCN2() {
        double[] datos = new double[]{};
        assertArrayEquals(new Vector(datos).vector, datos, "(0020)Error del constructor.");
    }

    @Test
    void VectorNull() {
        boolean salta = false;
        try {
            new Vector(null);
        } catch (Exception e) {
            salta = true;
        }
        assertTrue(salta, "(0030)Error al saltar la excepción.");
    }

    @Test
    void duplicarValoresCN1() {
        Vector vacio = new Vector(new double[0]);
        vacio.duplicarValores();
        assertArrayEquals(vacio.vector, vectorNulo.vector, "(0040)No se han duplicado correctamente.");
    }

    @Test
    void duplicarValoresCN2() {
        Vector dobles = new Vector(new double[]{2.0, 31.2, -121.56, 0.0, 110.28, -4.0});
        vector.duplicarValores();
        assertArrayEquals(dobles.vector, vector.vector, "No se han duplicado correctamente.");
    }

    @Test
    void duplicarValoresCN3() {
        Vector uno = new Vector(new double[]{1.0});
        Vector dos =  new Vector(new double[]{2.0});
        uno.duplicarValores();
        assertArrayEquals(uno.vector, dos.vector, "No se han duplicado correctamente.");
    }

    @Test
    void obtenerMaximoCN1() throws Exception {
        assertEquals(55.14, vector.obtenerMaximo(), "Máximo no encontrado.");
    }

    @Test
    void obtenerMaximoCN2() throws Exception {
        assertNotEquals(70.0, vector.obtenerMaximo(), "Máximo encontrado.");
    }

    @Test
    void obtenerMaximoCN3() {
        boolean salta = false;
        try {
            vectorNulo.obtenerMaximo();
        } catch (Exception e) {
            salta = true;
        }
        assertTrue(salta,"La excepción no ha saltado como debiera.");
    }

    @Test
    void contieneValorCN1() {
        assertTrue(vector.contieneValor(0.0), "No se ha encontrado el valor.");
    }

    @Test
    void contieneValorCN2() {
        assertFalse(vector.contieneValor(8.0), "Se ha encontrado el valor.");
    }

    @Test
    void contieneValorCN3() {
        assertFalse(vectorNulo.contieneValor(0.0), "Se ha encontrado el valor.");
    }
}