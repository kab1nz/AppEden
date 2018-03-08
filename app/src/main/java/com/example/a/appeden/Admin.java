package com.example.a.appeden;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.a.appeden.objetos.Habitacion;
import com.example.a.appeden.objetos.ReservaHolder;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Admin extends AppCompatActivity {
    private static final String TAGLOG = "firebase-db ->";
    TextView labelNombre,labelApellido,labelEmail,labelNhab,labelNfechaentrada,labelNFsalida,labelTipo,labelPrecio;
    FirebaseRecyclerAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainadmin);
      /*
        labelNombre=findViewById(R.id.labelNombre);
        labelApellido=findViewById(R.id.labelApellido);
        labelEmail=findViewById(R.id.labelEmail);
        labelNhab=findViewById(R.id.labelNhab);
        labelNfechaentrada=findViewById(R.id.labelFentrada);
        labelNFsalida=findViewById(R.id.labelFsalida);
        labelTipo=findViewById(R.id.labelTipo);
        labelPrecio=findViewById(R.id.labelPrecio);

        DatabaseReference reserva = FirebaseDatabase.getInstance().getReference().child("eden").child("reserva");
        reserva.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                labelNombre.setText(dataSnapshot.child("nombre").getValue().toString());
                labelApellido.setText(dataSnapshot.child("apellido").getValue().toString());
                labelEmail.setText(dataSnapshot.child("email").getValue().toString());
                labelNhab.setText(dataSnapshot.child("nhabitaciones").getValue().toString());
                labelNfechaentrada.setText(dataSnapshot.child("fechaentrada").getValue().toString());
                labelNFsalida.setText(dataSnapshot.child("fechasalida").getValue().toString());
                labelTipo.setText(dataSnapshot.child("tipo").getValue().toString());
                labelPrecio.setText(dataSnapshot.child("precio").getValue().toString());





            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.e(TAGLOG, "Error!", databaseError.toException());

            }
        });
        */

        DatabaseReference reserva = FirebaseDatabase.getInstance().getReference().child("eden").child("reserva");
        ;//se posiciona en el nodo

        RecyclerView recycler = (RecyclerView) findViewById(R.id.listaReservas);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(this));

        mAdapter =
            new FirebaseRecyclerAdapter<Habitacion, ReservaHolder>(
                Habitacion.class, R.layout.activity_item, ReservaHolder.class, reserva) {

                @Override
                protected void populateViewHolder(ReservaHolder viewHolder, Habitacion model, int position) {
                    viewHolder.setNombre(model.getNombre());
                    viewHolder.setApellido(model.getApellido());
                    viewHolder.setEmail(model.getEmail());
                    viewHolder.setFechaEntrada(model.getFechaentrada());
                    viewHolder.setFechaSalida(model.getFechaentrada());
                    viewHolder.setNhab(String.valueOf(model.getNhabitaciones()));
                    viewHolder.setPrecio(String.valueOf(model.getPrecio()));
                    viewHolder.setTipo(String.valueOf(model.getTipo()));

                }


            };

        recycler.setAdapter(mAdapter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mAdapter.cleanup();
    }
}
