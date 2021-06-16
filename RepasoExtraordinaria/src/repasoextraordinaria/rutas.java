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
public class rutas {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ruta = s.nextInt();
        while (ruta > 0) {
            System.out.println("Introduce numero de etapas mayor que 0 y menor que 100");
            int etapas = s.nextInt();

            System.out.println("Introduce km de las etapas mayor que 0 y menor o igual que 100");
            int distancia = s.nextInt();

            while (etapas < 0 || etapas > 100 || distancia < 0 || distancia > 100) {
                System.out.println("Introduce numero de etapas mayor que 0 y menor que 100");
                etapas = s.nextInt();
                
                System.out.println("Introduce km de las etapas mayor que 0 y menor o igual que 100");
                distancia = s.nextInt();
            }

            ruta = ruta - (etapas * distancia);
            System.out.println("Quedan " + ruta + " km por recorrer");
        }
    }
}
