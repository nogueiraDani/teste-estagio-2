import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor para verificar: ");
        try {
            int num = scanner.nextInt();
            System.out.println(Fibonacci.checkValue(num));
        } catch (Exception e) {
            System.out.println("Dado incorreto, favor inserir somente " + "n" +
                    "úmeros inteiros.");
        }
    }
}