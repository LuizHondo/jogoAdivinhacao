import java.util.Random;
import java.util.Scanner;

public class jogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int sortido = new Random().nextInt(100);
        int tentativas = 10;
        int chute = 0;
        System.out.println("Este é o jogo de adivinhação. O objetivo é adivinhar o número sorteado entre 0 e 100. Digite um número para começar");

        while(tentativas > 0){

            try {
                chute = leitura.nextInt();
            } catch (Exception e) {
                System.out.println("Entrada inválida, tente novamente");
                leitura.nextLine(); // limpa a entrada inválida do buffer
                continue; // pula para a próxima iteração
            }

            if (sortido > chute){
                tentativas--;
                System.out.println("O número sorteado é maior");
            }
            if (sortido < chute){
                tentativas--;
                System.out.println("O número sorteado é menor");
                System.out.println("Você ainda possui " + tentativas + " tentativas");
            }
            if (sortido == chute) {
                System.out.println("Parabéns! Você acertou!!");
                break;
            }

        }
        if (tentativas == 0){
            System.out.println("Você não possui mais tentativas, o número sortido era: "+sortido+".");
        }
        leitura.close();

    }
}
