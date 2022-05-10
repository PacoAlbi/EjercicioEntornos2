package Clase;

public class Producto {

    private String descripcion;
    private double precio;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) throws Exception {
        if (descripcion.length()<1 || descripcion.length()>50){
            throw new Exception(
                    String.format("El tamaño no está en el rango permitido. Mínimo 1 máximo 50 y tiene %d", descripcion.length())
            );
        }
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) throws Exception {
        if (precio<=0){
            throw new Exception(
                    String.format("El precio tiene que ser mayor que 0.0 y es %f", precio));
        }
        this.precio = precio;
    }

    public Producto(String descripcion, double precio) throws Exception {
        setDescripcion(descripcion);
        setPrecio(precio);
    }
}
