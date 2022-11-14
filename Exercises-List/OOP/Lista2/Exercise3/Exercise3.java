package OOP.Lista2.Exercise3;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exercise3 
{
    public static Pessoa Bibliotecaria(Scanner teclado) throws InputMismatchException
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
        PreencheLivros(teclado, quantidadeDeLivros, emprestimo);
        
        try {
            CalculaEmprestimoTotal(quantidadeDeLivros, emprestimo, pessoa);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nHouve um erro na hora de processar as informacoes. Tente novamente mais tarde...");
        }

        return pessoa;
    }
    public static void PreencheLivros(Scanner teclado, int quantidadeDeLivros, Emprestimo emprestimo) 
    {
        Random rand = new Random();
        for (int i=0;i<quantidadeDeLivros;i++)
        {
            System.out.print("Informe o nome do Livro "+ (i+1) + ": ");
            String nomeDoLivro = teclado.next();
            Livro livro = new Livro(nomeDoLivro, i+1, rand.nextInt(100));
            emprestimo.SetLivro(livro);
        }   
    }
    public static void CalculaEmprestimoTotal(int quantidadeDeLivros, Emprestimo emprestimo, Pessoa pessoa) throws ArrayIndexOutOfBoundsException
    {
        emprestimo.ResetIndice();
        for (int i=0;i<quantidadeDeLivros;i++)
        {
            emprestimo.custoDeCadaEmprestimo();
        }
        pessoa.SetEmprestimo(emprestimo);    
    }
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        Pessoa pessoa;
        try {
            pessoa = Bibliotecaria(teclado);
        } 
        catch (InputMismatchException e) {
            System.out.println("\nHouve um erro na hora de processar as entradas. Tente novamente prestando mais atencao nas informacoes pedidas.");
            return;
        }
        if (pessoa.GetDinheiro()>=pessoa.GetEmprestimo().GetcustoTotal())
            System.out.println("Voce tem dinheiro para fazer o emprestimo!");
        else
            System.out.println("Voce nao tem dinheiro para fazer o emprestimo!");
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        System.out.println("Seu dinheiro: " + numberFormat.format(pessoa.GetDinheiro()));
        System.out.println("Dinheiro do emprestimo: " + numberFormat.format(pessoa.GetEmprestimo().GetcustoTotal()));
        
        teclado.close();
    }
}