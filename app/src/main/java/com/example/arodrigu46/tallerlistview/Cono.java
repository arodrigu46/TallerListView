package com.example.arodrigu46.tallerlistview;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cono extends AppCompatActivity {
    private EditText base;
    private EditText altura;
    private Resources resources;
    Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cono);
        base = (EditText) findViewById(R.id.txtBaseCono);
        altura = (EditText) findViewById(R.id.txtAlturaCono);
        resources=this.getResources();
    }
    public void borrar(View view){
        base.setText("");
        altura.setText("");
    }
    public boolean validar(){
        if(base.getText().toString().equals("") || altura.getText().toString().equals("")){
            Toast.makeText(this,resources.getString(R.string.error1),Toast.LENGTH_SHORT).show();
            return false;
        }else{
            return true;
        }
    }
    public void calcular(View view) {
        if (validar()) {
            String bas,alt;
            Double res,res1;
            bas = base.getText().toString();
            alt =  altura.getText().toString();
            res = Double.parseDouble(bas);
            res1 = Double.parseDouble(alt);
            Double res2 = (((1.0/3.0)*res)*res1);
            AreaYVol av = new AreaYVol("Volúmen del Cono","Base: " + bas+"Altura: "+alt, String.valueOf(res2));
            av.guardar();

            in = new Intent(Cono.this, ConoRes.class);
            in.putExtra("respuesta", res2);
            startActivity(in);
        }
    }
}
