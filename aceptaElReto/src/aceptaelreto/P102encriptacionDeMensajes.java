package aceptaelreto;

import java.util.Scanner;

/**
 *
 * @author Wallington Bandeira
 *
 * Tiempo de ejecucion esperado: ~0.200 segs.
 *
 * Memoria: 1719 KiB
 */
public class P102encriptacionDeMensajes {

    public static void main(String args[]) {

        Scanner lector = new Scanner(System.in);
        String alfabeto = "abcdefghijklmnopqrstuvwxyz", entrada, texto1, letra;
        int desencriptar, numeroletra,
                codificador = alfabeto.indexOf("p"); //codificador es el numero donde esta la letra p
        do {
            int contador = 0;
            texto1 = ""; //inicia o reinicia la variable
            entrada = lector.nextLine();
            // la siguiente linea es para saber como sera la desencriptacion 
            //restando a codificador el valor de la primera letra se consigue el tipo de encriptacion
            desencriptar = codificador - alfabeto.indexOf(entrada.charAt(0));

            if (desencriptar < 0) {
                desencriptar = alfabeto.length() - ((-1) * desencriptar); //se mueve a la derecha la cantidad de la resta en codificador
            }
            // por la longitud de la entrada, empezando por 1 para no pillar la primera letra...
            for (int i = 1; i < entrada.length(); i++) {
                // se guarda el numero de la posicion alfabetica de las letras de la entrada
                numeroletra = alfabeto.indexOf(Character.toLowerCase(entrada.charAt(i)));
                if (numeroletra < 0) {
                    //si numero < 0, guarda directamente el numero que esté en i
                    letra = "" + entrada.charAt(i);
                } else {
                    //ni preguntes por esta operacion, no me acuerdo porque la hice asi
                    int codigoNuevo = (numeroletra + desencriptar) % alfabeto.length();
                    letra = "" + alfabeto.charAt(codigoNuevo);
                }
                /**
                 *
                 * Aqui solo diferencio si la letra escrita esta en mayuscula,
                 * se pasa al desencriptado tambien en mayuscula.
                 *
                 * Es importante, porque si el codigo desencriptado escribe
                 * "fin" en minusculas el programa no debe cerrarse, pero en
                 * mayusculas si
                 */
                if (Character.isUpperCase(entrada.charAt(i))) {
                    texto1 = texto1 + letra.toUpperCase();
                } else {
                    texto1 = texto1 + letra;
                }
                /**
                 * Si la letra desencriptada es vocal se suma el contador
                 *
                 * Aqui en lugar de poner matches y el regex, puedes poner
                 * equals y una condicion por letra
                 */
                if (letra.matches("[aeiouAEIOU]")) {
                    contador++;
                }

            }

            if ("FIN".equals(texto1)) {
                break;
            } else {
                System.out.println(contador);
            }
        } while (true);
    }
}
