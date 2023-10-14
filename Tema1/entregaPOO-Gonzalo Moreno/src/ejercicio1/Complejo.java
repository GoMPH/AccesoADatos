package ejercicio1;
// Clase Complejo que representa un número complejo
public class Complejo {
  // Atributos de la clase
  double dPReal; // Parte real de tipo double
  double dPImag; // Parte imaginaria de tipo double

  // Constructor por defecto que crea un complejo con parte real e imaginaria cero
  public Complejo() {
    this.dPReal = 0;
    this.dPImag = 0;
  }

  // Constructor parametrizado que crea un complejo con la parte real e imaginaria dadas
  public Complejo(double dPReal, double dPImag) {
    this.dPReal = dPReal;
    this.dPImag = dPImag;
  }

  // Método que asigna la parte real e imaginaria a un complejo
  public void asignar(double x, double y) {
    this.dPReal = x;
    this.dPImag = y;
  }

  // Método que suma dos números complejos y devuelve el resultado como otro complejo
  public Complejo sumar(Complejo c1, Complejo c2) {
    Complejo c3 = new Complejo(); // Creamos un nuevo complejo para almacenar el resultado
    c3.dPReal = c1.dPReal + c2.dPReal; // Sumamos las partes reales de los dos complejos
    c3.dPImag = c1.dPImag + c2.dPImag; // Sumamos las partes imaginarias de los dos complejos
    return c3; // Devolvemos el complejo resultante
  }

  // Método que imprime un número complejo en la forma a + bi
  public void imprimir() {
    System.out.println(this.dPReal + " + " + this.dPImag + "i");
  }
}
