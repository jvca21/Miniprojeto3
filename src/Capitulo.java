import java.util.Scanner;

public class Capitulo {
    private String nome;
    private String texto;
    private String escolha1;
    private String escolha2;
    private Personagem personagem;
    private int alteracaoEnergia;
    private Scanner escaneador;

    public Capitulo(String nome, String texto, String escolha1, String escolha2, Personagem personagem, int alteracaoEnergia, Scanner escaneador) {
        this.nome = nome;
        this.texto = texto;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.personagem = personagem;
        this.alteracaoEnergia = alteracaoEnergia;
        this.escaneador = escaneador;
    }

    public void mostrar() {
        System.out.println("Nome: " + nome);
        System.out.println("Texto: " + texto);
        System.out.println("Escolha 1: " + escolha1);
        System.out.println("Escolha 2: " + escolha2);

        // Alterar a energia do personagem
        personagem.alterarEnergia(alteracaoEnergia);
    }

    public int escolher() {
        int escolha = 0;
        boolean escolhaValida = false;

        while (!escolhaValida) {
            System.out.print("Digite sua escolha (1 ou 2): ");
            String input = escaneador.nextLine();

            if (input.equals("1")) {
                escolha = 1;
                escolhaValida = true;
            } else if (input.equals("2")) {
                escolha = 2;
                escolhaValida = true;
            } else {
                System.out.println("Escolha inválida. Digite novamente.");
            }
        }

        return escolha;
    }
}
