package com.rdmm91.mican;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class CambiarContrasenaActivity extends AppCompatActivity {

    EditText etContrasenaActual, etNuevaContrasena, etConfirmarNuevaContrasena;
    FloatingActionButton fabGuardarContrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cambiar_contrasena);

        etContrasenaActual = findViewById(R.id.etContrasenaActual);
        etNuevaContrasena = findViewById(R.id.etNuevaContrasena);
        etConfirmarNuevaContrasena = findViewById(R.id.etConfirmarNuevaContrasena);
        fabGuardarContrasena = findViewById(R.id.fabGuardarContrasena);

        fabGuardarContrasena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
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