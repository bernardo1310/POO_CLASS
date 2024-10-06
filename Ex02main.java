import java.util.Scanner;
public class Ex02main {
    public static void main(String[] args) {
        Ex02 intervalo = new Ex02();
        Scanner read = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = read.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = read.nextInt();

        intervalo.mostrarIntervalo(num1, num2);
        read.close();
    }
}
