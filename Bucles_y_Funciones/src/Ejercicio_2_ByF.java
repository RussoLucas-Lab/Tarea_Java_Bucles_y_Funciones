//Ejercicio 2: Generar reportes de inventario
//Una tienda de electrónica necesita un informe del inventario, mostrando los productos que tienen menos de 5 unidades en stock.
//
//**Instrucciones**:
//- Crea un arreglo `productos` que almacene los nombres de los productos y otro arreglo `stocks` que almacene la cantidad de stock de cada producto.
//- Escribe una función `generarReporteBajoStock` que imprima los productos con menos de 5 unidades.

import java.util.ArrayList;

import java.util.Scanner;

public class Ejercicio_2_ByF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> productos = new ArrayList<>();
        ArrayList<Integer> stock = new ArrayList<>();
        String producto;


        while(true){

            System.out.print("Ingrese el producto o S para salir: ");

            producto = sc.nextLine();
            producto = producto.toUpperCase();

            if (producto.equals("S")){
                break;}
            else{productos.add(producto);}

        }

        int cantidad=0;
        for (String item : productos) {
            while(true){
                System.out.print("Ingrese el stock de "+ item +": ");
                cantidad = sc.nextInt();

                if (cantidad<0) {
                    System.out.print("Numero negativo intentelo de nuevo\n");

                } else {

                    stock.add(cantidad);
                    break;
                }
            }
            }


        //Checkear los productos y su stock

        int cantidad_productos = productos.size();
        System.out.println("\nInventario de productos:");
        for (int i=1; i<=cantidad_productos; i++) {
            System.out.println(productos.get(i-1) + ": " + stock.get(i-1));
        }

        generarReporteBajoStock(productos, stock);


    }
    public static String generarReporteBajoStock(ArrayList<String> productos, ArrayList<Integer> stock){

        System.out.println("\nProductos con menos de 5 unidades en stock:");
        int j = 1;
        for (int i: stock) {

            if (i < 5) {
                System.out.println("Producto: " + productos.get(j-1) + ", Stock: " +i);
            }
            j++;
        }

        return "";
    }
}