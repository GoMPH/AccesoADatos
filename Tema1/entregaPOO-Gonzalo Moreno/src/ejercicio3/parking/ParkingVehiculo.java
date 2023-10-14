package ejercicio3.parking;

import java.util.ArrayList;
import java.util.Date;

public class ParkingVehiculo implements Parking {
    
    public static final double PRECIO_MINUTO = 0.0425; // Precio por minuto en euros
    public static final int MAX_PLAZAS = 100; // Máximo de plazas disponibles
    
    private String direccion; // Dirección del parking
    private int plazasOcupadas; // Número de plazas ocupadas actualmente
    private ArrayList<Vehiculo> vehiculos; // Lista de vehículos aparcados
    
    // Constructor
    public ParkingVehiculo(String direccion) {
        this.direccion = direccion;
        this.plazasOcupadas = 0;
        this.vehiculos = new ArrayList<Vehiculo>();
    }
    
    // Getters y setters
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getPlazasOcupadas() {
        return plazasOcupadas;
    }

    public void setPlazasOcupadas(int plazasOcupadas) {
        this.plazasOcupadas = plazasOcupadas;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    
    @Override
    public boolean hayPlaza() {
        return plazasOcupadas < MAX_PLAZAS;
    }
    
    @Override
    public void aparcaCoche(Vehiculo coche) {
        if (hayPlaza()) { // Si hay plaza disponible
            vehiculos.add(coche); // Añadir el coche a la lista de vehículos
            plazasOcupadas++; // Incrementar el número de plazas ocupadas
            coche.setFechaInicio(new Date()); // Asignar la fecha actual como fecha de inicio del estacionamiento
            System.out.println("El coche " + coche.getMatricula() + " ha sido aparcado en el parking " + direccion);
        } else { // Si no hay plaza disponible
            System.out.println("No hay plaza para el coche " + coche.getMatricula() + " en el parking " + direccion);
        }
        
    }
    
    @Override
    public void sacaCoche(Vehiculo coche) {
        if (vehiculos.contains(coche)) { // Si el coche está en la lista de vehículos
            vehiculos.remove(coche); // Quitar el coche de la lista de vehículos
            plazasOcupadas--; // Decrementar el número de plazas ocupadas
            coche.setFechaFin(new Date()); // Asignar la fecha actual como fecha de fin del estacionamiento
            System.out.println("El coche " + coche.getMatricula() + " ha salido del parking " + direccion);
        } else { // Si el coche no está en la lista de vehículos
            System.out.println("El coche " + coche.getMatricula() + " no está en el parking " + direccion);
        }
        
    }
    
    @Override
    public double getFactura(Vehiculo coche) {
        if (coche.getFechaInicio() != null && coche.getFechaFin() != null) { // Si el coche tiene fecha de inicio y fin
            long diferencia = coche.getFechaFin().getTime() - coche.getFechaInicio().getTime(); // Calcular la diferencia en milisegundos
            double minutos = diferencia / (1000.0 * 60.0); // Convertir la diferencia a minutos
            double importe = minutos * PRECIO_MINUTO; // Calcular el importe según el precio por minuto
            return importe; // Devolver el importe
        } else { // Si el coche no tiene fecha de inicio o fin
            return 0.0; // Devolver cero
        }
    }
}
