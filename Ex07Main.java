import java.util.Scanner;

public class Ex07Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite o nome da pessoa: ");
        String nome = read.nextLine();

        System.out.print("Digite a idade da pessoa: ");
        int idade = read.nextInt();

        System.out.print("Digite o peso da pessoa (kg): ");
        double peso = read.nextDouble();

        System.out.print("Digite a altura da pessoa (cm): ");
        double altura = read.nextDouble();

        Ex07 pessoa = new Ex07(nome, idade, peso, altura);

        System.out.printf("Nome: %s%nIdade: %d%nPeso: %.2f kg%nAltura: %.2f cm%n", 
                          pessoa.getNome(), pessoa.getIdade(), pessoa.getPeso(), pessoa.getAltura());

        pessoa.envelhecer();
        System.out.printf("Após envelhecer: Idade: %d, Altura: %.2f cm%n", 
                          pessoa.getIdade(), pessoa.getAltura());

        System.out.print("Quantos quilos deseja engordar? ");
        double engordar = read.nextDouble();
        pessoa.engordar(engordar);
        System.out.printf("Peso após engordar: %.2f kg%n", pessoa.getPeso());

        System.out.print("Quantos quilos deseja emagrecer? ");
        double emagrecer = read.nextDouble();
        pessoa.emagrecer(emagrecer);
        System.out.printf("Peso após emagrecer: %.2f kg%n", pessoa.getPeso());

        read.close();
    }
}
