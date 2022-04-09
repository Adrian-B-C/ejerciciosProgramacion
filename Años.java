/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividades;

import java.util.Scanner;

/**
 *
 * @author abalague
 */
public class Años {
    
    public static void main (String[]args){
        
        Scanner sc=new Scanner (System.in);
       
        
     
      int año=sc.nextInt();
      sc.nextLine();
      
        
        if (comprobarAño(año)==true){
          int primero=añosatrastrue(año);
          int segundo=añosaalantetrue(año);
          int numero = segundo - primero;
          System.out.println(primero+" "+numero);
      }
      
      else{
          
          int primero=añosatrasfalse(año);
          int segundo=añosaalantefalse(año);
          int numero = segundo - primero;
          System.out.println(primero+" "+numero);
      }
    
      }
      
     
           
          
           
           
    
  public static boolean comprobarAño(int año){
      
       Scanner sc=new Scanner (System.in);
        int contador =0;
         String numCadena= String.valueOf(año);
        char [] caracteres=numCadena.toCharArray();
        int[]numeros=new int[caracteres.length];
        boolean casos=false;
        int indice=0;
        for(int i =0; i<caracteres.length;i++){
            numeros[i]=Integer.parseInt(String.valueOf(caracteres[i]));
            
            
        }
      
            for(int i=0;i<numeros.length;i++){
                for (int j=0;j<numeros.length;j++ ){
                if(numeros[i]==numeros[j] && i != j){
                    casos=true;
                }
               
           
      }  
    }
            return casos;
  }
  
  public static int añosatrastrue(int año){
      
     
           do{
               año--;
               
           }while (comprobarAño(año)==true);
          
          año++;
      return año;
      
  }
  
  public static int añosaalantetrue(int año){
      
    
           do{
               año++;
              
           }while (comprobarAño(año)==true);
           
          
      return año;
  }
  public static int añosatrasfalse(int año){
      
     
           do{
               año--;
               
           }while (comprobarAño(año)==false);
          
           año++;
      return año;
      
  }
  
  public static int añosaalantefalse(int año){
      
      
           do{
               año++;
              
           }while (comprobarAño(año)==false);
           
          
      return año;
  }
    
    }
