import java.util.Scanner;
public class Ex06Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Digite o tamanho do lado do quadrado: ");
        double lado = read.nextDouble();
        
        Ex06 quadrado = new Ex06(lado);
        
        System.out.printf("Lado do quadrado: %.2f%n", quadrado.retornarValorLado());
        System.out.printf("Área do quadrado: %.2f%n", quadrado.calcularArea());

        System.out.print("Digite um novo valor para o lado do quadrado: ");
        double novoLado = read.nextDouble();
        quadrado.mudarValorLado(novoLado);
        
        System.out.printf("Novo lado do quadrado: %.2f%n", quadrado.retornarValorLado());
        System.out.printf("Nova área do quadrado: %.2f%n", quadrado.calcularArea());

        read.close(); 
    }
}