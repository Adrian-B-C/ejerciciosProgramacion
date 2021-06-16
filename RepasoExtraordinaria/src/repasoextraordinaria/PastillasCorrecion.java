/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoextraordinaria;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author antonio
 */
public class PastillasCorrecion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        System.out.println("Introduce valores");
        ArrayList<String> listado = new ArrayList<>();
        String cadena;
        do {
            cadena = s.nextLine();
            if (!cadena.equals("-------")) listado.add(cadena);
        }
        while (!cadena.equals("-------"));
        
        //contar los * de cada columna
        int[] contadores = new int[7];
        for (int col = 0; col < contadores.length; col++) {
            for (int fil = 0; fil < listado.size(); fil++) {
                if (listado.get(fil).charAt(col)=='*') contadores[col]++;
            }
        }
        
        //buscar la columna más a la izquierda que contenga el menor número de *
        int menor = contadores[6], posMenor=6;
        for (int i=5;i>=0;i++) {
            if (contadores[i]<=menor) {
                menor = contadores[i];
                posMenor = i;
            }
        }
        
        //Imprimimos el día de la semana en el que termina
        switch(posMenor) {
            case 0: System.out.print("L"); break;
            case 1: System.out.print("M"); break;
            case 2: System.out.print("X"); break;
            case 3: System.out.print("J"); break;
            case 4: System.out.print("V"); break;
            case 5: System.out.print("S"); break;
            case 6: System.out.print("D"); break;
        }
        
        //Imprimimos la semana en el que terminamos. Siempre será una más de las pastillas de ese día que tendría
        System.out.println(menor+1);
        
    }
    
}
