import java.util.Scanner;

public class Plataforma {

    public String nome;
    public String criador;
    public Jogo[] jogos;

    public Plataforma() {
        jogos = new Jogo[2];
    }

    public void mostrarInfo() {

        System.out.println("Nome da plataforma: " + nome);
        System.out.println("Nome do criador: " + criador);
        System.out.println("Jogos: ");

        for(int i = 0; i < jogos.length; i++) {
            if(jogos[i] != null) {
                System.out.println(jogos[i].nome);
            }

        }
    }

    public void adicionarJogo(Jogo novoJogo) {
        for (int i = 0; i < jogos.length; i++) {
            if (jogos[i] == null) {
                jogos[i] = novoJogo;
                break;
            }
        }
    }

    public void mostraMaisCaroBarato() {

        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;

        String nomeJogoMaior = "";
        String nomeJogoMenor = "";

        for(int i = 0; i < jogos.length; i++) {
            if (jogos[i].preco > maior ) {
                maior = jogos[i].preco;
                nomeJogoMaior = jogos[i].nome;
            }

            if (jogos[i].preco < menor) {
                menor = jogos[i].preco;
                nomeJogoMenor = jogos[i].nome;
            }
        }
        System.out.println("O jogo mais caro é:" +  nomeJogoMaior);
        System.out.println("O jogo mais barato é:" +  nomeJogoMenor);
    }

    public void calculaDlc() {
        int count = 0;

        for(int i = 0; i < jogos.length; i++) {
            if(jogos[i].dlc) {
                count++;
            }
        }
        System.out.println(count + " jogo(s) possui dlc.");
    }
}
