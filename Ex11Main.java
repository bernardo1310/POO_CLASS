import java.util.Scanner;

public class Ex11Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Ex11 bomba = new Ex11("Gasolina", 5.00, 1000.0);

        while (true) {
            System.out.println("\n1. Abastecer por Valor");
            System.out.println("2. Abastecer por Litro");
            System.out.println("3. Alterar Valor do Litro");
            System.out.println("4. Alterar Tipo de Combustível");
            System.out.println("5. Alterar Quantidade de Combustível");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = read.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o valor a ser abastecido: ");
                double valor = read.nextDouble();
                bomba.abastecerPorValor(valor);
            } else if (opcao == 2) {
                System.out.print("Digite a quantidade de litros a ser abastecida: ");
                double litros = read.nextDouble();
                bomba.abastecerPorLitro(litros);
            } else if (opcao == 3) {
                System.out.print("Digite o novo valor do litro: ");
                double novoValor = read.nextDouble();
                bomba.alterarValor(novoValor);
            } else if (opcao == 4) {
                System.out.print("Digite o novo tipo de combustível: ");
                String novoTipo = read.next();
                bomba.alterarCombustivel(novoTipo);
            } else if (opcao == 5) {
                System.out.print("Digite a nova quantidade de combustível: ");
                double novaQuantidade = read.nextDouble();
                bomba.alterarQuantidadeCombustivel(novaQuantidade);
            } else if (opcao == 6) {
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }

        read.close();
    }
}
