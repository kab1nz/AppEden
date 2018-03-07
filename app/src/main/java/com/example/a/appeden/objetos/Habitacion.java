package com.example.a.appeden.objetos;

/**
 * Created by usuario on 07/03/2018.
 */

public class Habitacion {
    String nombre;
    String apellido;
    String email;
    String fechaentrada;
    String fechasalida;
    int nhabitaciones;

    public Habitacion() {
    }

    public Habitacion(String nombre, String apellido, String email, String fechaentrada, String fechasalida, int nhabitaciones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fechaentrada = fechaentrada;
        this.fechasalida = fechasalida;
        this.nhabitaciones = nhabitaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaentrada() {
        return fechaentrada;
    }

    public void setFechaentrada(String fechaentrada) {
        this.fechaentrada = fechaentrada;
    }

    public String getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(String fechasalida) {
        this.fechasalida = fechasalida;
    }

    public int getNhabitaciones() {
        return nhabitaciones;
    }

    public void setNhabitaciones(int nhabitaciones) {
        this.nhabitaciones = nhabitaciones;
    }
}
