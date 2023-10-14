package ejercicio4;

import java.time.LocalDateTime;

public class Suceso extends Punto3D {
    // Atributos
    private LocalDateTime tiempo; // Tiempo del suceso
    private String descripcion; // Descripción del suceso
    
    // Constructor
    public Suceso(int x, int y, int z, LocalDateTime tiempo, String descripcion) {
        super(x, y, z); // Llamada al constructor de la superclase
        this.tiempo = tiempo;
        this.descripcion = descripcion;
    }
    
    // Getters y setters
    public LocalDateTime getTiempo() {
        return tiempo;
    }

    public void setTiempo(LocalDateTime tiempo) {
        this.tiempo = tiempo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    // Método que compara la igualdad con otro suceso
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Suceso) { // Si el objeto es de tipo Suceso
            Suceso otroSuceso = (Suceso) obj; // Convertir el objeto a Suceso
            return super.equals(otroSuceso) && this.tiempo.equals(otroSuceso.tiempo) && this.descripcion.equals(otroSuceso.descripcion); // Devolver true si las coordenadas, el tiempo y la descripción son iguales, usando el método de la superclase para comparar x, y y z
        } else { // Si el objeto no es de tipo Suceso
            return false; // Devolver false
        }
    }
}

