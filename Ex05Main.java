import java.util.Scanner;
public class Ex05Main {
    public static void main(String[] args) {
        Ex05 cardapio = new Ex05();
        Scanner read = new Scanner(System.in);
        double total = 0.0;

        while (true) {
            System.out.print("Digite o código do item (ou 0 para encerrar o pedido): ");
            int codigo = read.nextInt();

            if (codigo == 0) {
                break;
            }

            System.out.print("Digite a quantidade: ");
            int quantidade = read.nextInt();

            double precoItem = cardapio.calcularPreco(codigo, quantidade);
            total += precoItem;

            if (precoItem > 0) {
                System.out.printf("Valor do item: R$ %.2f%n", precoItem);
            }
        }

        System.out.printf("Total geral do pedido: R$ %.2f%n", total);
        read.close();
    }
}
