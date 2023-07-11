public class Personagem {
    private String nome;
    private int energia;

    public Personagem(String nome, int energia) {
        this.nome = nome;
        this.energia = energia;
    }

    public void alterarEnergia(int alteracao) {
        energia += alteracao;
    }

    public int getEnergia() {
        return energia;
    }
}
