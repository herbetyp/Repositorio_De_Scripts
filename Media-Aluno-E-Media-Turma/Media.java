import java.util.Scanner;

public class Media {

    static double mediaturma = 0;
    static double medialuno = 0;
    static int ind = 0;

    // Função que calcula a média do aluno
    public static void Medias(double notas) {

        // Soma a nota de cada aluno
        double soma = 0;
        for (int i = 0; i < notas; i++) {
            soma += 1;
        }
        // Soma e atualiza a nota de cada aluno
        medialuno += soma;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // cont - Define a quantidade de alunos
        int cont = 0;
        while (cont < 40) {
            medialuno = 0;

            // Entrada
            System.out.print("\nDigite a primeira nota: ");
            double w = sc.nextDouble();

            System.out.print("Digite a segunda nota: ");
            double x = sc.nextDouble();

            System.out.print("Digite a terceira nota: ");
            double y = sc.nextDouble();

            System.out.print("Digite a quarta nota: ");
            double z = sc.nextDouble();

            double[] notas = { w, x, y, z };
            cont += 1;

            // Vetor que armazena cada nota do do aluno
            for (int v = 0; v < 4; v++) {
                Medias(notas[v]);

            }

            // Armazena o indice de cada aluno
            ind += 1;
            // Soma e atualiza a media do aluno com a media da turma
            mediaturma += medialuno / 4;
            // Imprime media do aluno
            System.out.println("\n#########################");
            System.out.printf(ind + " - Média do aluno: %.1f\n", medialuno / 4);
            System.out.println("#########################");

        }
        // Imprime media da turma
        System.out.println("\n-------------------------");
        System.out.printf("Média da turma = %.2f\n", mediaturma / cont);
        System.out.println("-------------------------");

    }
}