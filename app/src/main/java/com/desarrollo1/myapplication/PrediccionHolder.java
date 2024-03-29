package com.desarrollo1.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class PrediccionHolder extends FirebaseRecyclerAdapter<Prediccion, PrediccionHolder.prediccionViewholder> {

public PrediccionHolder(
@NonNull FirebaseRecyclerOptions<Prediccion> options)
        {
        super(options);
        }

// Function to bind the view in Card view(here
// "person.xml") iwth data in
// model class(here "person.class")
@Override
protected void
        onBindViewHolder(@NonNull prediccionViewholder holder,
        int position, @NonNull Prediccion model)
        {

        // Add fecha from model class (here
        // "Prediccion.class")to appropriate view in Card
        // view (here "item_lista.xml")
        holder.fecha.setText("Codigo:"+(model.getFecha()));

        // Add cielo from model class (here
        // "Prediccion.class")to appropriate view in Card
        // view (here "item_lista.xml")
        holder.cielo.setText("Nombre:"+(model.getCielo()));

        // Add humedad from model class (here
        // "Prediccion.class")to appropriate view in Card
        // view (here "item_lista.xml")
        holder.humedad.setText("Stock: "+String.valueOf(model.getHumedad())+" ");
        holder.temperatura.setText("Precio venta: "+String.valueOf(model.getTemperatura())+" ");
        }

// Function to tell the class about the Card view (here
// "person.xml")in
// which the data will be shown
@NonNull
@Override
public prediccionViewholder
        onCreateViewHolder(@NonNull ViewGroup parent,
        int viewType)
        {
        View view
        = LayoutInflater.from(parent.getContext())
        .inflate(R.layout.item_lista, parent, false);
        return new prediccionViewholder(view);
        }

// Sub Class to create references of the views in Crad
// view (here "person.xml")
class prediccionViewholder
        extends RecyclerView.ViewHolder {
    TextView fecha, cielo, humedad, temperatura;
    public prediccionViewholder(@NonNull View itemView)
    {
        super(itemView);

        fecha = itemView.findViewById(R.id.lblFecha);
        cielo = itemView.findViewById(R.id.lblCielo);
        humedad = itemView.findViewById(R.id.lblHumedad);
        temperatura = itemView.findViewById(R.id.lblTemperatura);
    }
}

}


