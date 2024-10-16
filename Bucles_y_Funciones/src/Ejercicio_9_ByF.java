// Ejercicio 9: Calcular el precio final con descuentos
//Una empresa quiere calcular el precio final de sus productos después de aplicar un descuento general del 10%.
//
//**Instrucciones**:
//- Crea un arreglo `preciosOriginales` que almacene el precio original de varios productos.
//- Escribe una función `calcularPrecioFinal` que aplique el descuento a cada producto y devuelva el precio final.


import java.util.Random;

public class Ejercicio_9_ByF {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] preciosOriginales = new Integer[5];

        for (int i = 0; i < 5; i++) {

            preciosOriginales[i] = random.nextInt(5000);
        }

        System.out.print("Precios originales\n");
        for (int precio : preciosOriginales) {
            System.out.print(precio + "  ");
        } ;
        calcularPrecioFinal(preciosOriginales);
    }

    public static String calcularPrecioFinal(Integer[] precios) {
        System.out.print("\nPrecios con descuento\n");
        for (int precio : precios) {
            System.out.print(precio * 0.9 + "  ");
        }

        return "";
    }
}

