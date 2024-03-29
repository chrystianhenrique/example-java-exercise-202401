import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperaturas = new double[12];

        for (int i = 0; i < 12; i++) {
            System.out.print("Digite a temperatura " + (i + 1) + " (entre 4 e 10): ");
            double temperatura = scanner.nextDouble();

            while (temperatura < 4 || temperatura > 10) {
                System.out.println("Temperatura inválida. Por favor, digite uma temperatura entre 4ºC e 10ºC.");
                System.out.print("Digite a temperatura " + (i + 1) + " novamente: ");
                temperatura = scanner.nextDouble();
            }
            temperaturas[i] = temperatura;
        }

        double soma = 0;
        for (double temp : temperaturas) {
            soma += temp;
        }

        double media = soma / temperaturas.length;
        System.out.println("A média das temperaturas é: " + String.format("%.2f", media) + "ºC");

        scanner.close();
    }
}