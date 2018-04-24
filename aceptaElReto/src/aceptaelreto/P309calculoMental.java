/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreto;

import java.util.Scanner;

public class P309calculoMental {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int cantidad = lector.nextInt(), multi = 1;
        long suma = 0, numero;
        char caracter = 0;

        for (int i = 0; i < cantidad; i++) {
            OUTER:
            for (int j = 0; caracter != '.'; j++) {
                numero = lector.nextLong();
                suma = suma + numero * multi;
                caracter = lector.next().charAt(0);
                switch (caracter) {
                    case '-':
                        multi = -1;
                        break;
                    case '+':
                        multi = 1;
                        break;
                    default:
                        System.out.println(suma);
                        break OUTER;
                }
                if (j > 0) {
                    System.out.print(suma + ", ");
                }
            }
            caracter = 0;
            suma = 0;
        }
    }
}
