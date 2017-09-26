package com.example.arodrigu46.tallerlistview;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cuadrado extends AppCompatActivity {
    private EditText ladocuadrado;
    private Resources resources;
    Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);
        ladocuadrado = (EditText) findViewById(R.id.txtLadoCuadrado);
        resources=this.getResources();
    }

    public void borrar(View view){
        ladocuadrado.setText("");
    }
    public boolean validar(){
        if(ladocuadrado.getText().toString().equals("")){
            Toast.makeText(this,resources.getString(R.string.error1),Toast.LENGTH_SHORT).show();
            return false;
        }else{
            return true;
        }
    }
    public void calcular(View view){
        if(validar()){
            String ladcuad;
            Double res;
            ladcuad = ladocuadrado.getText().toString();
            res = Double.parseDouble(ladcuad);
            Double res2 = Math.pow(res,2);
            AreaYVol av = new AreaYVol("Area del Cuadrado","Lado: "+ladcuad,String.valueOf(res2));
            av.guardar();

            in = new Intent(Cuadrado.this,CuadradoRes.class);
            in.putExtra("respuesta", res2);
            startActivity(in);
        }


    }
}
