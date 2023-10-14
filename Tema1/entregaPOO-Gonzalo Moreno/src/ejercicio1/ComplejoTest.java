package ejercicio1;
// Clase ComplejoTest que contiene el método principal para probar la clase Complejo
public class ComplejoTest {
  public static void main(String[] args) {
    // Creamos tres instancias de la clase Complejo
    Complejo c1 = new Complejo(2, 3); // Un complejo con parte real 2 y parte imaginaria 3
    Complejo c2 = new Complejo(4, -1); // Un complejo con parte real 4 y parte imaginaria -1
    Complejo c3 = new Complejo(); // Un complejo con parte real e imaginaria cero

    // Imprimimos los tres complejos
    System.out.println("El primer complejo es:");
    c1.imprimir();
    System.out.println("El segundo complejo es:");
    c2.imprimir();
    System.out.println("El tercer complejo es:");
    c3.imprimir();

    // Asignamos al tercer complejo la suma de los dos primeros
    c3.asignar(c1.sumar(c1, c2).dPReal, c1.sumar(c1, c2).dPImag);

    // Imprimimos el resultado de la suma
    System.out.println("La suma de los dos primeros complejos es:");
    c3.imprimir();
  }
}
