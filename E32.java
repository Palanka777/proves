/*
Programa que rep per l'entrada un número enter i mostra el mateix número però en els seus
dígits en ordre invers. Als negatius també inclourà el signe al començament del número
resultat. Nota: els 0s a l'esquerra i/o dreta no es tenen en compte.

Per obtenir els dígits d’un número al revés farem un bucle on l’anem dividint entre 10 i
a l’operació resto (o mòdul) tenim cadascun dels dígits desitjats.
Per exemple, per al número 123:
123 % 10 = 3 → primer dígit que busquem
123 / 10 = 12
12 % 10 = 2 → segon dígit que busquem
12 / 10 = 1
1 % 10 = 1 → tercer dígit que busquem
1 / 10 = 0 -----------------------------------> final del bucle
 */
package exercicisjudge;

import java.util.Scanner;

/**
 *
 * @author Palanka
 */
public class E32 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numIn, numFin, digit, cont, potencia, a;
        digit = 1;
        numFin = 0;
        numIn = ent.nextInt();
        cont = 0;
        potencia = 1;
        boolean negatiu = false;

        if (numIn < 0) {
            numIn = numIn * -1;
            negatiu = true;

        }

        do {

            if (cont > 0) {
                potencia = 1;
                potencia = potencia * 10;
            }

            digit = numIn % 10;
            numIn = numIn / 10;
            cont++;
            numFin = digit + (numFin * potencia);

        } while (numIn > 0);

        if (negatiu == false) {
            System.out.println(numFin);
        } else {
            numFin = numFin * -1;
            System.out.println(numFin);
            
        }
    }
}
