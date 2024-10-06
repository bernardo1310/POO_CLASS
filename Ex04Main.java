import java.util.Scanner;
public class Ex04Main {
    public static void main(String[] args) {
        Ex04 calculadora = new Ex04();
        Scanner read = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora? R$ ");
        double valorHora = read.nextDouble();

        System.out.print("Quantas horas você trabalhou no mês? ");
        int horasTrabalhadas = read.nextInt();

        double salarioBruto = calculadora.calcularSalarioBruto(valorHora, horasTrabalhadas);
        double ir = calculadora.calcularImpostoRenda(salarioBruto);
        double inss = calculadora.calcularInss(salarioBruto);
        double sindicato = calculadora.calcularSindicato(salarioBruto);
        double salarioLiquido = calculadora.calcularSalarioLiquido(salarioBruto, ir, inss, sindicato);

        System.out.printf("+ Salário Bruto : R$ %.2f%n", salarioBruto);
        System.out.printf("- IR (11%%) : R$ %.2f%n", ir);
        System.out.printf("- INSS (8%%) : R$ %.2f%n", inss);
        System.out.printf("- Sindicato (5%%) : R$ %.2f%n", sindicato);
        System.out.printf("= Salário Líquido : R$ %.2f%n", salarioLiquido);

        read.close();
    }
}
