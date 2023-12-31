package com.rdmm91.mican;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class CitaActivity extends AppCompatActivity {

    RecyclerView listaCita;
    FloatingActionButton fabAgendarCita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cita);

        listaCita = findViewById(R.id.listaCita);
        fabAgendarCita = findViewById(R.id.fabAgendarCita);

        fabAgendarCita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CitaActivity.this, AgendarCitaActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
        if(keyCode == KeyEvent.KEYCODE_BACK) {
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}