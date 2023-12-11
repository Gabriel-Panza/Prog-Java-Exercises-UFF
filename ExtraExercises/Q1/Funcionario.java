package ExtraExercises.Q1;

public class Funcionario extends Pessoa {
    private double avaliacao;

    public Funcionario(String nome, String cpf, int idade, double avaliacao) {
        super(nome, cpf, idade);
        this.avaliacao = avaliacao;
    }

    public double getAvaliacao() {
        return avaliacao;
    }
}