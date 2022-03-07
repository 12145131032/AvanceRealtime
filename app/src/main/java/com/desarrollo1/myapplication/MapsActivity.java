package com.desarrollo1.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MapsActivity extends AppCompatActivity {
    private Button btnRegresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        btnRegresar=(Button) findViewById(R.id.btnRegresar);
        btnRegresar.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                regresar();
            }
        });
    }
    public void regresar(){
        Intent i=new Intent (this,LoginActivity.class);
        startActivity(i);

    }
        }
