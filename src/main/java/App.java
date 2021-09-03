import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Plataforma plataforma = new Plataforma();

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o nome da plataforma: ");
        plataforma.nome = sc.nextLine();

        System.out.println("Insira o nome do criador: ");
        plataforma.criador = sc.nextLine();


        for(int i = 0; i < plataforma.jogos.length; i++) {
            plataforma.jogos[i] = new Jogo();

            System.out.println("Insira o nome do jogo:");
            plataforma.jogos[i].nome = sc.nextLine();

            System.out.println("Insira o genero:");
            plataforma.jogos[i].genero = sc.nextLine();

            System.out.println("Preco:");
            plataforma.jogos[i].preco = sc.nextDouble();

            System.out.println("Possui dlc?");
            plataforma.jogos[i].dlc = sc.nextBoolean();

        }

        plataforma.mostrarInfo();
        plataforma.mostraMaisCaroBarato();
        plataforma.calculaDlc();
    }
}
