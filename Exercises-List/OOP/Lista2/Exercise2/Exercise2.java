package OOP.Lista2.Exercise2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2 
{
    public static void PreencheAgenda(Scanner teclado, int quantidadeDeContatos, Agenda agenda) throws InputMismatchException
    {
        for (int i=0;i<quantidadeDeContatos;i++)
        {
            System.out.print("Informe o nome do novo contato: ");
            String nome = teclado.next();
            System.out.print("Informe o telefone do novo contato: ");
            int telefone = teclado.nextInt();
            Contato contato = new Contato(nome, telefone);
            agenda.SetContato(contato);
        }
    }
    public static void PrintaAgenda(int quantidadeDeContatos, Agenda agenda) 
    {
        agenda.OrdenaAlfabetico(quantidadeDeContatos);
        agenda.ResetIndice();
        for (int i=0;i<quantidadeDeContatos;i++)
        {
            System.out.println("Nome do Contato " + (i+1) + ": " + agenda.GetNome());
            System.out.println("Telefone do Contato " + (i+1) + ": " + agenda.GetTelefone());
        }
    }
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de contatos: ");
        int quantidadeDeContatos = teclado.nextInt();
        
        Agenda agenda = new Agenda(quantidadeDeContatos);
        try {
            PreencheAgenda(teclado, quantidadeDeContatos, agenda);
            try {
                PrintaAgenda(quantidadeDeContatos, agenda);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("\nHouve um erro na hora de processar as informacoes. Tente novamente mais tarde...");
            }
        } 
        catch (InputMismatchException e) {
            System.out.println("\nHouve um erro na hora de processar as entradas. Tente novamente prestando mais atencao nas informacoes pedidas.");
        }

        teclado.close();
    }
}
