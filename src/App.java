import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar personagem
        Personagem alfredo = new Personagem("Alfredo", 100);

        // Criar capítulo 1
        Capitulo capitulo1 = new Capitulo(
                "Capítulo 1",
                "Você acorda em um quarto escuro. O que você faz?",
                "Explorar o quarto",
                "Chamar por ajuda",
                alfredo,
                -10,
                scanner
        );

        // Mostrar capítulo 1
        capitulo1.mostrar();

        // Fazer escolha no capítulo 1
        int escolha1 = capitulo1.escolher();
        System.out.println("Escolha: " + escolha1);

        // Criar capítulo 2
        Capitulo capitulo2 = new Capitulo(
                "Capítulo 2",
                "Você encontra uma chave embaixo da cama. O que você faz?",
                "Abrir a porta do quarto",
                "Investigar o restante do quarto",
                alfredo,
                5,
                scanner
        );

        // Mostrar capítulo 2
        capitulo2.mostrar();

        // Fazer escolha no capítulo 2
        int escolha2 = capitulo2.escolher();
        System.out.println("Escolha: " + escolha2);

        // Imprimir a energia final do personagem
        System.out.println("Energia final do personagem: " + alfredo.getEnergia());

        scanner.close();
    }
}
