import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);                                             //completar
        int num = s.nextInt();

        char espacio = '-';
        char relleno = 'X';

        if (num % 2 !=0){
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    if (i == num / 2 || j == num / 2){
                        System.out.println(relleno);
                }else {
                        System.out.println(espacio);
                    }
            }
                System.out.println();
                }
            }

        }


    }
