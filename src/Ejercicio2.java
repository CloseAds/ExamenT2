import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[]a){

        Scanner sc = new Scanner(System.in);
        float notes = 0;
        int contador = 0;

        System.out.println("Introduzca las notas (-1, salir del programa y X para no introducir ninguna nota");

        do {
            notes = sc.nextInt();



        }
        while (notes != -1);

            System.out.println("No se han introducido calificaciones");
    }
}
