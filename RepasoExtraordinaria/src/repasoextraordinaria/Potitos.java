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
public class Potitos {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero = 0;
        do {
            System.out.println("Introduce número de potitos");
            numero = s.nextInt();
            if (numero != 0) {
                ArrayList<String> productosSI = new ArrayList<>();
                ArrayList<String> productosNO = new ArrayList<>();
                for (int i = 0; i < numero; i++) {
                    String cadena = s.nextLine();
                    String[] partes = cadena.split(" ");
                    if (partes[0].equals("SI")) {
                        for (int j = 1; j < partes.length-1; j++) {
                            productosSI.add(partes[j]);
                            
                        }
                    }
                    else {
                        for (int j = 1; j < partes.length-1; j++) {
                            productosNO.add(partes[j]);
                        }
                    }
                }
                /*
                //Ya tendré todo el listado de productos que le gustan y que no le gustan
                //Tened en cuenta que el size se calcula dinámicamente, si eliminas un producto del listado se actualiza el size
                int tamaño = productosNO.size();
                for (int i = 0; i < tamaño; ) {
                    String producto = productosNO.get(i);
                    //Si ese producto está en el listado de SI, lo eliminamos
                    //Cuidado con la eliminación de prodcutos que reordena los elementos
                    if (productosSI.contains(producto)) productosNO.remove(producto);
                    //Si no encuentra el producto actualizamos la i.
                    else i++;
                }
                
                //Imprimir lo que nos quede en el NO
                for (String producto : productosNO) {
                    System.out.print(producto+" ");
                }
                */
                
                //Mucho más sencillo, solamente imprimimos lo que no esté en el listado de los SI.
                for (String producto : productosNO) {
                    if (!productosSI.contains(producto)) System.out.print(producto+" ");
                }
                
            }
        
            
        }while (numero != 0);
    }
}
