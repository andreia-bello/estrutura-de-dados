import java.util.Scanner;
import java.util.InputMismatchException;

public class ordenacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantidade = 0;

        while (true) {
            try {
                System.out.print("Digite a quantidade de notas: ");
                quantidade = sc.nextInt();

                if (quantidade <= 0) {
                    System.out.println("A quantidade precisa ser maior que zero!");
                } else {
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Erro! Informe um número inteiro maior que zero.");
                sc.next(); 
            }
        }

        double[] notas = new double[quantidade];

        for (int i = 0; i < quantidade; i++) {

            while (true) {
                try {
                    System.out.print("Digite a " + (i + 1) + " nota: ");
                    notas[i] = sc.nextDouble();
                    break;

                } catch (InputMismatchException e) {
                    System.out.println("Erro! Informe uma nota numérica válida.");
                    sc.next(); 
                }
            }
        }

        for (int i = 0; i < notas.length - 1; i++) {

            int menor = i;

            for (int j = i + 1; j < notas.length; j++) {

                if (notas[j] < notas[menor]) {
                    menor = j;
                }
            }

            double auxiliar = notas[i];
            notas[i] = notas[menor];
            notas[menor] = auxiliar;
        }

        // Exibição das notas ordenadas
        System.out.println("Notas em ordem crescente:");

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

        sc.close();
    }
}