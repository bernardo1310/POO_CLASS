import java.util.Scanner;
public class Ex10Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Ex10 televisor = new Ex10();

        while (true) {
            System.out.println("\n1. Mudar Canal");
            System.out.println("2. Aumentar Volume");
            System.out.println("3. Diminuir Volume");
            System.out.println("4. Mostrar Canal e Volume");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = read.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o número do canal (1-99): ");
                int canal = read.nextInt();
                televisor.setCanal(canal);
            } else if (opcao == 2) {
                televisor.aumentarVolume();
            } else if (opcao == 3) {
                televisor.diminuirVolume();
            } else if (opcao == 4) {
                System.out.printf("Canal: %d%nVolume: %d%n", televisor.getCanal(), televisor.getVolume());
            } else if (opcao == 5) {
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }
        read.close();
    }
}
