package com.example.a.appeden.basedatos;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by usuario on 02/03/2018.
 */

public class Usuarios {
   public String nombre,apellidos,email,fechanentrada,fechasalida;
   public int nhabitaciones;
    FirebaseDatabase database = FirebaseDatabase.getInstance();

   public Usuarios(){}

    public Usuarios(String nombre, String apellidos, String email, String fechanentrada, String fechasalida, int nhabitaciones) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.fechanentrada = fechanentrada;
        this.fechasalida = fechasalida;
        this.nhabitaciones = nhabitaciones;
    }
    private void writeNewUser(String userId, String name, String email) {
        Usuarios user = new Usuarios(nombre, apellidos, email, fechanentrada, fechasalida, nhabitaciones);

    }}
