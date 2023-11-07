import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int planta_actual = 0;
        int planta_anterior= 0;
        int contador = 0;
        int recorrido = 0;
        do {
            planta_actual = sc.nextInt();
            if (planta_actual != -1){
                if (contador == 0) {
                    contador++;
                }
                
            }else {
                recorrido += Math.abs(planta_actual - planta_anterior);
                if (planta_actual >= planta_anterior) {
                    recorrido = +(planta_actual - planta_anterior);
                } else {
                    recorrido = +(planta_anterior - planta_actual);
                }
            }
            planta_anterior = planta_actual;
        }while (planta_actual != -1);

        if (contador >0){
            System.out.println(recorrido);
        }
    }

}
