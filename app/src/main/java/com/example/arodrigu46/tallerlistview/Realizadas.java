package com.example.arodrigu46.tallerlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Realizadas extends AppCompatActivity {
    private TableLayout tabla;
    private ArrayList<AreaYVol> ayvol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realizadas);
        tabla=(TableLayout) findViewById(R.id.tabla);
        ayvol = Datos.obtener();
        for (int i = 0; i < ayvol.size() ; i++) {
            TableRow fila = new TableRow(this);
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);
            c1.setText("" + (i + 1));
            c2.setText("" + ayvol.get(i).getOperacion());
            c3.setText("" + ayvol.get(i).getDatos());
            c4.setText("" + ayvol.get(i).getRes());

            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);
            tabla.addView(fila);
        }
    }
}
