package ejercicio2;

public class Portatil extends Ordenador {
    // Atributo
    private double peso; // Peso en kg

    public Portatil(String string, int i, double d, double e, double f) {
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCaracteristicas() {
        return "Este es un ordenador portátil con las siguientes características:\n" +
                "- Código: " + getCodigo() + "\n" +
                "- RAM: " + getRam() + " GB\n" +
                "- CPU: " + getClass() + " GHz\n" +
                "- Precio: " + getPrecio() + " euros\n" +
                "- Peso: " + getPeso() + " kg\n";
    }

    private String getRam() {
        return null;
    }

    private String getCodigo() {
        return null;
    }

    // Método toString()
    public String toString() {
        return "Portatil{" +
                "codigo='" + getCodigo() + '\'' +
                ", ram=" + getRam() +
                ", cpu=" + getClass() +
                ", precio=" + getPrecio() +
                ", peso=" + getPeso() +
                '}';
    }

    public int getPrecio() {
        return 0;
    }
}

