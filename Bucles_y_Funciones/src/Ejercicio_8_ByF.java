//Ejercicio 8: Control de horas trabajadas
//Una empresa de servicios necesita llevar el control de las horas trabajadas por sus empleados durante una semana.
//**Instrucciones**:
//- Crea un arreglo `empleados` con los nombres de los empleados y otro arreglo `horasTrabajadas` con las horas trabajadas en la semana.
//- Escribe una función `calcularPagoSemanal` que calcule el pago semanal (a razón de $15 por hora trabajada).


import java.util.Scanner;

public class Ejercicio_8_ByF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] empleados = new String[5];
        float[] horasTrabajadas = new float[5];

        for(int i = 0; i<5; i++){

            System.out.print("Ingrese el nombre del empleado N°"+(i+1)+": ");
            empleados[i] = sc.nextLine();
        }

        for(int i = 0; i<5; i++){

            System.out.print("Ingrese las horas trabajadas por "+ empleados[i]+": ");
            horasTrabajadas[i] = sc.nextFloat();
        }
        calcularPagoSemanal(empleados,horasTrabajadas);
    }

    public static String calcularPagoSemanal(String[] empleados, float[] horasTrabajadas){
        int j = 15;
        for(int i = 0; i<5; i++){

            System.out.print("El empleado "+empleados[i]+" debe cobrar: "+ horasTrabajadas[i]* j+"\n");

        }

        return "";
    }
}
