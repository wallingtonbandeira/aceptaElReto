package aceptaelreto;

import java.util.Scanner;

/**
 *
 * @author Wally
 */
public class P210primoDeRiesgo {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String entrada;
        int cantidad = lector.nextInt();
        for (int i = 0; i < cantidad; i++) {
            int suma = 0;
            entrada = lector.next();
            for (int j = 0; j < entrada.length(); j++) {
                suma = (int) entrada.charAt(j) + suma;
            }
            int num = 0;
            boolean primer = false;
            for (int j = suma - 1; !primer; j--) {
                primer = true;
                double raiz = Math.sqrt(j);
                for (int k = 2; k <= raiz && primer; k++) {
                    if (j % k == 0) {
                        primer = false;
                    }
                }

                num = j;

            }
            System.out.println(num);

        }

    }

}
