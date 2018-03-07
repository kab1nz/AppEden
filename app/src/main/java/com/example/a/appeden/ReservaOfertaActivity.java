package com.example.a.appeden;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.a.appeden.basedatos.Usuarios;
import com.example.a.appeden.objetos.FireBaseReferences;
import com.example.a.appeden.objetos.Habitacion;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ReservaOfertaActivity extends AppCompatActivity {
    ImageView flecha6;
    private static final String TAG = "NewPostActivity";
    private static final String REQUIRED = "Required";

    // [START declare_database_ref]
    private DatabaseReference mDatabase;
    // [END declare_database_ref]

    private EditText etnombre,etape,ettel,etmail,etfentrada,etfsalida,etnhabi;
    private FloatingActionButton mSubmitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservaoferta);
        flecha6=findViewById(R.id.flecha9);
        etnombre=findViewById(R.id.etnombreoferta);
        etape=findViewById(R.id.etapellioferta);
        ettel=findViewById(R.id.etteleoferta);
        etmail=findViewById(R.id.etemailoferta);
        etfentrada=findViewById(R.id.etfentradaofer);
        etfsalida=findViewById(R.id.etfsalidaofer);
        etnhabi=findViewById(R.id.nhabitaciofer);
        mSubmitButton=findViewById(R.id.faboferta);
        flecha6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submitPost();
            }
        });



    }

    private void submitPost() {

        final String nombre = etnombre.getText().toString();
        final String apellido = etape.getText().toString();
        final String email = etmail.getText().toString();
        final String fechaentrada = etfentrada.getText().toString();
        final String fechasalida = etfsalida.getText().toString();
        final int nhabitaciones = Integer.parseInt(etnhabi.getText().toString());
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        //seguir por aqui ******************************
        Habitacion habitacion = new Habitacion(nombre,apellido,email,fechaentrada,fechasalida,nhabitaciones);
        DatabaseReference myRef = database.getReference(FireBaseReferences.RESERVA_REFERENCIAR);
        myRef.setValue(nombre);

    }
}
