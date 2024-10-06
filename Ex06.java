public class Ex06 {
    private double lado;

    public Ex06(double lado) {
        this.lado = lado;
    }

    public void mudarValorLado(double lado) {
        this.lado = lado;
    }

    public double retornarValorLado() {
        return lado;
    }

    public double calcularArea() {
        return lado * lado;
    }
}
