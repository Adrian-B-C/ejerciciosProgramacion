package pirenaicas;

import java.util.Scanner;

public class Pirenaicas {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int netapas;
        int distanciatotal=0;
        do{
            netapas=s.nextInt();
            if(netapas>=1 && netapas<=100){
            int[] rutas = new int[netapas];
            for (int i = 0; i < rutas.length; i++) {
                rutas[i]=s.nextInt();
                distanciatotal = distanciatotal+rutas[i];
            }
            System.out.print(distanciatotal+" ");
            for (int j = 0; j < rutas.length-1; j++) {
                distanciatotal = distanciatotal-rutas[j];
                System.out.print(distanciatotal+" ");
            }
        netapas=s.nextInt();
        distanciatotal=0;
            }
            else{
                break;}
        }while(netapas!=0);
    }
    
}
