/***
 * Realizar un programa Java que permita pedir por teclado el nombre de 5 empleados.
 * Por cada empleado se debe solicitar el nombre, numero de días trabajados y costo del día trabajo. 
 * Calcular el valor a cancelar por la empresa para cada empleado. Presentar un reporte como el siguiente:
 Nombre 1	10	$2.5	$25
 Nombre 2	11	$2	$22
 Nombre 3	9	$3	$27
 Nombre 4	5	$4	$20
 Nombre 5	12	$2	$24
 */
import java.util.Scanner;
public class Probema3_PagoEmpleados {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre;
        int diasTrab;
        double costoDia, contador = 1, valorCancel;
        while(contador <= 5){
            System.out.println("DEME EL NOMBRE DEL EMPLEADO, EL NUMERO DE DIAS TRABAJADOS Y EL COSTO POR DIA" +  ":");
        nombre = tcl.next();
        diasTrab = tcl.nextInt();
        costoDia = tcl.nextDouble();
        valorCancel = (diasTrab * costoDia);
            System.out.printf("|%s |\t%s|\t%s|\t%s|\n", "NOMBRE", "DIASTRAB", "COSTODIA", "VALORCANCEL");
            System.out.printf("|%s |\t%d |\t$%.2f |\t$%.2f |\n", nombre, diasTrab, costoDia, valorCancel);
            contador++;
        }
    }
}
/***
 * run:
 DEME EL NOMBRE DEL EMPLEADO, EL NUMERO DE DIAS TRABAJADOS Y EL COSTO POR DIA:
 Francis 10 2.5
 |NOMBRE |	DIASTRAB|	COSTODIA|	VALORCANCEL|
 |Francis |	10 |	$2.50 |	$25.00 |
 DEME EL NOMBRE DEL EMPLEADO, EL NUMERO DE DIAS TRABAJADOS Y EL COSTO POR DIA:
 Carlos 11 2
 |NOMBRE |	DIASTRAB|	COSTODIA|	VALORCANCEL|
 |Carlos |	11 |	$2.00 |	$22.00 |
 DEME EL NOMBRE DEL EMPLEADO, EL NUMERO DE DIAS TRABAJADOS Y EL COSTO POR DIA:
 Fernando 9 3
 |NOMBRE |	DIASTRAB|	COSTODIA|	VALORCANCEL|
 |Fernando |	9 |	$3.00 |	$27.00 |
 DEME EL NOMBRE DEL EMPLEADO, EL NUMERO DE DIAS TRABAJADOS Y EL COSTO POR DIA:
 Adrian 5 4
 |NOMBRE |	DIASTRAB|	COSTODIA|	VALORCANCEL|
 |Adrian |	5 |	$4.00 |	$20.00 |
 DEME EL NOMBRE DEL EMPLEADO, EL NUMERO DE DIAS TRABAJADOS Y EL COSTO POR DIA:
 Miguel 12 2
 |NOMBRE |	DIASTRAB|	COSTODIA|	VALORCANCEL|
 |Miguel |	12 |	$2.00 |	$24.00 |
 BUILD SUCCESSFUL (total time: 46 seconds)
 */