/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisjudge;

import java.util.Scanner;

/**
 *
 * @author Palanka
 */
public class E30 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num;
        char caracter;
        String paraula = "";

        num = ent.nextInt();

        if (num >= 0) {
            if (num == 0) {
                System.out.println("CADENA BUIDA");
            } else {
                do {
                    caracter = ent.skip("[\r\n]*").nextLine().charAt(0);
                    paraula = paraula + caracter;
                    num--;
                } while (num > 0);
                System.out.println(paraula);
            }

        } else {
            System.out.println("VALOR INCORRECTE");
        }
    }
}
