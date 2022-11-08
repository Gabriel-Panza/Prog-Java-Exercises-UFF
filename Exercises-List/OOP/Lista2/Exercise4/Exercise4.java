import java.util.Scanner;

public class Exercise4
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe quantas pessoas sua arvore geneologica tem: ");
        int tam = teclado.nextInt();
        Pessoa arvoreGeneologica[] = new Pessoa[tam];
        
        int qntdFilhos = 0;
        for (int i=0;i<tam;i++)
        {
            Pessoa pessoa = new Pessoa(null, 0, null, null);
            System.out.print("Informe o nome da pessoa: ");
            pessoa.setNome(teclado.next());
            System.out.print("Informe a idade da pessoa: ");
            pessoa.setIdade(teclado.nextInt());
            if (i>3) // Defino os 4 primeiros membros da arvore
            {
                System.out.println("Informe de quem voce eh descendente: (0)-Familia da Esquerda (1)-Familia da Direita");
                int descendente = teclado.nextInt();
                if (descendente==0)
                {
                    pessoa.setPai(arvoreGeneologica[i-4-qntdFilhos]);
                    pessoa.setMae(arvoreGeneologica[i-3-qntdFilhos]);
                }
                else if (descendente==1)
                {
                    pessoa.setPai(arvoreGeneologica[i-2-qntdFilhos]);
                    pessoa.setMae(arvoreGeneologica[i-1-qntdFilhos]);
                }
                else
                {
                    System.out.print("Numero errado errado");
                }
                qntdFilhos+=1;
            }
            arvoreGeneologica[i] = pessoa;
        }
        printaArvoreGeneologica(arvoreGeneologica, tam);

        teclado.close();
    }

    private static void printaArvoreGeneologica(Pessoa[] arvoreDaPessoa, int tam) 
    {
        for (int i=0;i<tam;i++)
        {
            System.out.println("Pessoa " + (i+1));
            System.out.println("-> nome: " + arvoreDaPessoa[i].getNome());
            System.out.println("-> idade: " + arvoreDaPessoa[i].getIdade());
            if (i>3)
            {
                System.out.println("-> pai: " + arvoreDaPessoa[i].getPai().getNome());
                System.out.println("-> mae: " + arvoreDaPessoa[i].getMae().getNome());
            }
        }
    }
}