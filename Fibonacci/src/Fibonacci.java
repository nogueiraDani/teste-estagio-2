import java.util.ArrayList;

public class Fibonacci {
    /** Classe para gerar números Fibonacci e verificar existencia ou nao de
     *  um valor específico.
     * @author: Daniela Nogueira Rampim
     * */


    private static ArrayList<Integer> generateListFibonacci(int n) {
        /* método para gerar uma lista com a sequencia Fibonacci
         @return: ArrayList com os números Fibonacci
         */

        ArrayList<Integer> list = new ArrayList<>();
        int a = 0;
        int b = 1;
        int c;

        if (n == 0) {
            list.add(n);
        } else {
            list.add(a);
            list.add(b);
            for (int i = 2; i <= n + 3; i++) {
                c = a + b;
                a = b;
                b = c;
                list.add(c);
            }
        }

        return list;
    }

    static String checkValue(int n) {

        /* método para verificar se numero está dentro ou nao da lista.
        @return: String com a mensagem da validação.
        */

        ArrayList<Integer> list = generateListFibonacci(n);
        boolean result = list.contains(n);
        if (result) {
            return String.format("O número %d pertence á sequência " + "Fibonnaci", n);
        } else {
            return String.format("O número %d não pertence á sequência " + "Fibonacci", n);
        }
    }
}