package aceptaelreto;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author wallington
 */
public class P124cuantasMeLlevo {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String numero1;
        String numero2;
        String caracter1, caracter2;
        int suma = 0, llevado = 0, contador;
        Random rnd = new Random();
        do {
            
            numero1 = ""+ rnd.nextInt(999999999);
            numero2 = "" +rnd.nextInt(999999999);
            
            /*numero1 = lector.next();
            numero2 = lector.next();
*/
            if ("0".equals(numero1) && "0".equals(numero2)) {
                break;
            }

            /**
             * Si un numero es mas grande que otro, añade 0s adelante del mas
             * pequeño para igualar el tamaño de ambos.
             */
            if (numero1.length() > numero2.length()) {
                do {
                    numero2 = "0" + numero2;
                } while (numero1.length() != numero2.length());
            } else if (numero1.length() < numero2.length()) {
                do {
                    numero1 = "0" + numero1;
                } while (numero1.length() != numero2.length());
            }

            contador = 0;

            for (int i = numero1.length() - 1; i > -1; i--) {
                caracter1 = "" + numero1.charAt(i);
                caracter2 = "" + numero2.charAt(i);

                suma = Integer.parseInt(caracter1) + Integer.parseInt(caracter2) + llevado;
                if (suma > 9) {
                    llevado = 1;
                    contador++;
                } else {
                    llevado = 0;
                }
            }
            System.out.println(numero1 +"\n" + numero2);
            System.out.println(contador);

        } while (true);

    }
}
