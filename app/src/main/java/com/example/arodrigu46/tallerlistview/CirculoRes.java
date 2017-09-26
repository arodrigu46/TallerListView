package com.example.arodrigu46.tallerlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CirculoRes extends AppCompatActivity {
    Intent in;
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo_res);
        res = (TextView) findViewById(R.id.lblCirculoRes);
        Bundle datos = this.getIntent().getExtras();
        Double res2 = datos.getDouble("respuesta");
        res.setText(String.valueOf(res2));
    }
    public void volver(View view){
        in = new Intent(CirculoRes.this,Principal.class);
        startActivity(in);
    }
}
