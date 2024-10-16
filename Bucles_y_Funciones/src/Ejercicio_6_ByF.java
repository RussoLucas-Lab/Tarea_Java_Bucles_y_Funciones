//Ejercicio 6: Cálculo de impuestos
//Una pequeña empresa debe calcular el impuesto de venta para cada una de las facturas emitidas.
//
//**Instrucciones**:
//- Crea un arreglo `facturas` con los montos de las facturas de los clientes.
//- Escribe una función `calcularImpuesto` que aplique un 21% de impuesto a cada factura.


import java.util.Scanner;

public class Ejercicio_6_ByF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] facturas = new float[10];

        for (int i =0; i<10 ; i++){

            System.out.print("Ingrese el monto de la factua N°"+(i+1)+": ");
            float monto=0;
            monto= sc.nextFloat();
            facturas[i] = monto;
             }
        facturas = calcularImpuesto(facturas);

        for(float factura : facturas) {
            System.out.print(factura+"\n");
        }
    }
    public static float[] calcularImpuesto(float[] factura) {

        for(int i = 0; i<10 ;i++){
            float j = factura[i];
            factura[i] = (float) (j  * 1.21);
        }

        return factura;
    }
}



