package OOP.Lista2.Exercise3;
import java.util.Random;
import java.util.Scanner;

public class Exercise3 
{
    public static Pessoa Bibliotecaria(Scanner teclado)
    {
        System.out.print("Informe o seu nome: ");
        String nome = teclado.next();
        System.out.print("Informe o seu cpf: ");
        String cpf = teclado.next();
        System.out.print("Informe quanto dinheiro possui na carteira: ");
        int dinheiro = teclado.nextInt();
        System.out.print("Informe quantos livros deseja alugar: ");
        int quantidadeDeLivros = teclado.nextInt();
        System.out.print("Informe por quantas semanas deseja alugar os livros: ");
        int quantidadeDeSemanas = teclado.nextInt();

        Pessoa pessoa = new Pessoa(nome, cpf, dinheiro);
        Emprestimo emprestimo = new Emprestimo(quantidadeDeLivros, quantidadeDeSemanas);
        Random rand = new Random();
        for (int i=0;i<quantidadeDeLivros;i++)
        {
            System.out.print("Informe o nome do Livro "+ (i+1) + ": ");
            String nomeDoLivro = teclado.next();
            Livro livro = new Livro(nomeDoLivro, i+1, rand.nextInt(100));
            emprestimo.SetLivro(livro);
        }

        emprestimo.ResetIndice();
        for (int i=0;i<quantidadeDeLivros;i++)
        {
            emprestimo.custoDeCadaEmprestimo();
        }
        pessoa.SetEmprestimo(emprestimo);

        return pessoa;
    }
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        
        Pessoa pessoa = Bibliotecaria(teclado);
        
        if (pessoa.GetDinheiro()>=pessoa.GetEmprestimo().GetcustoTotal())
        {
            System.out.println("Voce tem dinheiro para fazer o emprestimo!");
            System.out.println("Seu dinheiro: " + pessoa.GetDinheiro());
            System.out.println("Dinheiro do emprestimo: " + pessoa.GetEmprestimo().GetcustoTotal());
        }
        else
        {
            System.out.println("Voce nao tem dinheiro para fazer o emprestimo!");
            System.out.println("Seu dinheiro: " + pessoa.GetDinheiro());
            System.out.println("Dinheiro do emprestimo: " + pessoa.GetEmprestimo().GetcustoTotal());
        }

        teclado.close();
    }
}