package com.example.a.appeden.objetos;

/**
 * Created by usuario on 07/03/2018.
 */

public class Habitacion {
    boolean reserva=false;
    String nombre;
    String apellido;
    String email;
    String fechaentrada;
    String fechasalida;
    int nhabitaciones;
    int precio;
    String tipo;


    public Habitacion() {
    }

    public Habitacion(String nombre, String apellido, String email, String fechaentrada, String fechasalida, int nhabitaciones, int precio, String tipo,boolean reserva) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fechaentrada = fechaentrada;
        this.fechasalida = fechasalida;
        this.nhabitaciones = nhabitaciones;
        this.precio = precio;
        this.tipo = tipo;
        this.reserva=reserva;
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isReserva() {
        return reserva;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        return "Prediccion{" +
            "Nombre='" + nombre + '\'' +
            ", Apellido='" + apellido + '\'' +
            ", Email=" + email +
            ", FechaEntrada=" + fechaentrada +
            ", FechaSalida=" + fechasalida +
            ", Precio=" + precio +
            ", NºHabitaciones=" + nhabitaciones +
            ", Tipo=" + tipo +
            '}';
    }
}
