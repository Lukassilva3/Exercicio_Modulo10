import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        System.out.println("Digite um nome qualquer: ");
        Scanner sc = new Scanner(System.in);

        String nomeescolhido = sc.nextLine();
        char[]caractere = nomeescolhido.toCharArray();

        for (int i = 0; i < caractere.length/2;i++){
            int j = caractere.length - 1 - i;
            char aux = caractere[i];
            caractere[i] = caractere[j];
            caractere[j] = aux;
        }
        for (int i = 0; i < caractere.length; i++){
            System.out.print(caractere[i]);
        }
    }
}
