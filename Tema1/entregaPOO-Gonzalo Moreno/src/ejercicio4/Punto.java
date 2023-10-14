package ejercicio4;

public class Punto {
    // Atributos
    private int x; // Coordenada x del punto
    private int y; // Coordenada y del punto
    
    // Constructor
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // Getters y setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    // Método que calcula la distancia a otro punto
    public double distancia(Punto otroPunto) {
        // Usar el teorema de Pitágoras para hallar la distancia
        double dx = otroPunto.x - this.x; // Diferencia en el eje x
        double dy = otroPunto.y - this.y; // Diferencia en el eje y
        double distancia = Math.sqrt(dx * dx + dy * dy); // Raíz cuadrada de la suma de los cuadrados
        return distancia; // Devolver la distancia
    }
    
    // Método que compara la igualdad con otro punto
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Punto) { // Si el objeto es de tipo Punto
            Punto otroPunto = (Punto) obj; // Convertir el objeto a Punto
            return this.x == otroPunto.x && this.y == otroPunto.y; // Devolver true si las coordenadas son iguales
        } else { // Si el objeto no es de tipo Punto
            return false; // Devolver false
        }
    }
}

