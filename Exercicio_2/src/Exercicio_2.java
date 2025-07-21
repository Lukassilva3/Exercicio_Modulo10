import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        System.out.println("Digite 5 números para o vetor: ");
        Scanner sc = new Scanner (System.in);


        int[] vetor = new int[5];

        //O usuário insere os valores nas posições do vetor
        for (int i=0; i < vetor.length; i++){
            System.out.println("Digite o valor da posição "+i+" do seu vetor: ");
            vetor[i] = sc.nextInt();
        }
        //O console faz o calculo para ver se o número é par ou impar(Se par sera multiplicado por 2, se impar sera elevado a 2)
        for (int i=0; i < vetor.length; i++){
            if (vetor[i]%2==0){
                vetor[i] = vetor[i]*2;
            } else {
                vetor[i] = (int) Math.pow(vetor[i],2 );

            }
        }
        //O console mostra o resultado das aplicações nas posições do vetor
        for (int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }
}