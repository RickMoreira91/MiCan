package com.rdmm91.mican;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Calendar;

public class AgendarCitaActivity extends AppCompatActivity {

    EditText etNumCliente, etNumPaciente, etDescripcionCita, etFechaCita;
    FloatingActionButton fabGuardarCita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agendar_cita);

        etNumCliente = findViewById(R.id.etNumCliente);
        etNumPaciente = findViewById(R.id.etNumPaciente);
        etDescripcionCita = findViewById(R.id.etDescripcionCita);
        etFechaCita = findViewById(R.id.etFechaCita);
        fabGuardarCita = findViewById(R.id.fabGuardarCita);

        Calendar calendar = Calendar.getInstance();

        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);

        etFechaCita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(AgendarCitaActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        month = month+1;
                        String date = day+"/"+month+"/"+year;
                        etFechaCita.setText(date);
                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });

        fabGuardarCita.setOnClickListener(new View.OnClickListener() {
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