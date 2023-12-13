package ExtraExercises.Q1;

public class Professor extends Funcionario {
    private int nivel;

    public Professor(String nome, String cpf, int idade, double avaliacao, int nivel) {
        super(nome, cpf, idade, avaliacao);
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void imprimirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Idade: " + getIdade());
        System.out.println("Avaliaçao: " + getAvaliacao());
        System.out.println("Nível: " + getNivel());
        System.out.println("--------");
    }
}