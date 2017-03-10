/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto;

import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author Alberto pc
 */
public class MainPunto {
    
    public static void main(String[] args) {
        ArrayList<Punto> puntos = new ArrayList<>();
        Random rnd = new Random();
        int x, y;
        for (int i = 0; i < 20; i++) {
            x = rnd.nextInt()%51;
            y = rnd.nextInt()%51;
            puntos.add(new Punto(x,y));
        }
        Collections.sort(puntos);
        List<String> spuntos = puntos.stream().map(p->p.toString()).collect(Collectors.toList());
        ArrayList<String> aspuntos = new ArrayList<>(spuntos);
        System.out.println(aspuntos);
    }
}
