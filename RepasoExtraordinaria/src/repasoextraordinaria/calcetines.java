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
 * @author abalague
 */
public class calcetines {

    public static void main(String[] args) {
        int gris = 0;
        int negro = 0;
        Scanner s = new Scanner(System.in);
        String calcetines="";
        do{
        calcetines = s.nextLine();
        String[]partes=calcetines.split(" ");      
        for (int j=0;j<partes.length;j++) {
            
                if (partes[j].charAt(0) == 'N') {
                    negro++;
                } else if (partes[j].charAt(0) == 'G') {
                    gris++;
                }
            }  
      
        if (gris % 2 == 0 && negro % 2==0) {
            System.out.println("emparejados");
        }
          else if(negro % 2==1 && gris %2==1){
            System.out.println("pareja mixta");
          }
          else if(negro > gris && gris % 2 !=0 ){System.out.println("Gris solitario");}
          else if(gris > negro && negro % 2 !=0){System.out.println("Negro solitario");}
         else 
          {System.out.println("desemparejados");} 
        negro=0;
        gris=0;
    }while (!calcetines.equals("."));
}
                
   }

