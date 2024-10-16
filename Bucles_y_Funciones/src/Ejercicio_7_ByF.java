//Ejercicio 7: Descuento por compras grandes
//Una tienda de ropa ofrece un 15% de descuento a las compras superiores a $500.
//
//**Instrucciones**:
//- Crea un arreglo `compras` que almacene los montos de las compras de los clientes.
//- Escribe una función `aplicarDescuento` que aplique el descuento a las compras que superen los $500.


import java.util.Random;
import java.util.Scanner;

public class Ejercicio_7_ByF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        Integer[] compras = new Integer[5];

        for (int i = 0 ; i<5 ; i++){
            compras[i]= random.nextInt(1000);
        }

        float[]compras_descuento = new float[5];

        System.out.print("Compras antes del descuento");
        for (int compra:compras){System.out.print(compra+" ");}

        compras_descuento = aplicarDescuento(compras);

        System.out.print("\n");
        System.out.print("Compras despues del descuento");
        for (float compra:compras_descuento){System.out.print(compra+"  ");}
    }

    public static float[] aplicarDescuento(Integer[]compras){

        float[]compras_descuento = new float[5];

        for(int i=0; i<5 ; i++){

            if (compras[i] >500) {
                compras_descuento[i] = (float) (compras[i] * 0.75);
            }else {compras_descuento[i] = compras[i];}

        }

        return compras_descuento;
    }
}

