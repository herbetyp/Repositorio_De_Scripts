import java.util.Scanner;

public class RaizEquacao {

    public static void main(String[] args) {

        // Entrada
        Scanner sr = new Scanner(System.in);
        System.out.print("Digite o valor A: ");
        int valor_a = sr.nextInt();
        if (valor_a == 0) {
            System.out.println("Valor de 'A' não pode ser = '0'. A equação não será de segundo grau!");
        } else {
            System.out.print("Digite o valor de B: ");
            int valor_b = sr.nextInt();
            System.out.print("Digite o valor de C: ");
            int valor_c = sr.nextInt();

            // Processamento e Saída
            double delta = valor_b * valor_b - 4 * valor_a * valor_c;
            double x1 = (-valor_b + Math.sqrt(delta)) / (2 * valor_a);
            double x2 = (-valor_b - Math.sqrt(delta)) / (2 * valor_a);

            if (delta < 0) {
                System.out.println("(Delta < 0). A equação NÃO possui raizes reais!");
            } else if (delta == 0) {
                System.out.printf(
                        "(Delta é = 0) e as raizes são x1 = %.4f e x2 = %.4f. A equação possui apenas UMA raiz real!\n",
                        x1, x2);
            } else {
                System.out.printf(
                        "(Delta é > 0) e as raizes são x1 = %.4f e x2 = %.4f. A equação possui DUAS raizes reais porém distintas!\n",
                        x1, x2);
            }
        }
    }
}