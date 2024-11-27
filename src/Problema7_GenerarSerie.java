/***
 * Generar e imprimir la siguiente serie:
 *sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
 */
public class Problema7_GenerarSerie {
    public static void main(String[] args) {
        double sumatoria = 0;
        String serie = "";
        int i = 1;
        while (i <= 10) {
            double term = 1.0 / i;
            if (i % 2 != 0) {
                sumatoria -= term;
                serie += "-(" + "1/" + i + ")";
            } else {
                sumatoria += term;
                serie += "+(" + "1/" + i + ")";
            }
            i++;
        }
        System.out.println("Serie: " + serie);
        System.out.println("Sumatoria: " + sumatoria);
    }
}

/***
 * run:
Serie: -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
Sumatoria: -0.6456349206349207
BUILD SUCCESSFUL (total time: 0 seconds)

 */
