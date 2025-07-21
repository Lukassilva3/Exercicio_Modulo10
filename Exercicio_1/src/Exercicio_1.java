import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String [] args){

        int[] vetorinteiros = new int[]{55, 6, 8, 12, 101};
        OrdenacaoVetores(vetorinteiros);
        char[] vogais = new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        VogaisNome(vogais);

    }
    private static void VogaisNome(char[]vogais){
        System.out.println("Digite um nome: ");
        Scanner sc = new Scanner(System.in);
        String nomeusuario = sc.nextLine();

        char[] caracteres = nomeusuario.toCharArray();

        int contador = 0;

        for (int i = 0; i < nomeusuario.length(); i++){
            for (int j = 0; j < vogais.length; j++ ){

                if (caracteres[i] == vogais[j]){
                    contador++;
                    break;
                }
            }
        }
        System.out.println("O nome possui "+contador+" vogais");
    }
    private static void OrdenacaoVetores(int[]vetorinteiros){
        for (int i = 0; i < vetorinteiros.length; i++) {
            for (int j = i; j < vetorinteiros.length; j++) {

                if (vetorinteiros[j] < vetorinteiros[i]) {
                    int aux = vetorinteiros[i];
                    vetorinteiros[i] = vetorinteiros[j];
                    vetorinteiros[j] = aux;
                }

            }
        }
        ExibirVetorInt(vetorinteiros);
    }
    private static void ExibirVetorInt(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}

