import java.util.Scanner;

public class Ex01main {
    public static void main(String[] args) {
        Ex01 pessoa = new Ex01();
        Scanner read = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = read.nextLine();
        String[] partes = nomeCompleto.split(" ", 2);
        
        pessoa.setNome(partes[0]); 
        if (partes.length > 1) {
            pessoa.setSobrenome(partes[1]); 
        } else {
            pessoa.setSobrenome("");
        }
        System.out.println(pessoa.toString());
        read.close();
    }
}