package com.example.arodrigu46.tallerlistview;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cubo extends AppCompatActivity {
    private EditText ladocubo;
    private Resources resources;
    Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubo);
        ladocubo = (EditText) findViewById(R.id.txtValorLadoCubo);
        resources=this.getResources();
    }
    public void borrar(View view){
        ladocubo.setText("");
    }
    public boolean validar(){
        if(ladocubo.getText().toString().equals("")){
            Toast.makeText(this,resources.getString(R.string.error1),Toast.LENGTH_SHORT).show();
            return false;
        }else{
            return true;
        }
    }
    public void calcular(View view){
        if(validar()){
            String ladcub;
            Double res;
            ladcub = ladocubo.getText().toString();
            res = Double.parseDouble(ladcub);
            Double res2 = Math.pow(res,3);
            AreaYVol av = new AreaYVol("Volúmen del Cubo","Lado: "+ladcub,String.valueOf(res2));
            av.guardar();

            in = new Intent(Cubo.this,CuboRes.class);
            in.putExtra("respuesta", res2);
            startActivity(in);
        }


    }
}
