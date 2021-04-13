package com.cristobal.Intent.GitHub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView txtNombre2;
    private TextView txtRut2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtNombre2=(TextView)findViewById(R.id.txtNombre2);
        txtRut2=(TextView)findViewById(R.id.txtRut2);

        String dato1=getIntent().getStringExtra("dato1");
        String dato2=getIntent().getStringExtra("dato2");

        txtNombre2.setText("hola :D "+dato1);
        txtRut2.setText(dato2);
    }

    public void Regresar(View view){
        Intent in = new Intent(this,MainActivity.class);
        startActivity(in);
    }

}