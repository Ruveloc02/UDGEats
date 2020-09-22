package com.example.udgeats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class RegistroActivity extends AppCompatActivity {
    private Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_registro);

        spinner1 = (Spinner)findViewById(R.id.spinner);
        String [] opciones = {"Cliente","Vendedor"};
        ArrayAdapter<String> operacionesAdapter = new ArrayAdapter<String>(this, R.layout.spinner_item_operaciones, opciones);
        spinner1.setAdapter(operacionesAdapter);
    }

    public void BotonDePrueba(View view){
        Toast.makeText(this,"Botón de prueba presionado",Toast.LENGTH_SHORT).show();
    }
}