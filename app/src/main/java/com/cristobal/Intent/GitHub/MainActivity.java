package com.cristobal.Intent.GitHub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtNombre;
    private EditText txtRut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = (EditText) findViewById(R.id.txtNombre);
        txtRut = (EditText) findViewById(R.id.txtRut);
    }

    //Método para enviar
    public void EnviarDatos(View view){
        Intent in = new Intent(this, MainActivity2.class);
        in.putExtra("dato1",txtNombre.getText().toString());
        in.putExtra("dato2",txtRut.getText().toString());
        startActivity(in);
    }
}