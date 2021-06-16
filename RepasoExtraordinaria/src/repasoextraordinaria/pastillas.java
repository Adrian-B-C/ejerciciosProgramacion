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
public class pastillas {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> blister = new ArrayList<>();
        ArrayList<Integer> lista = new ArrayList<>();
        int j = 0;
        int numeroBlister = s.nextInt();
        s.nextLine();
        while (blister.size() <= numeroBlister) {
            blister.add(s.nextLine());
        }
        for (int col = 0; col <= 7; col++) {
            for (int fil = 0; fil < blister.size(); fil++) {
                if (blister.get(fil).charAt(col) == '-') {
                    lista.add(col);

                }
                System.out.println(lista.get(0));

            }

        }
    }

}
