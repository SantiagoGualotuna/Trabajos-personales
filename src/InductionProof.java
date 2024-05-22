//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class InductionProof {

    public static void main(String[] args) {
        // Definimos el rango de valores para los que queremos comprobar la desigualdad
        int start = 5;  // inicio de n
        int end = 20;   // fin de n

        // Verificamos la desigualdad para cada valor de n en el rango
        for (int n = start; n <= end; n++) {
            // Calculamos n^2
            int nSquared = n * n;
            // Calculamos 2^n
            int twoPowerN = (int) Math.pow(2, n);

            // Verificamos si n^2 es menor que 2^n
            if (nSquared < twoPowerN) {
                System.out.println("Para n = " + n + ": " + n + "^2 = " + nSquared + " < 2^" + n + " = " + twoPowerN);
            } else {
                System.out.println("Para n = " + n + ": " + n + "^2 = " + nSquared + " >= 2^" + n + " = " + twoPowerN);
            }
        }
    }
}
