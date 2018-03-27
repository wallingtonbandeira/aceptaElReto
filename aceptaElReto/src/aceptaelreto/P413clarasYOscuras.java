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
        Random rnd = new Random();
        int x, y, cantidad = lector.nextInt();
        int total, division;
        for (int i = 0; i < cantidad; i++) {
            x = rnd.nextInt(1000) +1;
            y = rnd.nextInt(1000) + 1;
            total = x * y;
            division = total / 2;
            if (total % 2 != 0) {
                System.out.println(x +" " + y +" = "+ (division + 1) + " " + division);
            } else {
                System.out.println(x +" " + y +" = "+ division + " " + division);
            }
        }
    }
}
