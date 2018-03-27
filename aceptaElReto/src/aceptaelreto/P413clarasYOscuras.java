package aceptaelreto;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Wally
 */
public class P413clarasYOscuras {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double x, y, multi, divi, cantidad = lector.nextInt();
        for (int i = 0; i < cantidad; i++) {
            x = lector.nextInt();
            y = lector.nextInt();
            multi = x * y;
            divi = multi / 2;
            if (divi % 2 != 0) {
                System.out.println(divi + 1 +" "+ divi);
            } else {
                System.out.println(divi + " " + divi);
            }
        }
    }
}
