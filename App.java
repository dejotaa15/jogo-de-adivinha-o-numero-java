import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        boolean jogarNovamente = true;
        while(jogarNovamente){
        System.out.println("""
                Esse é um jogo de adivinhação!
                Digite 1 para chutar entre 0 e 10
                Digite 2 para chutar entre 0 e 100
                Digite 3 para chutar entre 0 e 1000
                """);
        int opcao = teclado.nextInt();
        switch (opcao) {
        case 1:
            jogar(teclado, random, 10);
            break;
        case 2:
            jogar(teclado, random, 100);
            break;
        case 3:
            jogar(teclado, random, 1000);
            break;
        default:
            System.out.println("Erro, tente novamente");
        }
        System.out.println("Você deseja jogar novamente? Se sim digite 1, se não digite 0");
        int resposta = teclado.nextInt();
        jogarNovamente = (resposta==1);
        }
        System.out.println("Obrigado por jogar! Até a próxima.");
    }

    public static void jogar(Scanner teclado, Random random, int max) {
        int numeroCerto = random.nextInt(max + 1);
        int chute = -1;

        System.out.printf("Chute um número entre 0 e %d%n", max);

        while (numeroCerto != chute) {
            chute = teclado.nextInt();
            if (numeroCerto == chute) {
                System.out.printf("Você acertou! %d era o número%n", numeroCerto);
            } else if (numeroCerto < chute) {
                System.out.println("O número certo é menor que o chute");
            } else {
                System.out.println("O número certo é maior que o chute");
            }
        }
    }
}