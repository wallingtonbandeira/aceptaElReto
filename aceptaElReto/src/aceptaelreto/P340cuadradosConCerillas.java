/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreto;

import java.util.Scanner;

/**
 *
 * @author Wallington Bandeira
 *
 * Problema nº340 de la web aceptaelreto.com
 *
 * Tiempo de ejecucion esperado: ±0.800 segs.
 *
 * Memoria: 1738 KiB.
 *
 * Puesto 396 al primer intento, codigo no optimizado.
 */
public class P340cuadradosConCerillas {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int x, y, cantidad = lector.nextInt();
        for (; cantidad != 0; cantidad--) {
            x = lector.nextInt();
            y = lector.nextInt();
            System.out.println(((x + 1) * y) + ((y + 1) * x));
        }
    }
}
