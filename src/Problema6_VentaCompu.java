/***
 * Una empresa de comercialización de computadoras realiza el proceso de venta,
 * haciendo un descuento por tipo de cliente: Si es cliente tipo 1 hay un descuento del 10% 
 * Si es cliente tipo 2 hay un descuento del 20% En caso que sea otro tipo de cliente, no hay descuento. 
 * Generar un proceso que permita ingresar 7 ventas: por cada venta preguntar los siguiente datos:
 * Nombre del cliente
 * Costo de la computadora (solo se vende una computadora por transacción)
 * Tipo de cliente 
 * Presentar el siguiente reporte: Cliente tipo 1, compra computadora con precio $100
 */
import java.util.Scanner;
public class Problema6_VentaCompu {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombreC;
        double costoCompu, costoFinal;
        int contador = 1, ventaLimite = 7, tipoCliente;
        int ctipo1 = 0, ctipo2 = 0;
        while(contador <= ventaLimite){
            System.out.println("NOMBRE DEL CLIENTE: " + contador);
            nombreC = tcl.next();
            System.out.print("Costo de la computadora: $");
            costoCompu = tcl.nextDouble();
            System.out.print("Cliente tipo (1 para tipo 1, 2 para tipo 2, otro para sin descuento): ");
            tipoCliente = tcl.nextInt();
            contador++;
            switch (tipoCliente) {
                case 1:
                    costoFinal = costoCompu * 0.90;
                    break;
                case 2:
                    costoFinal = costoCompu * 0.80;
                    break;
                default:
                    costoFinal = costoCompu;
                    break;
            }
            System.out.println("Cliente: " + nombreC);
            System.out.println("Cliente tipo: " + tipoCliente);
            System.out.println("Costo de la computadora: $" + costoCompu);
            System.out.println("Costo final con descuento: $" + costoFinal);
        }
    }
}
/***
 * run:
NOMBRE DEL CLIENTE: 1
Francis
Costo de la computadora: $100
Cliente tipo (1 para tipo 1, 2 para tipo 2, otro para sin descuento): 1
Cliente: Francis
Cliente tipo: 1
Costo de la computadora: $100.0
Costo final con descuento: $90.0
NOMBRE DEL CLIENTE: 2
Fernando
Costo de la computadora: $156.45
Cliente tipo (1 para tipo 1, 2 para tipo 2, otro para sin descuento): 2
Cliente: Fernando
Cliente tipo: 2
Costo de la computadora: $156.45
Costo final con descuento: $125.16
NOMBRE DEL CLIENTE: 3
Carlos
Costo de la computadora: $350
Cliente tipo (1 para tipo 1, 2 para tipo 2, otro para sin descuento): 3
Cliente: Carlos
Cliente tipo: 3
Costo de la computadora: $350.0
Costo final con descuento: $350.0
NOMBRE DEL CLIENTE: 4
Miguel
Costo de la computadora: $1500
Cliente tipo (1 para tipo 1, 2 para tipo 2, otro para sin descuento): 1
Cliente: Miguel
Cliente tipo: 1
Costo de la computadora: $1500.0
Costo final con descuento: $1350.0
NOMBRE DEL CLIENTE: 5
Luz
Costo de la computadora: $251
Cliente tipo (1 para tipo 1, 2 para tipo 2, otro para sin descuento): 2
Cliente: Luz
Cliente tipo: 2
Costo de la computadora: $251.0
Costo final con descuento: $200.8
NOMBRE DEL CLIENTE: 6
Jessica
Costo de la computadora: $350.99
Cliente tipo (1 para tipo 1, 2 para tipo 2, otro para sin descuento): 3
Cliente: Jessica
Cliente tipo: 3
Costo de la computadora: $350.99
Costo final con descuento: $350.99
NOMBRE DEL CLIENTE: 7
Javier 
Costo de la computadora: $245
Cliente tipo (1 para tipo 1, 2 para tipo 2, otro para sin descuento): 1
Cliente: Javier
Cliente tipo: 1
Costo de la computadora: $245.0
Costo final con descuento: $220.5
BUILD SUCCESSFUL (total time: 1 minute 33 seconds)
 */