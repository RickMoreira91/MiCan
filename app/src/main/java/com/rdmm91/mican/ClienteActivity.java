package com.rdmm91.mican;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.widget.EditText;

public class ClienteActivity extends AppCompatActivity {

    EditText etNumeroCliente, etEstadoCliente, etNombreCliente, etApellidoCliente, etTipoDocCliente, etDireccionCliente, etTelefonoCliente, etCorreoCliente, etNumSeguroCliente, etNumCargoCliente, etSexoCliente, etFechaRegistroCliente, etFechaModCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);

        etNumeroCliente = findViewById(R.id.etNumeroCliente);
        etEstadoCliente = findViewById(R.id.etEstadoCliente);
        etNombreCliente = findViewById(R.id.etNombreCliente);
        etApellidoCliente = findViewById(R.id.etApellidoCliente);
        etTipoDocCliente = findViewById(R.id.etTipoDocCliente);
        etDireccionCliente = findViewById(R.id.etDireccionCliente);
        etTelefonoCliente = findViewById(R.id.etTelefonoCliente);
        etCorreoCliente = findViewById(R.id.etCorreoCliente);
        etNumSeguroCliente = findViewById(R.id.etNumSeguroCliente);
        etNumCargoCliente = findViewById(R.id.etNumCargoCliente);
        etSexoCliente = findViewById(R.id.etSexoCliente);
        etFechaRegistroCliente = findViewById(R.id.etFechaRegistroCliente);
        etFechaModCliente = findViewById(R.id.etFechaModCliente);

        etNumeroCliente.setInputType(InputType.TYPE_NULL);
        etEstadoCliente.setInputType(InputType.TYPE_NULL);
        etNombreCliente.setInputType(InputType.TYPE_NULL);
        etApellidoCliente.setInputType(InputType.TYPE_NULL);
        etTipoDocCliente.setInputType(InputType.TYPE_NULL);
        etDireccionCliente.setInputType(InputType.TYPE_NULL);
        etTelefonoCliente.setInputType(InputType.TYPE_NULL);
        etCorreoCliente.setInputType(InputType.TYPE_NULL);
        etNumSeguroCliente.setInputType(InputType.TYPE_NULL);
        etNumCargoCliente.setInputType(InputType.TYPE_NULL);
        etSexoCliente.setInputType(InputType.TYPE_NULL);
        etFechaRegistroCliente.setInputType(InputType.TYPE_NULL);
        etFechaModCliente.setInputType(InputType.TYPE_NULL);
    }
}