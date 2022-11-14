import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise4
{
    private static void preencheArvoreGeneologica(Pessoa[] arvoreGeneologica, int tam, Scanner teclado) throws InputMismatchException
    {
        for (int i=tam-1;i>-1;i--)
        {
            Pessoa pessoa = new Pessoa(null, 0, null, null);
            System.out.print("\nInforme o nome da pessoa: ");
            pessoa.setNome(teclado.next());
            System.out.print("Informe a idade da pessoa: ");
            pessoa.setIdade(teclado.nextInt());
            System.out.print("Informe o nome do pai da pessoa: ");
            pessoa.setPai(teclado.next());
            System.out.print("Informe o nome da mae da pessoa: ");
            pessoa.setMae(teclado.next());
            arvoreGeneologica[i] = pessoa;
        }
    }
    private static void printaArvoreGeneologica(Pessoa[] arvoreDaPessoa, int tam) throws ArrayIndexOutOfBoundsException
    {
        for (int i=0;i<tam;i++)
        {
            System.out.println("\n");
            System.out.println("-> nome: " + arvoreDaPessoa[i].getNome());
            System.out.println("-> idade: " + arvoreDaPessoa[i].getIdade());
            System.out.println("-> pai: " + arvoreDaPessoa[i].getPai());
            System.out.println("-> mae: " + arvoreDaPessoa[i].getMae());
        }
    }
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe quantas pessoas sua arvore geneologica tem: ");
        int tam = teclado.nextInt();
        Pessoa arvoreGeneologica[] = new Pessoa[tam];
        
        try {
            System.out.print("\nPreenchendo a arvore geneologica de baixo para cima...\n");
            preencheArvoreGeneologica(arvoreGeneologica, tam, teclado);
        } 
        catch (InputMismatchException e) {
            System.out.println("\nHouve um erro na hora de preencher a arvore. Verifique se preencheu as informacoes corretamente e tente novamente...");
            return;
        }
        try {
            System.out.print("\nPrintando a arvore geneologica de cima para baixo...\n");
            printaArvoreGeneologica(arvoreGeneologica, tam);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nHouve um erro na hora de processar a arvore. Tente novamente mais tarde...");
            return;
        }
    
        teclado.close();
    }
}