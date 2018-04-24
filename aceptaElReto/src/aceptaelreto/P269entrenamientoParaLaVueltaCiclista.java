package aceptaelreto;

import java.util.Scanner;

/**
 *
 * @author wallington
 *
 * Tiempo de ejecucion esperado: ~1.400 segs.
 *
 * Memoria: 1745 KiB
 *
 * Puesto 182 (en el momento de hacer el envío)
 */
public class P269entrenamientoParaLaVueltaCiclista {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int suma = 0, pruebas = lector.nextInt(), vuelta, anterior = 0;

        for (int i = 0; i < pruebas; i++) {
            do {
                vuelta = lector.nextInt();
                if (vuelta != 0) {
                    anterior = anterior + vuelta;
                    suma = suma + (anterior << 1);
                }
            } while (vuelta != 0);
            System.out.println(suma);
            suma = 0;
            anterior = 0;
        }
    }

}
