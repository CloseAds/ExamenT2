import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        if (a % 2 == 0) {
            int i;
            int b = 3;
            for (i = 10; i < a; i++) {
                System.out.print(",");

            }
        } else {
            int i;
            for (i = 10; i < a; i++) {
                System.out.print(",");
            }
        }


    }
}
