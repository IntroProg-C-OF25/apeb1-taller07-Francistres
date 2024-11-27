/***
 * Generar una solución que permita ingresar jugadores de fútbol; por cada jugador se debe solicitar:
 *Nombre el jugador
 *Posición en el campo de juego
 *Edad
 *Estatura
 *El ciclo de ingreso de información deberá terminar cuando el usuario lo decida. 
 *Se debe imprimir el siguiente reporte (usar una cadena de acumulación):
 * Listado de Jugadores
 1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
 2. Xavier Arreaga -Defensa-, edad 24, estatura 1.85
 3. Moisés Caicedo -Mediocentro-, edad 19, estatura 1.88
 4. Ángel Mena -Delantero-, edad 32, estatura 1.75
 5. Michael Estrada -Delantero-, edad 27, estatura 1.93
 *Promedio de edades:  26.8
 *Promedio de estaturas: 1.87
 */
import java.util.Scanner;
public class Problema4_JugadoresFut { 
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre, posicion, reporte = "Listado de jugadores\n";
        int edad, contador = 1, sumaEdad = 0;
        double estatura, sumaEstatu = 0, promEdad, promEstatu;
        while (true) {
            System.out.print("DAME EL NOMBRE DEL JUGADOR " + contador + ": ");
            nombre = tcl.nextLine();
            System.out.print("DAME SU POSICION EN EL CAMPO, SU EDAD Y ESTATURA: ");
            posicion = tcl.next();
            edad = tcl.nextInt();
            estatura = tcl.nextDouble();
            tcl.nextLine();
            reporte += contador + ". " + nombre + " -" + posicion + "-, edad " + edad + ", estatura " + estatura + "\n";
            sumaEdad += edad;
            sumaEstatu += estatura;
            contador++;
            System.out.print("¿Deseas ingresar otro jugador? (si/no): ");
            String respuesta = tcl.nextLine();
            if (respuesta.equalsIgnoreCase("no")) {
                break;
            }
        }
        promEdad = sumaEdad /(contador - 1);
        promEstatu = sumaEstatu /(contador - 1);
        System.out.println(reporte);
        System.out.println("Promedio de edades: " + String.format("%.1f", promEdad));
        System.out.println("Promedio de estaturas: " + String.format("%.2f", promEstatu));
    }
}
/***
 * run:
 *DAME EL NOMBRE DEL JUGADOR 1: Alexander Dominguez
 *DAME SU POSICION EN EL CAMPO, SU EDAD Y ESTATURA: Arquero 32 1.95
 *�Deseas ingresar otro jugador? (si/no): si
 *DAME EL NOMBRE DEL JUGADOR 2: Xavier Arreaga
 *DAME SU POSICION EN EL CAMPO, SU EDAD Y ESTATURA: Defensa 24 1.85
 *�Deseas ingresar otro jugador? (si/no): si
 *DAME EL NOMBRE DEL JUGADOR 3: Moises Caicedo
 *DAME SU POSICION EN EL CAMPO, SU EDAD Y ESTATURA: Mediocentro 19 1.88
 *�Deseas ingresar otro jugador? (si/no): si
 *DAME EL NOMBRE DEL JUGADOR 4: Angel Mena
 *DAME SU POSICION EN EL CAMPO, SU EDAD Y ESTATURA: Delantero 32 1.75
 *�Deseas ingresar otro jugador? (si/no): si
 *DAME EL NOMBRE DEL JUGADOR 5: Michale Estrada
 *DAME SU POSICION EN EL CAMPO, SU EDAD Y ESTATURA: Delantero 27 1.93
 *�Deseas ingresar otro jugador? (si/no): no
 *Listado de jugadores
 1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
 2. Xavier Arreaga -Defensa-, edad 24, estatura 1.85
 3. Moises Caicedo -Mediocentro-, edad 19, estatura 1.88
 4. Angel Mena -Delantero-, edad 32, estatura 1.75
 5. Michale Estrada -Delantero-, edad 27, estatura 1.93
 Promedio de edades: 26.0
 Promedio de estaturas: 1.87
BUILD SUCCESSFUL (total time: 1 minute 58 seconds)
 */