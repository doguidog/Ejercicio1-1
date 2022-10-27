package com.example.ejercicio1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView vista;
    EditText txtnumero1,txtnumero2;
    Button btnsuma,btnresta,btndivision,btnmultiplicacion;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        casteo();


        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intencion = new Intent(getApplicationContext(),MainActivity2.class);
                Integer resultado = suma(Integer.parseInt(txtnumero1.getText().toString()),Integer.parseInt(txtnumero2.getText().toString()));
                vista.setText("La suma es: "+resultado);
                intencion.putExtra("operacion",vista.getText().toString());

                startActivity(intencion);
            }
        });


        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intencion = new Intent(getApplicationContext(),MainActivity2.class);
                    Integer resultado = resta(Integer.parseInt(txtnumero1.getText().toString()),Integer.parseInt(txtnumero2.getText().toString()));
                    vista.setText("La resta es: "+resultado);
                    intencion.putExtra("operacion",vista.getText().toString());

                    startActivity(intencion);
            }
        });


        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intencion = new Intent(getApplicationContext(),MainActivity2.class);
                Integer resultado = division(Integer.parseInt(txtnumero1.getText().toString()),Integer.parseInt(txtnumero2.getText().toString()));
                vista.setText("La division es: "+resultado);
                intencion.putExtra("operacion",vista.getText().toString());

                startActivity(intencion);

            }
        });


        btnmultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intencion = new Intent(getApplicationContext(),MainActivity2.class);
                Integer resultado = multiplicacion(Integer.parseInt(txtnumero1.getText().toString()),Integer.parseInt(txtnumero2.getText().toString()));
                vista.setText("La multiplicacion es: "+resultado);
                intencion.putExtra("operacion",vista.getText().toString());

                startActivity(intencion);

            }
        });

    }



    //Metodos de operaciones
    public int suma(int a,int b) {
        return a + b;
    }

    public int resta(int a,int b) {
        return a - b;
    }

    public int division(int a,int b) {
        return a / b;
    }

    public int multiplicacion(int a,int b) {
        return a * b;
    }

    //Metodos genericos
    private void casteo(){
        txtnumero1 = (EditText) findViewById(R.id.txtnumero1);
        txtnumero2 = (EditText) findViewById(R.id.txtnumero2);
        vista = (TextView) findViewById(R.id.vista);
        btnsuma = (Button) findViewById(R.id.btnsuma);
        btnresta = (Button) findViewById(R.id.btnresta);
        btndivision = (Button) findViewById(R.id.btndivision);
        btnmultiplicacion = (Button) findViewById(R.id.btnmultiplicacion);
    }

}