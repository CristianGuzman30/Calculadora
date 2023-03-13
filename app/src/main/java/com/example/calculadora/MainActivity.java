package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Metodos metodos= new Metodos();
    EditText et1, et2;
    TextView tv1, tv2;
    Button btnOperacion;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.txtPrimerNumero);
        et2 = findViewById(R.id.txtSegundoNumero);
        tv1 = findViewById(R.id.etiquetaSuma);
        tv2 = findViewById(R.id.etiquetaMultiplicacion);

        btnOperacion = findViewById(R.id.botonOperacion);
        btnOperacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             metodos.Sumar();
                metodos.Multiplicar();


            }
        });
    }
}

    class Metodos extends MainActivity{

    void Sumar(){

    };
    void Multiplicar(){

    };

    }
    class Calcular extends Metodos{

    void Sumar(){
        float n1, n2, ress;
        n1 = Float.parseFloat(et1.getText().toString());
        n2 = Float.parseFloat(et2.getText().toString());
        ress = n1 + n2;
        tv1.setText("El resultado es: " + ress);

    }

    void Multiplicar(){

        float n1, n2, resm;
        n1 = Float.parseFloat(et1.getText().toString());
        n2 = Float.parseFloat(et2.getText().toString());
        resm = n1 * n2;
        tv2.setText("El resultado es: " + resm);

    }
}

