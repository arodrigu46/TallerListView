package com.example.arodrigu46.tallerlistview;

import java.util.ArrayList;

/**
 * Created by arodrigu46 on 26/09/2017.
 */

public class Datos {
    private static ArrayList<AreaYVol> areayvol = new ArrayList<>();
    public static void guardar(AreaYVol av){
        areayvol.add(av);
    }
    public static ArrayList<AreaYVol> obtener(){
        return areayvol;
    }
}
