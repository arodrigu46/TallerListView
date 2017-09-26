package com.example.arodrigu46.tallerlistview;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cilindro extends AppCompatActivity {
    private EditText altura;
    private EditText radio;
    private Resources resources;
    Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cilindro);
        altura = (EditText) findViewById(R.id.txtAlturaCilindro);
        radio = (EditText) findViewById(R.id.txtRadioCilindro);
        resources=this.getResources();

    }
    public void borrar(View view){
        altura.setText("");
        radio.setText("");
    }
    public boolean validar(){
        if(altura.getText().toString().equals("") || radio.getText().toString().equals("")){
            Toast.makeText(this,resources.getString(R.string.error1),Toast.LENGTH_SHORT).show();
            return false;
        }else{
            return true;
        }
    }

    public void calcular(View view) {
        if (validar()) {
            String alt, rad;
            Double res, res1;
            alt = altura.getText().toString();
            rad = radio.getText().toString();
            res = Double.parseDouble(alt);
            res1 = Double.parseDouble(rad);
            Double res2 = (Math.PI * (Math.pow(res1, 2) * res));
            AreaYVol av = new AreaYVol("Volúmen de Cilindro", "Altura: " + alt + "Radio: " + rad, String.valueOf(res2));
            av.guardar();

            in = new Intent(Cilindro.this, CilindroRes.class);
            in.putExtra("respuesta", res2);
            startActivity(in);
        }
    }
}
