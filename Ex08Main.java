import java.util.Scanner;
public class Ex08Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        String numeroConta = read.nextLine();

        System.out.print("Digite o nome do titular: ");
        String nome = read.nextLine();

        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = read.nextDouble();

        Ex08 conta = new Ex08(numeroConta, nome, saldoInicial);

        while (true) {
            System.out.println("\n1. Alterar Nome");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Ver Saldo");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = read.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o novo nome: ");
                String novoNome = read.next();
                conta.alterarNome(novoNome);
            } else if (opcao == 2) {
                System.out.print("Digite o valor do depósito: ");
                double valorDeposito = read.nextDouble();
                conta.deposito(valorDeposito);
            } else if (opcao == 3) {
                System.out.print("Digite o valor do saque: ");
                double valorSaque = read.nextDouble();
                conta.saque(valorSaque);
            } else if (opcao == 4) {
                System.out.printf("Saldo atual: R$ %.2f%n", conta.getSaldo());
            } else if (opcao == 5) {
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }
        read.close();
    }
}
