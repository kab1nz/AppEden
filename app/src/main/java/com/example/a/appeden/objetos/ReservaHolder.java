package com.example.a.appeden.objetos;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.a.appeden.R;

/**
 * Created by usuario on 08/03/2018.
 */

public class ReservaHolder extends RecyclerView.ViewHolder {
    private View mView;
    public ReservaHolder(View itemView) {
        super(itemView);
        mView = itemView;
    }
    public void setNombre(String nombre) {
        TextView field = (TextView) mView.findViewById(R.id.labelNombre);
        field.setText(nombre);//has visto el tutorial que te he pasado?
    }

    public void setApellido(String apellido) {
        TextView field = (TextView) mView.findViewById(R.id.labelApellido);
        field.setText(apellido);
    }

    public void setEmail(String email) {
        TextView field = (TextView) mView.findViewById(R.id.labelEmail);
        field.setText(email);
    }

    public void setFechaEntrada(String fechaE) {
        TextView field = (TextView) mView.findViewById(R.id.labelFentrada);
        field.setText(fechaE);
    }
    public void setFechaSalida(String fechaS) {
        TextView field = (TextView) mView.findViewById(R.id.labelFsalida);
        field.setText(fechaS);
    }
    public void setNhab(String nhab) {
        TextView field = (TextView) mView.findViewById(R.id.labelNhab);
        field.setText(nhab);
    }
    public void setPrecio(String precio) {
        TextView field = (TextView) mView.findViewById(R.id.labelPrecio);
        field.setText(precio);
    }
    public void setTipo(String tipo) {
        TextView field = (TextView) mView.findViewById(R.id.labelTipo);
        field.setText(tipo);
    }
}
