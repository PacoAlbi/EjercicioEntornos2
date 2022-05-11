package Test;

import Clase.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VectorTest {

    public Vector vector = new Vector(new double[]{1.0, 15.6, -60.78, 0.0, 55.14, -2.0});
    public Vector vectorNulo = new Vector(new double[0]);

    @Test
    void duplicarValoresCN1() {
        Vector vacio = new Vector(new double[0]);
        vacio.duplicarValores();
        assertArrayEquals(vacio.vector, vectorNulo.vector, "No se han duplicado correctamente.");
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
    void obtenerMaximo() {


    }

    @Test
    void contieneValor() {
        double valor =
    }
}