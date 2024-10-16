// Ejercicio 1: Cálculo de ingresos mensuales
//Una pequeña tienda registra sus ventas diarias en un arreglo. Se necesita escribir una función que use un
// bucle para calcular los ingresos totales mensuales.

//**Instrucciones**:
//- Crea un arreglo `ventas` que almacene las ventas diarias de una tienda durante 30 días.
//- Escribe una función `calcularIngresosMensuales` que recorra el arreglo y sume las ventas.
//- Imprime el total de ingresos mensuales.



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio_1_ByF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> dias_31 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 8, 10, 12));
        ArrayList<Integer> dias_30 = new ArrayList<>(Arrays.asList(4, 6, 9, 11));
        ArrayList<Integer> ventas = new ArrayList<>();
        int dias_28 = 2;
        int i;
        while (true) {

            System.out.print("Ingrese el numero del mes: ");
            int numero_mes = sc.nextInt();

            if (1 <= numero_mes && numero_mes <= 12) {
                if (dias_30.contains(numero_mes)) {
                    i = 30;
                    break;
                } else if (dias_31.contains(numero_mes)) {
                    i = 31;
                    break;
                } else {
                    i = 28;
                    break;
                }

            } else {
                System.out.print("Mes incorrecto intentelo nuevamente\n");
            }
        }

        float venta_dia;

        //Ingreso manual

//            System.out.print("Ingrese las ventas de cada día: \n");
//
//            for (int j=1; j<=i; j++){
//
//                while(true) {
//                    System.out.print("Día " + j + ": ");
//                    venta_dia = sc.nextInt();
//
//                    if (venta_dia > 0) {
//                        ventas.add(venta_dia);
//                        break;
//                    }else {System.out.print("Numero negativo, intentelo de nuevo\n");}
//                }
//            }


        //Ingreso aleatorio
        Random random  = new Random();
        for (int j=1; j<=i; j++){


            int venta_dia_aleatorio = random.nextInt(5001);
            ventas.add(venta_dia_aleatorio);

        }

            System.out.print("\nVentas del mes N°"+i+"\n");
            System.out.print(ventas);

            int venta_total = calcularIngresosMensuales(ventas);
            System.out.print("\nLa suma de las ventas diarias da un total de: "+venta_total);

    }

    //metodo suma de las ventas
    public static int calcularIngresosMensuales(ArrayList<Integer> ventas){

        int total = 0;
        for (int venta : ventas) {
            total += venta;
        }
        return total;
    }

}
