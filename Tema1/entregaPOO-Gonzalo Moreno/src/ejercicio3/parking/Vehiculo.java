package ejercicio3.parking;

import java.util.Date;

public class Vehiculo {

    private String matricula; // Matrícula del vehículo
    private Date fechaInicio; // Fecha de inicio del estacionamiento
    private Date fechaFin; // Fecha de fin del estacionamiento
    
    // Constructor
    public Vehiculo(String matricula) {
        this.matricula = matricula;
        this.fechaInicio = null;
        this.fechaFin = null;
    }
    
    // Getters y setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    // Método toString()
    @Override
    public String toString() {
        return "Vehiculo [matricula=" + matricula + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + "]";
    }
}

