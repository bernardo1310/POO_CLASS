public class Ex07 {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Ex07(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void envelhecer() {
        idade++;
        if (idade < 21) {
            crescer();
        }
    }

    public void engordar(double quantidade) {
        peso += quantidade;
    }

    public void emagrecer(double quantidade) {
        peso -= quantidade;
    }

    public void crescer() {
        altura += 0.5;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
}
