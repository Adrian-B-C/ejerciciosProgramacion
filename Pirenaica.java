
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexa
 */
public class Pirenaica {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int tamaño=sc.nextInt();
    int resultado=0;
    do{
    int [] rutas= new int[tamaño];    
            for(int i=0; i<tamaño; i++){
             rutas[i]=sc.nextInt();
             resultado+= rutas[i];
            }
    System.out.print(resultado+" ");
    for(int j=0; j<rutas.length-1; j++){
     resultado-= rutas[j];
     System.out.print(resultado+" ");
   }
    tamaño=sc.nextInt();
    }while(tamaño!=0);
    }
}
