package aceptaelreto;

/**
 *
 * @author Wallington Bandeira
 *
 * Tiempo de ejecucion esperado: ~1.269 segs.
 *
 * Memoria: 1747 KiB
 *
 * Puesto 495 (en el momento de hacer el envío)
 */
import java.util.Scanner;

public class P151esMatrizIdentidad {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int tamano, numero;
        boolean veri;

        do {
            veri = true;
            tamano = lector.nextInt();
            if (tamano != 0) {
                for (int i = 0; i < tamano; i++) {
                    for (int j = 0; j < tamano; j++) {
                        numero = lector.nextInt();
                        if (i == j && numero != 1) {
                            veri = false;
                        } else if (i != j && numero != 0) {
                            veri = false;
                        }
                    }
                }

                if (veri) {
                    System.out.println("SI");
                } else if (!veri) {
                    System.out.println("NO");
                }
            }
        } while (tamano != 0);
    }
}
