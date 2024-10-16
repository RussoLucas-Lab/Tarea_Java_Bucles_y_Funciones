//Ejercicio 3: Gestión de clientes
//Una pequeña empresa de servicios tiene una lista de clientes a los que debe enviar facturas, pero quiere procesar solo aquellos
// que tengan facturas pendientes por más de $500.
//
//**Instrucciones**:
//- Crea un arreglo `clientes` que almacene los nombres de los clientes y un arreglo `facturasPendientes` con el monto de sus facturas pendientes.
//- Escribe una función `enviarFacturas` que imprima los nombres de los clientes con facturas mayores a $500.

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_3_ByF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> clientes = new ArrayList<>();
        ArrayList<Integer> facturasPendientes = new ArrayList<>();
        String producto;


        while(true){

            System.out.print("Ingrese el nombre del cliente o S para el siguiente paso: ");

            producto = sc.nextLine();
            producto = producto.toUpperCase();

            if (producto.equals("S")){
                break;}
            else{clientes.add(producto);}

        }

        int cantidad=0;
        for (String item : clientes) {
            while(true){
                System.out.print("Ingrese el monto de la factura pendiente de "+ item +": ");
                cantidad = sc.nextInt();

                if (cantidad<0) {
                    System.out.print("Numero negativo intentelo de nuevo\n");

                } else {

                    facturasPendientes.add(cantidad);
                    break;
                }
            }
        }


        //Checkear los clientes y sus facturas pendientes

        int cantidad_productos = clientes.size();
        System.out.println("\nClientes y sus facturas:");
        for (int i=1; i<=cantidad_productos; i++) {
            System.out.println(clientes.get(i-1) + ": " + facturasPendientes.get(i-1));
        }

        enviarFacturas(clientes, facturasPendientes);


    }
    public static String enviarFacturas(ArrayList<String> clientes  , ArrayList<Integer> facturasPendientes){

        System.out.println("\nClientes con facturas pendientes mayores a $500:");

        for(int i=0; i<clientes.size(); i++){

            if (facturasPendientes.get(i) > 500){
                System.out.print(clientes.get(i)+" tiene una deuda de $"+ facturasPendientes.get(i)+"\n");
            }

        }

        return "";
    }
}