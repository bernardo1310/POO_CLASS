public class Ex04 {
    public double calcularSalarioBruto(double valorHora, int horasTrabalhadas) {
        return valorHora * horasTrabalhadas;
    }

    public double calcularImpostoRenda(double salarioBruto) {
        return salarioBruto * 0.11;
    }

    public double calcularInss(double salarioBruto) {
        return salarioBruto * 0.08;
    }

    public double calcularSindicato(double salarioBruto) {
        return salarioBruto * 0.05;
    }

    public double calcularSalarioLiquido(double salarioBruto, double ir, double inss, double sindicato) {
        return salarioBruto - ir - inss - sindicato;
    }
}
