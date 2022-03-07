package com.desarrollo1.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class Producto extends AppCompatActivity {
private EditText meditTextMensaje;
    private EditText meditTextpProducto;
    private EditText meditTextSTOCK;
    private EditText meditTextP;
    private EditText meditTextPrecioVenta;
    private Button mbtnGuardar;
private Button mbtnEliminar;
    private Button mbtnRegresar1;
private Button mntnActualizar;

    private DatabaseReference mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto);

        meditTextMensaje=(EditText) findViewById(R.id.editTextMensaje);
        meditTextpProducto=(EditText) findViewById(R.id.editTextpProducto);
        meditTextSTOCK=(EditText) findViewById(R.id.editTextSTOCK);
        meditTextP=(EditText) findViewById(R.id.editTextP);
        meditTextPrecioVenta=(EditText) findViewById(R.id.editTextPrecioVenta);

        mbtnGuardar=(Button) findViewById(R.id.btnGuardar);
        mbtnEliminar=(Button) findViewById(R.id.btnEliminar);
        mbtnRegresar1 = (Button) findViewById(R.id.btnRegresar1);
        mntnActualizar=(Button) findViewById(R.id.ntnActualizar);

        mDatabase = FirebaseDatabase.getInstance().getReference();
        mbtnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // String mensaje = meditTextMensaje.getText().toString();
                 // mDatabase.child("Productod").setValue(mensaje);


                Map<String, Object> personaMap =new HashMap<>();
                personaMap.put( "codigo", ""+meditTextMensaje.getText().toString());
                personaMap.put( "Nombre producto", ""+meditTextpProducto.getText().toString());
                personaMap.put( "Stock", ""+ meditTextSTOCK.getText().toString());
                personaMap.put( "precio costo", ""+ meditTextP.getText().toString());
                personaMap.put( "precio venta", ""+ meditTextPrecioVenta.getText().toString());

                mDatabase.child("Producto").setValue(personaMap);
             //   mDatabase.child("Usuario").child("Administrador").push().setValue(personaMap);

            }
        });
        mntnActualizar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                // String mensaje = meditTextMensaje.getText().toString();
                // mDatabase.child("Productod").setValue(mensaje);


                Map<String, Object> personaMap =new HashMap<>();
                  personaMap.put( "codigo", ""+meditTextMensaje.getText().toString());
                personaMap.put( "Nombre producto", ""+meditTextpProducto.getText().toString());
                personaMap.put( "Stock", ""+ meditTextSTOCK.getText().toString());
                personaMap.put( "precio costo", ""+ meditTextP.getText().toString());
                personaMap.put( "precio venta", ""+ meditTextPrecioVenta.getText().toString());

                mDatabase.child("Producto").setValue(personaMap);
                mDatabase.child("Usuario").child("Administrador").push().setValue(personaMap);

            }
        });
        mbtnEliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDatabase.child("Producto").child("codigo").removeValue();
            }
            //ESTE SIRVE PARA ELIMINAR DE UN NODO REALTIME EN ESTE CASO DEL NODO PERSONA UN ATRIBUTO NOMBRE
         //    mbtnEliminar.setOnClickListener(new View.OnClickListener() {
          //      @Override
         //       public void onClick(View v) {
          //          mDatabase.child("Persona").child("Nombre").removeValue();
              //  }
        });

    }
    public void regresar1(){
        Intent i=new Intent (this,LoginActivity.class);
        startActivity(i);

    }
}