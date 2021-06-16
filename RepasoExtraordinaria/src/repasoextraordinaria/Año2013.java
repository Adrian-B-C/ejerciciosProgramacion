/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoextraordinaria;

import java.util.Scanner;

/**
 *
 * @author abalague
 */
public class Año2013 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 0;
        int contador = 0;
        System.out.println("Introduce casos a comprobar");
        int casos = 0;
        casos = s.nextInt();
        while (i <= casos) {
            System.out.println("Introduce año");
            int año = s.nextInt();

            String años = Integer.toString(año);
            for (int j = 0; j < años.length() - 1; j++) {
                while (!(años.charAt(j) == años.charAt(j + 1))) {
                    año--;
                    años = Integer.toString(año);
                    contador += 1;
                }
//                 while (!(años.charAt(j) == años.charAt(j + 1))) {
//                    año ++;
//                    contador += 1;
//                  años = Integer.toString(año);}

                años = Integer.toString(año);
                System.out.println(años + " " + contador);
                i++;
            }
        }
    }
}
