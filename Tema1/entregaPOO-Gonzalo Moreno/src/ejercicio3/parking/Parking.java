package ejercicio3.parking;
import java.util.Date;;

public interface Parking {

    public boolean hayPlaza();

    public void aparcaCoche(Vehiculo coche);

    public void sacaCoche(Vehiculo Coche);

    public double getFactura(Vehiculo Coche);
}