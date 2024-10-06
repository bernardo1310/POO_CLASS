public class Ex01 {
    private String nome = "Bernardo";
    private String sobrenome = "Coelho";

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Nome = ");
        builder.append(nome);
        builder.append("\nSobrenome = ");
        builder.append(sobrenome);
        return builder.toString();
    }
}