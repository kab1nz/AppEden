package com.example.a.appeden;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

import com.example.a.appeden.objetos.FireBaseReferences;
import com.example.a.appeden.objetos.Habitacion;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ReservaHabitacionActivity extends AppCompatActivity {
    EditText etnombre,ettel,etfentrada,etfsalida,etapellido,etnhab,etemail;
    RadioButton cbsuite,cbgeneral,cbestandar;
    FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityreservahabitacion);
        etnombre=findViewById(R.id.etnombre);
        ettel=findViewById(R.id.ettele);
        etfentrada=findViewById(R.id.etfentrada);
        etfsalida=findViewById(R.id.etfsalida);
        etapellido=findViewById(R.id.etapellio);
        etnhab=findViewById(R.id.nhabitacio);
        cbsuite=findViewById(R.id.rbsuite);
        cbgeneral=findViewById(R.id.rbgeneral);
        cbestandar=findViewById(R.id.rbEstandar);
        etemail=findViewById(R.id.etemail);
        fab=findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            submitPost();
            onBackPressed();

            }
        });

    }
    private void submitPost() {

        final String nombre = etnombre.getText().toString();
        final String apellido = etapellido.getText().toString();
        final String email = etemail.getText().toString();
        final String fechaentrada = etfentrada.getText().toString();
        final String fechasalida = etfsalida.getText().toString();
        final int nhabitaciones = Integer.valueOf(etnhab.getText().toString());
        int precio=0;
        String tipo="";

        if (cbestandar.isChecked()){
            precio=75*nhabitaciones;
            tipo="estandar";
        }
        if(cbgeneral.isChecked()){
            precio=50*nhabitaciones;
            tipo="general";

        }
        if(cbsuite.isChecked()){
            precio=150*nhabitaciones;
            tipo="suite";

        }

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        //seguir por aqui ******************************
        boolean reserva=false;
        Habitacion habitacion = new Habitacion(nombre,apellido,email,fechaentrada,fechasalida,nhabitaciones,precio,tipo,reserva);
        DatabaseReference myRef = database.getReference(FireBaseReferences.NOMBRE_REFERENCIAR);
        myRef.child(FireBaseReferences.RESERVA).push().setValue(habitacion);
    }

}
