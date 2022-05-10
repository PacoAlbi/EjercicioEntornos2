package Clase;

public class Producto {

    private String descripcion;
    private double precio;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) throws Exception {
        if (descripcion.length()<1 || descripcion.length()>50){
            throw new Exception("El tamaño no está en el rango permitido. Mínimo 1 máximo 50."){};
        }
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) throws Exception {
        if (precio<=0){
            throw new Exception("El precio tiene que ser mayor que 0.0"){};
        }
        this.precio = precio;
    }

    public Producto(String descripcion, double precio) throws Exception {
        setDescripcion(descripcion);
        setPrecio(precio);
    }
}
