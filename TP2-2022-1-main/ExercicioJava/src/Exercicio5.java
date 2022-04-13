public class Exercicio5 {
class Fatorial {
    public static void main (String[] args) {
        int fatorial = 1;
        for (int n = 1; n <= 30; n++) {
            fatorial = fatorial * n;
            System.out.println("fat(" + n + ") = " + fatorial);
        }
    }
}
}
