package calcetines;

import java.util.Scanner;

public class Calcetines {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String cadena;
        int negros = 0;
        int grises = 0;
        
        do{cadena = s.nextLine();
        String[] calcetin = cadena.split(" ");
        
        for (int i = 0; i < calcetin.length-1; i++) {
            if (calcetin[i].equals("N")){
                negros++;
            } else {
                grises++;
            }
        }
        
        if (cadena.equals(".")){
            break;
        } 
        else if ((negros+grises) % 2 == 0 && negros % 2 == 0 && grises % 2 == 0){
            System.out.println("EMPAREJADOS");
        }
        else if (negros - grises == 1){
            System.out.println("GRIS SOLITARIO");
        }
        else if (grises - negros == 1){
            System.out.println("NEGRO SOLITARIO");
        }
        else {System.out.println("PAREJA MIXTA");}
        
        negros=0;
        grises=0;
        
        }while(!cadena.equals("."));
    }
    
}
