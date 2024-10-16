// Ejercicio 4: Cálculo de descuentos para fidelización
//Una empresa ofrece descuentos a sus clientes dependiendo de la cantidad de compras que han realizado.
// Si han comprado más de 10 veces, reciben un 10% de descuento.
//**Instrucciones**:
//- Crea un arreglo `clientes` y otro `compras` que almacene la cantidad de compras de cada cliente.
//- Escribe una función `calcularDescuentos` que recorra el arreglo y aplique el descuento a los clientes que califiquen.


import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_4_ByF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> clientes = new ArrayList<>();
        ArrayList<Integer> historial_compras = new ArrayList<>();
        ArrayList<Float> siguiente_compra = new ArrayList<>();
        String cliente;
        while (true) {

            System.out.print("Ingrese el nombre del cliente o S para el siguiente paso: ");

            cliente = sc.nextLine();
            cliente = cliente.toUpperCase();

            if (cliente.equals("S")) {
                break;
            } else {
                clientes.add(cliente);
            }
        }

        int cant= 0;
        for (String item : clientes) {
            while (true) {
                System.out.print("cuantas compras ha realizado " + item + ": ");
                cant = sc.nextInt();

                if (cant < 0) {
                    System.out.print("Numero negativo intentelo de nuevo\n");

                } else {

                    historial_compras.add(cant);
                    break;
                }
            }
        }

        float cantidad = 0;
        for (String item : clientes) {
            while (true) {
                System.out.print("Ingrese el monto a pagar de " + item + ": ");
                cantidad = sc.nextInt();

                if (cantidad < 0) {
                    System.out.print("Numero negativo intentelo de nuevo\n");

                } else {

                    siguiente_compra.add(cantidad);
                    break;
                }
            }
        }

        calcularDescuentos(clientes,historial_compras,siguiente_compra);
    }

    public static String calcularDescuentos(ArrayList<String> clientes, ArrayList<Integer> historial_compras, ArrayList<Float> siguiente_compra){
        System.out.println("\nClientes con mas de 10 compras se le aplica 10% de descuento:");

        for(int i=0; i<clientes.size(); i++){

            if (historial_compras.get(i) > 10){
                System.out.print(clientes.get(i)+" compró "+ historial_compras.get(i)+" veces y paga: "+siguiente_compra.get(i)*0.90+"\n");
            }

        }


        return "";}
}
