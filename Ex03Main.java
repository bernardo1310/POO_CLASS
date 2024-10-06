import java.util.Scanner;
public class Ex03Main {
    public static void main(String[] args) {
        Ex03 calc = new Ex03();
        Scanner read = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = read.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = read.nextDouble();

        System.out.println("Soma: " + calc.somar(num1, num2));
        System.out.println("Subtração: " + calc.subtrair(num1, num2));
        System.out.println("Multiplicação: " + calc.multiplicar(num1, num2));

        if (num2 != 0) {
            System.out.println("Divisão: " + calc.dividir(num1, num2));
        } else {
            System.out.println("Divisão por zero não é permitida.");
        }
        read.close();
    }
}
