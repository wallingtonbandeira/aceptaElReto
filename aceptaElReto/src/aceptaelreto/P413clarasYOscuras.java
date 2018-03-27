package aceptaelreto;

import java.util.Scanner;

/**
 *
 * @author Wallington Bandeira
 *
 * Tiempo de ejecucion esperado: ~0.700 segs.
 *
 * Memoria: 1729 KiB
 *
 * Puesto 177 (en el momento de hacer el envío)
 */
public class P413clarasYOscuras {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int x, y, cantidad;
        double multi, divi;
        cantidad = lector.nextInt();
        for (int i = 0; i < cantidad; i++) {
            x = lector.nextInt();
            y = lector.nextInt();
            multi = x * y;
            divi = multi / 2;
            if (divi > (int) divi) {
                System.out.println((int) divi + 1 + " " + (int) divi);
            } else {
                System.out.println((int) divi + " " + (int) divi);
            }
        }
    }
}
