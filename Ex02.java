public class Ex02 {
    public void mostrarIntervalo(int num1, int num2) {
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
            System.out.println("Valores invertidos.");
        }

        for (int i = num1; i <= num2; i++) {
            System.out.println(i);
        }
    }
}
