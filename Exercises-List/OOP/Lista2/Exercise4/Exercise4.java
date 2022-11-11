import java.util.Scanner;

public class Exercise4
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe quantas pessoas sua arvore geneologica tem: ");
        int tam = teclado.nextInt();
        Pessoa arvoreGeneologica[] = new Pessoa[tam];
        
        System.out.print("\nPreenchendo a arvore geneologica de baixo para cima...\n");
        preencheArvoreGeneologica(arvoreGeneologica, tam, teclado);
        System.out.print("\nPrintando a arvore geneologica de cima para baixo...\n");
        printaArvoreGeneologica(arvoreGeneologica, tam);

        teclado.close();
    }

    private static void preencheArvoreGeneologica(Pessoa[] arvoreGeneologica, int tam, Scanner teclado) 
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
    private static void printaArvoreGeneologica(Pessoa[] arvoreDaPessoa, int tam) 
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
}