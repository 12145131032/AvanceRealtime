package com.desarrollo1.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Inventario extends AppCompatActivity {

    private static final String TAGLOG = "firebase-db";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventario);
    }
    public boolean onCreateOptionsMenu(Menu menu ){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();


        if (id == R.id.opcion1) {
            Toast.makeText(this, "Se presionó la opción Lista de productos", Toast.LENGTH_LONG).show();
            Intent i = new Intent(Inventario.this, ListadeProductos.class);
            startActivity(i);
        }
        if (id == R.id.opcion2) {
            Toast.makeText(this, "Se presionó la opción Ventas", Toast.LENGTH_LONG).show();
            Intent i = new Intent(Inventario.this, Ventas.class);
            startActivity(i);
        }
        if (id == R.id.opcion3) {
            Toast.makeText(this, "Se presionó la opción Compras", Toast.LENGTH_LONG).show();
            Intent i = new Intent(Inventario.this, Compras.class);
            startActivity(i);
        }
        if (id == R.id.opcion4) {
               Intent i = new Intent(Inventario.this, LoginActivity.class);
            startActivity(i);
            Toast.makeText(this, "Sesion Cerrada", Toast.LENGTH_LONG).show();

        }        return super.onOptionsItemSelected(item);
    }

}
