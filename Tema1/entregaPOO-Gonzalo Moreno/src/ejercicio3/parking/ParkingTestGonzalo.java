package ejercicio3.parking;

public class ParkingTestGonzalo {

    public static void main(String[] args) throws InterruptedException {
        // Crear cinco vehículos con distintas matrículas
        Vehiculo v1 = new Vehiculo("ABC-123");
        Vehiculo v2 = new Vehiculo("DEF-456");
        Vehiculo v3 = new Vehiculo("GHI-789");
        Vehiculo v4 = new Vehiculo("JKL-012");
        Vehiculo v5 = new Vehiculo("MNO-345");
        
        // Crear un parking con una dirección
        ParkingVehiculo p1 = new ParkingVehiculo("Calle Falsa 123");
        
        // Aparcar los cinco vehículos en el parking
        p1.aparcaCoche(v1);
        p1.aparcaCoche(v2);
        p1.aparcaCoche(v3);
        p1.aparcaCoche(v4);
        p1.aparcaCoche(v5);
        
        // Esperar unos segundos para simular el tiempo de estacionamiento
        Thread.sleep(5000);
        
        // Sacar los cinco vehículos del parking
        p1.sacaCoche(v1);
        p1.sacaCoche(v2);
        p1.sacaCoche(v3);
        p1.sacaCoche(v4);
        p1.sacaCoche(v5);
        
        // Calcular y mostrar la factura de cada vehículo
        System.out.println("La factura del coche " + v1.getMatricula() + " es " + p1.getFactura(v1) + " euros");
        System.out.println("La factura del coche " + v2.getMatricula() + " es " + p1.getFactura(v2) + " euros");
        System.out.println("La factura del coche " + v3.getMatricula() + " es " + p1.getFactura(v3) + " euros");
    }
}
