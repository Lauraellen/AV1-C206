public class Jogo {

    public String nome;
    public String genero;
    public double preco;
    public boolean dlc;

    void mostrarInfo() {
        System.out.println("Nome do jogo: " + nome);
        System.out.println("Genero: " + genero);
        System.out.println("Preco: " + preco);
        System.out.println("Possui dlc?: " + dlc);
    }
}
