package com.example.arodrigu46.tallerlistview;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Esfera extends AppCompatActivity {
    private EditText radio;
    private Resources resources;
    Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfera);
        radio = (EditText) findViewById(R.id.txtRadioEsfera);
        resources=this.getResources();
    }
    public void borrar(View view){
        radio.setText("");
    }
    public boolean validar(){
        if(radio.getText().toString().equals("")){
            Toast.makeText(this,resources.getString(R.string.error1),Toast.LENGTH_SHORT).show();
            return false;
        }else{
            return true;
        }
    }
    public void calcular(View view) {
        if (validar()) {
            String rad;
            Double res;
            rad = radio.getText().toString();
            res = Double.parseDouble(rad);
            Double res2 = ((4.0*Math.PI*Math.pow(res,3))/3.0);
            AreaYVol av = new AreaYVol("Volúmen de Esfera","Radio: " + rad, String.valueOf(res2));
            av.guardar();

            in = new Intent(Esfera.this, EsferaRes.class);
            in.putExtra("respuesta", res2);
            startActivity(in);
        }
    }
}
