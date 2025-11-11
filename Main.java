import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Bingo bingo = new Bingo();
            int opcao = -1;

            while (opcao != 0) {
                System.out.println("\n===== MENU BINGO =====");
                System.out.println("1 - Sortear novo número");
                System.out.println("2 - Exibir números sorteados");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");

                try {
                    opcao = scanner.nextInt();
                    scanner.nextLine(); 

                    switch (opcao) {
                        case 1:
                            if (bingo.contarNumerosSorteados() >= 60) {
                                System.out.println("Todos os números já foram sorteados!");
                            } else {
                                int numero = bingo.sortearNumero();
                                if (numero == -1) {
                                    System.out.println("Não há mais números para sortear.");
                                } else {
                                    System.out.println("Número sorteado: " + numero);
                                }
                            }
                            break;

                        case 2:
                            bingo.exibirBolasSorteadas();
                            break;

                        case 0:
                            System.out.println("Encerrando o jogo. Até mais!");
                            break;

                        default:
                            System.out.println("Opção inválida! Digite 1, 2 ou 0.");
                    }

                } catch (InputMismatchException ex) {
                    System.out.println("Entrada inválida. Digite um número (0, 1 ou 2).");
                    scanner.nextLine(); 
                }
            }
        }
    }
}
