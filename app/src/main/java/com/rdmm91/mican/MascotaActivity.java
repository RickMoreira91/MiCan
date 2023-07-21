package com.rdmm91.mican;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MascotaActivity extends AppCompatActivity {

    RecyclerView listaMascota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascota);

        listaMascota = findViewById(R.id.listaMascota);
    }
}