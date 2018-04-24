package aceptaelreto;

import java.util.Scanner;

/**
 *
 * @author Wallington Bandeira
 *
 * Tiempo de ejecucion esperado: ~1.350 segs.
 *
 * Memoria: 1731 KiB
 *
 * Puesto 78 (en el momento de hacer el envío)
 */
public class P401trifelios {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String texto1, texto2, nuevo;
        boolean encontrado;
        int pruebas = lector.nextInt();
        for (int i = 0; i < pruebas; i++) {
            nuevo = "";
            encontrado = false;
            
            texto1 = lector.next().toLowerCase().replace('v', 'b');
            texto2 = lector.next().toLowerCase().replace('v', 'b');
            nuevo = texto2;
            if (!texto1.equals(texto2)) {
                for (int j = texto2.length() - 1; j > -1; j--) {
                    nuevo = texto2.charAt(j) + nuevo;
                    nuevo = nuevo.substring(0, nuevo.length() - 1);
                    if (nuevo.equals(texto1)) {
                        encontrado = true;
                        break;
                    }
                }
            }
            if (encontrado) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }

    }
}
