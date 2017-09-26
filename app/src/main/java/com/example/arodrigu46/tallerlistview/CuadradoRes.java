package com.example.arodrigu46.tallerlistview;

import android.content.Intent;
import android.hardware.Camera;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class CuadradoRes extends AppCompatActivity {
    Intent in;
    TextView res;
    private ArrayList<AreaYVol> areayvol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado_res);
        res = (TextView) findViewById(R.id.lblCuadradoRes);
        Bundle datos = this.getIntent().getExtras();
        Double res2 = datos.getDouble("respuesta");
        res.setText(String.valueOf(res2));

    }

    public void volver(View view){
        in = new Intent(CuadradoRes.this,Principal.class);
        startActivity(in);
    }
}
