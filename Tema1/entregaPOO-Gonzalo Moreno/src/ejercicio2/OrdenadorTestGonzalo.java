package ejercicio2;

public class OrdenadorTestGonzalo {

    public static void main(String[] args) {
        // Crear un objeto de tipo Portatil
        Portatil p1 = new Portatil("P001", 8, 2.5, 600.0, 1.5);
        System.out.println(p1.getCaracteristicas()); // Mostrar las características del portátil

        // Crear un objeto de tipo Sobremesa
        Sobremesa s1 = new Sobremesa("S001", 16, 3.0, 800.0, "Torre mediana");
        System.out.println(s1.getCaracteristicas()); // Mostrar las características del sobremesa

        // Comparar los precios de los dos ordenadores
        if (p1.getPrecio() < s1.getPrecio()) {
            System.out.println("El portátil es más barato que el sobremesa");
        } else if (p1.getPrecio() > s1.getPrecio()) {
            System.out.println("El sobremesa es más barato que el portátil");
        } else {
            System.out.println("Los dos ordenadores tienen el mismo precio");
        }

        // Mostrar los valores de los atributos de los dos ordenadores usando el método toString()
        System.out.println(p1);
        System.out.println(s1);
    }
}
