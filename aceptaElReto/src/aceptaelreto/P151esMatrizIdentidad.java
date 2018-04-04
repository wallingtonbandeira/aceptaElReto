package aceptaelreto;

/**
 *
 * @author Wallington Bandeira
 *
 * Tiempo de ejecucion esperado:
 *
 * Memoria:
 *
 * Puesto (en el momento de hacer el envío)
 */
import java.util.Scanner;

public class P151esMatrizIdentidad {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int tamano, numero;
        boolean veri;

        do {
            veri = true;
            tamano = lector.nextByte();
            for (int i = 0; i < tamano && tamano != 0; i++) {
                for (int j = 0; j < tamano; j++) {
                    numero = lector.nextByte();
                    if (i == j && numero != 1) {
                        veri = false;
                    } else if (i != j && numero != 0) {
                        veri = false;
                    }
                }
            }

            if (tamano != 0 && veri) {
                System.out.println("SI");
            } else if (tamano != 0 && !veri) {
                System.out.println("NO");
            }
        } while (tamano != 0);

        /*
        do {
            veri = true;
            tamano = lector.nextByte();
            //introduce los datos en la array
            for (int i = 0; i < tamano && tamano != 0; i++) {
                for (int j = 0; j < tamano; j++) {
                    if (i == j) {
                        raiz[i][j] = 1;
                    } else {
                        raiz[i][j] = 0;
                    }
                }
            }
            //verifica los datos de la array
            for (int i = 0; i < tamano && veri; i++) {
                for (int j = 0; j < tamano && veri; j++) {
                    if (i == j && raiz[i][j] != 1) {
                        veri = false;
                    } else if (i != j && raiz[i][j] != 0) {
                        veri = false;
                    }
                }
            }
            // verifica qué debe imprimir
            if (tamano != 0 && veri) {
            System.out.println("SI");
            } else if (tamano != 0 && !veri) {
                System.out.println("NO");
            }
        } while (tamano != 0);*/
    }
}
