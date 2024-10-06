public class Ex08 {
    private String numeroConta;
    private String nome;
    private double saldo;

    public Ex08(String numeroConta, String nome, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = saldoInicial;
    }

    public void incluirConta(String numeroConta, String nome) {
        if (validarConta(numeroConta) && validarNome(nome)) {
            this.numeroConta = numeroConta;
            this.nome = nome;
            this.saldo = 0.0;
        }
    }

    public void alterarNome(String nome) {
        if (validarNome(nome)) {
            this.nome = nome;
        }
    }

    public void deposito(double valor) {
        if (validarDeposito(valor)) {
            saldo += valor;
        }
    }

    public void saque(double valor) {
        if (validarSaque(valor)) {
            saldo -= valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getNome() {
        return nome;
    }

    private boolean validarConta(String numeroConta) {
        return numeroConta != null && !numeroConta.isEmpty();
    }

    private boolean validarNome(String nome) {
        return nome != null && !nome.isEmpty();
    }

    private boolean validarDeposito(double valor) {
        return valor > 0;
    }

    private boolean validarSaque(double valor) {
        return valor > 0 && valor <= saldo;
    }
}
