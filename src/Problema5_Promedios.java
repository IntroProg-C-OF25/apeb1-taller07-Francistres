/***
 * Generar un programa Java que permita ingresar 4 estudiantes;
 * por cada uno de ellos ingresar el nombre del estudiante, el promedio de ciclo. 
 * Presentar el siguiente reporte	
 *Estudiante 1	 10	Aprobado
 *Estudiante 2	 6.9	Reprobado
 *Estudiante 3	 7	Aprobado
 *Estudiante 4	 5	Reprobado
 * Atención; con base al valor del promedio, usted debe asignar en cada registro el tipo Aprobado o Reprobado.
 */
import java.util.Scanner;
public class Problema5_Promedios {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre, estado;
        double promedio, contador = 1;
        while(contador <= 4){
            System.out.println("DAME NOMBRES Y PROMEDIO DEL ESTU_" + contador + ": ");
            nombre = tcl.next();
            promedio = tcl.nextDouble();
            if (promedio < 7)
                estado = "Reprobado";
            else
                estado = "Aprobado";
            System.out.printf("| %s\t| %s | %s\t |\n","NOMBRE","PROMEDIO","ESTADO");
            System.out.printf("| %S\t| %.2f\t   | %s\t |\n", nombre, promedio, estado);
            contador++;
        }
    }
}
/***
 * run:
DAME NOMBRES Y PROMEDIO DEL ESTU_1.0: 
Carlos 10
| NOMBRE	| PROMEDIO | ESTADO	 |
| CARLOS	| 10.00	   | Aprobado	 |
DAME NOMBRES Y PROMEDIO DEL ESTU_2.0: 
Francis 6.9
| NOMBRE	| PROMEDIO | ESTADO	 |
| FRANCIS	| 6.90	   | Reprobado	 |
DAME NOMBRES Y PROMEDIO DEL ESTU_3.0: 
Ariel 7
| NOMBRE	| PROMEDIO | ESTADO	 |
| ARIEL	| 7.00	   | Aprobado	 |
DAME NOMBRES Y PROMEDIO DEL ESTU_4.0: 
Daniel 5
| NOMBRE	| PROMEDIO | ESTADO	 |
| DANIEL	| 5.00	   | Reprobado	 |
BUILD SUCCESSFUL (total time: 55 seconds)
 */