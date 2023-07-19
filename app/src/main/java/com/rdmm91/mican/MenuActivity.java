package com.rdmm91.mican;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    CardView cvCliente, cvMascota, cvEmpleado, cvCita, cvServicios, cvAntecedentes, cvEnfermedades, cvHistorial, cvVacunas, cvAjustes, cvSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        cvCliente = findViewById(R.id.cvCliente);
        cvMascota = findViewById(R.id.cvMascota);
        cvEmpleado = findViewById(R.id.cvEmpleado);
        cvCita = findViewById(R.id.cvCita);
        cvServicios = findViewById(R.id.cvServicios);
        cvAntecedentes = findViewById(R.id.cvAntecedentes);
        cvEnfermedades = findViewById(R.id.cvEnfermedades);
        cvHistorial = findViewById(R.id.cvHistorial);
        cvVacunas = findViewById(R.id.cvVacunas);
        cvAjustes = findViewById(R.id.cvAjustes);
        cvSalir = findViewById(R.id.cvSalir);

        cvCliente.setOnClickListener(this);
        cvMascota.setOnClickListener(this);
        cvEmpleado.setOnClickListener(this);
        cvCita.setOnClickListener(this);
        cvServicios.setOnClickListener(this);
        cvAntecedentes.setOnClickListener(this);
        cvEnfermedades.setOnClickListener(this);
        cvHistorial.setOnClickListener(this);
        cvVacunas.setOnClickListener(this);
        cvAjustes.setOnClickListener(this);
        cvSalir.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Intent i;

        int id = v.getId();
        if (id == R.id.cvCliente){
            i=new Intent(this,ClienteActivity.class);
            startActivity(i);
        } else if (id == R.id.cvMascota){
            i=new Intent(this,MascotaActivity.class);
            startActivity(i);
        } else if (id == R.id.cvEmpleado){
            i=new Intent(this,EmpleadoActivity.class);
            startActivity(i);
        } else if (id == R.id.cvCita){
            i=new Intent(this,CitaActivity.class);
            startActivity(i);
        } else if (id == R.id.cvServicios){
            i=new Intent(this,ServiciosActivity.class);
            startActivity(i);
        } else if (id == R.id.cvAntecedentes){
            i=new Intent(this,AntecedentesActivity.class);
            startActivity(i);
        } else if (id == R.id.cvEnfermedades){
            i=new Intent(this,EnfermedadesActivity.class);
            startActivity(i);
        } else if (id == R.id.cvHistorial){
            i=new Intent(this,HistorialActivity.class);
            startActivity(i);
        } else if (id == R.id.cvVacunas){
            i=new Intent(this,VacunasActivity.class);
            startActivity(i);
        } else if (id == R.id.cvAjustes){
            i=new Intent(this,AjustesActivity.class);
            startActivity(i);
        } else if (id == R.id.cvSalir){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("¿Desea salir de Mi Can App?")
                    .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    })
                    .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            builder.show();
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("¿Desea salir de Mi Can App?")
                    .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    })
                    .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            builder.show();
        }
        return super.onKeyDown(keyCode, event);
    }
}