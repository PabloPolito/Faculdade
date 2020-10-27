import java.util.Scanner;

class Jogador {

int numero=0;
public void palpite(){
numero = (int) (Math.random() * 3);
System.out.println("Estou pensando no numero...... " + numero);
    }
}


public class CriarJogo {

    public static void main(String[] args) {

        JogoSuposicoes meuJogo = new JogoSuposicoes();

        meuJogo.iniciarJogo();

    }
}


class JogoSuposicoes {
    Jogador marcelo;
    Jogador eliane;
    Jogador pedro;

    public void iniciarJogo(){
        marcelo = new Jogador();
        eliane = new Jogador();
        pedro = new Jogador();

        int suposicaoUm = 0;
        int suposicaoDois = 0;
        int suposicaoTres = 0;
        int numeroAlvo = 0;

        numeroAlvo = (int) (Math.random() * 3);

        int contador=1;
        
        while(contador <= 2) {

            boolean mEstaCerto = false;
            boolean eEstaCerto = false;
            boolean pEstaCerto = false;
            
            System.out.println("\n O numero a ser adivinhado e...    " + numeroAlvo + "\n");


            Scanner entrada = new Scanner( System.in );
            System.out.println("\nDigite um palpite para o jogador um:  ");
            marcelo.numero = entrada.nextInt();
            suposicaoUm = marcelo.numero;

            System.out.println("\nDigite um palpite para o jogador dois:  ");
            eliane.numero = entrada.nextInt();
            suposicaoDois = eliane.numero;
            
            System.out.println("\nDigite um palpite para o jogador tres:  ");
            pedro.numero = entrada.nextInt();
            suposicaoTres = pedro.numero;

            System.out.println("Respostas: \n");

            if(suposicaoUm == numeroAlvo) {
                mEstaCerto = true;
                System.out.println("Jogador um acertou! " + mEstaCerto);
            }
            if(suposicaoDois == numeroAlvo) {
                eEstaCerto = true;
                System.out.println("Jogador um acertou! " + eEstaCerto);
            }
            if(suposicaoTres == numeroAlvo) {
                pEstaCerto = true;
                System.out.println("Jogador um acertou! " + pEstaCerto);
            }
            if(mEstaCerto && eEstaCerto && pEstaCerto){
                System.out.println("Os tres jogadores acertaram! ");
            }
            if((suposicaoUm != numeroAlvo) && (suposicaoDois != numeroAlvo) && (suposicaoTres != numeroAlvo)){
                System.out.println("Os tres jogadores erraram! ");
            }
            entrada.close();
            contador++;
            System.out.println("--------------------------------------------------------");
        }
    }
}