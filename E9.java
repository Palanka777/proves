package exercicisjudge;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Palanka
 */
public class E9 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int valor1, valor2, suma, multi, i1,i2;
       int mitja;
        suma = 0;
        mitja =0;
        i1=1;
        i2=1;
        multi=1;
        
       do {
           
            valor1 = ent.nextInt();
            valor2 = ent.nextInt();
            suma = valor1 + valor2 + suma;
            
            if (valor1==0){
                valor1=1;
                i1=0;
            }
            
            if (valor2==0){
                valor2=1;
                i2=0;
            }
            
            multi = valor1 * valor2 * multi;
            
            mitja= mitja+2;
            
        } while (valor1 != valor2 && valor1 != 0 && valor2 != 0);
        
        System.out.println(suma);
        
        if ( i1==0 && i2==0 && mitja==2){
            System.out.println("INDETERMINAT");
        }else{
        System.out.println(multi);
        }
        System.out.println((double)suma/mitja);
    
    }
}



