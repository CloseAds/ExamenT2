import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        if (a % 2 == 0) {
            int i;
            for (i = 10; i < a; i+=5) {
                System.out.print(i+",");

            }
        } else {
            int i;
            for (i = 10; i < a; i+=3) {
                System.out.print(i+",");
            }
        }


    }
}
