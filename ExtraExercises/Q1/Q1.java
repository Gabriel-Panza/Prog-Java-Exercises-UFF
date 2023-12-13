package ExtraExercises.Q1;

import java.util.*;

public class Q1 <T extends Pessoa> {
    public int calcularPrioridade(T pessoa) {
        if (pessoa.getClass() == Professor.class) {
            Professor professor = (Professor) pessoa;
            return professor.getNivel() * 1000 + (int) professor.getAvaliacao() * 10 + pessoa.getIdade();
        } else if (pessoa.getClass() == Funcionario.class) {
            Funcionario funcionario = (Funcionario) pessoa;
            return (int) funcionario.getAvaliacao() * 10 + pessoa.getIdade();
        } else {
            return pessoa.getIdade();
        }
    }
    public T obterMaiorPrioridade(ArrayList<T> pessoas) 
    {
        T maiorPrioridade = null;
        int maiorPrioridadeValor = Integer.MIN_VALUE;

        for (T pessoa : pessoas) {
            int prioridade = calcularPrioridade(pessoa);

            if (prioridade > maiorPrioridadeValor) {
                maiorPrioridadeValor = prioridade;
                maiorPrioridade = pessoa;
            }
        }
        return maiorPrioridade;
    }
    public void imprimirInformacoes(ArrayList<T> pessoas) {
        for (T pessoa : pessoas) {
            pessoa.imprimirInformacoes();
        }
    }
    public static <T extends Pessoa> void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        String nome;
        int idade, cont=0;
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        do{
            idade = teclado.nextInt();
            if(idade==-1) break;
            nome = teclado.next();
            if (cont%2==0) pessoas.add(new Professor(nome, "1234", idade, random.nextInt(10), random.nextInt(4)));
            else pessoas.add(new Funcionario(nome, "5678", idade, random.nextInt(10)));
            cont+=1;
        } while (true);
        Q1<T> q1 = new Q1<>();
        q1.imprimirInformacoes((ArrayList<T>) pessoas);
        T melhorPessoa = q1.obterMaiorPrioridade((ArrayList<T>) pessoas);
        System.out.println("A pessoa de maior prioridade eh: " + melhorPessoa.getNome());
        teclado.close();
    }
}