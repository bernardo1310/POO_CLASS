public class Ex11 {
    private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel;

    public Ex11(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public void abastecerPorValor(double valor) {
        double litros = valor / valorLitro;
        if (litros <= quantidadeCombustivel) {
            quantidadeCombustivel -= litros;
            System.out.printf("Foram abastecidos %.2f litros de %s. Total a pagar: R$ %.2f%n", litros, tipoCombustivel, valor);
        } else {
            System.out.println("Quantidade insuficiente de combustível.");
        }
    }

    public void abastecerPorLitro(double litros) {
        double valorTotal = litros * valorLitro;
        if (litros <= quantidadeCombustivel) {
            quantidadeCombustivel -= litros;
            System.out.printf("O valor a ser pago pelo abastecimento é: R$ %.2f%n", valorTotal);
        } else {
            System.out.println("Quantidade insuficiente de combustível.");
        }
    }

    public void alterarValor(double novoValor) {
        valorLitro = novoValor;
    }

    public void alterarCombustivel(String novoTipo) {
        tipoCombustivel = novoTipo;
    }

    public void alterarQuantidadeCombustivel(double novaQuantidade) {
        quantidadeCombustivel = novaQuantidade;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public double getValorLitro() {
        return valorLitro;
    }

    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }
}
