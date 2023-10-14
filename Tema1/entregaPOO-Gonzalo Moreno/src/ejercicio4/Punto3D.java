package ejercicio4;

public class Punto3D extends Punto {
    // Atributo
    private int z; // Coordenada z del punto
    
    // Constructor
    public Punto3D(int x, int y, int z) {
        super(x, y); // Llamada al constructor de la superclase
        this.z = z;
    }
    
    // Getter y setter
    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    
    // Método que calcula la distancia a otro punto 3D
    @Override
    public double distancia(Punto otroPunto) {
        if (otroPunto instanceof Punto3D) { // Si el otro punto es de tipo Punto3D
            Punto3D otroPunto3D = (Punto3D) otroPunto; // Convertir el otro punto a Punto3D
            // Usar el teorema de Pitágoras para hallar la distancia en tres dimensiones
            double dx = otroPunto3D.getX() - this.getX(); // Diferencia en el eje x
            double dy = otroPunto3D.getY() - this.getY(); // Diferencia en el eje y
            double dz = otroPunto3D.getZ() - this.z; // Diferencia en el eje z
            double distancia = Math.sqrt(dx * dx + dy * dy + dz * dz); // Raíz cuadrada de la suma de los cuadrados
            return distancia; // Devolver la distancia
        } else { // Si el otro punto no es de tipo Punto3D
            return super.distancia(otroPunto); // Llamar al método de la superclase para calcular la distancia en dos dimensiones
        }
        
    }
    
    // Método que compara la igualdad con otro punto 3D
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Punto3D) { // Si el objeto es de tipo Punto3D
            Punto3D otroPunto3D = (Punto3D) obj; // Convertir el objeto a Punto3D
            return super.equals(otroPunto3D) && this.z == otroPunto3D.z; // Devolver true si las coordenadas son iguales, usando el método de la superclase para comparar x e y
        } else { // Si el objeto no es de tipo Punto3D
            return false; // Devolver false
        }
    }
}

