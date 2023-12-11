package ExtraExercises.Q1;

import java.util.*;

public class PrioridadePessoas <T extends Pessoa> {
    public int calcularPrioridade(T pessoa) {
        if (pessoa instanceof Professor) {
            Professor professor = (Professor) pessoa;
            return professor.getNivel() * 1000 + (int) professor.getAvaliacao() * 10 + pessoa.getIdade();
        } else if (pessoa instanceof Funcionario) {
            Funcionario funcionario = (Funcionario) pessoa;
            return (int) funcionario.getAvaliacao() * 10 + pessoa.getIdade();
        } else {
            return pessoa.getIdade();
        }
    }
    public T obterMaiorPrioridade(Collection<T> pessoas) 
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
}