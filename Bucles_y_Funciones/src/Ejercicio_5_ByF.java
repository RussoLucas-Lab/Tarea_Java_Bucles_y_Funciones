// Ejercicio 5: Promedio de satisfacción del cliente
//Una empresa desea conocer el promedio de satisfacción de sus clientes basado en encuestas de calificación de 1 a 5.
//
//**Instrucciones**:
//- Crea un arreglo `calificaciones` con las puntuaciones de satisfacción de los clientes.
//- Escribe una función `calcularPromedioSatisfaccion` que recorra el arreglo y calcule el promedio de satisfacción.


import java.util.Scanner;

public class Ejercicio_5_ByF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float list[] = new float[10];

        for (int i = 0; i<10; i++){

            System.out.print("Ingrese que tan satisfecho esta con nuestra página (1-5): ");

            float calificacion = sc.nextFloat();
            list[i] = calificacion;

        }

        calcularPromedioSatisfaccion(list);

    }
    public static String calcularPromedioSatisfaccion(float[] list){
        float suma=0;
        for (float item : list){suma = item + suma;}

        System.out.print("\nEl promedio de satisfaccion es de "+ suma/10 );

        return "";
    }
}
