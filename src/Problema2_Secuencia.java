/***
 * Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:

	5/10
	10/12
	15/14
	20/16
	25/18
	30/20
 * @author Usuario
 */
import java.util.Scanner;
public class Problema2_Secuencia {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int contador = 5, limite, denominador = 10;
        System.out.println("DAME UN LIMITE: ");
        limite = tcl.nextInt();
        while(contador <= limite){
            System.out.println(contador + "/" + (denominador) + ", ");
            contador = contador + 5;
            denominador = denominador + 2;
        }
        System.out.println("");
    }
}
/***
 * run:
 *DAME UN LIMITE: 
 *30
 *5/10, 
 *10/12, 
 *15/14, 
 *20/16, 
 *25/18, 
 *30/20,
 */