package com.example.a.appeden;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class InicioActivity extends AppCompatActivity {
    Toolbar myToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);
        myToolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(myToolbar);
        myToolbar.setTitle(R.string.toolbarTitle);
        myToolbar.setNavigationIcon(R.drawable.ic_flecha_izquierda);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case R.id.toolbar2:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


}



