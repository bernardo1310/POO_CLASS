public class Ex05 {
    public double calcularPreco(int codigo, int quantidade) {
        double preco = 0.0;

        if (codigo == 100) {
            preco = 1.20 * quantidade;
        } else if (codigo == 101) {
            preco = 1.30 * quantidade;
        } else if (codigo == 102) {
            preco = 1.50 * quantidade;
        } else if (codigo == 103) {
            preco = 1.20 * quantidade;
        } else if (codigo == 104) {
            preco = 1.30 * quantidade;
        } else if (codigo == 105) {
            preco = 1.00 * quantidade;
        } else {
            System.out.println("Código inválido!");
        }

        return preco;
    }
}
