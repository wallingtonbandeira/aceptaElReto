package aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author wallington
 */
public class P217queLadoDeLaCalle {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numero;
        do {
            numero = br.readLine();
            if (Integer.parseInt(numero) ==0) {
                break;
            }
            if (Integer.parseInt(numero) % 2 == 0) {
                System.out.println("DERECHA");
            } else {
                System.out.println("IZQUIERDA");
            }
        } while (true);
        
        
    }
    
}
