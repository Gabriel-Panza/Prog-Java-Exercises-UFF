package OOP.Lista2.Exercise1;
import java.util.Random;
import java.util.Scanner;

public class Exercise1 
{
    public static void Caixa(Scanner teclado, Pedido pedido, int quantidadeDeItens)
    {
        Random rand = new Random();
        for (int i=0;i<quantidadeDeItens;i++)
        {
            System.out.print("Informe o nome do item " + (i+1) + " do seu pedido: ");
            String nome = teclado.next();
            System.out.print("Informe a quantidade desejada do item " + (i+1) + " do seu pedido: ");
            int quantidadeDeProdutosDesejada = teclado.nextInt();
            Produto produto = new Produto(nome, rand.nextDouble(), quantidadeDeProdutosDesejada);
            pedido.SetItens(produto);
            pedido.CalculaTotal(quantidadeDeItens);
        }
        System.out.println("Informe a forma de pagamento: (0)-Dinheiro, (1)-Cheque, (2)-Cartao");
    }
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de itens no seu pedido: ");
        int quantidadeDeItens = teclado.nextInt();
        String formasDePagamento[] = {"Dinheiro","Cheque","Cartao"};

        Pedido pedido = new Pedido(quantidadeDeItens);
        Caixa(teclado, pedido, quantidadeDeItens);
        
        int Pagamento = teclado.nextInt();
        System.out.println("O pedido foi pago em " + formasDePagamento[Pagamento] + " e o preco total do pedido foi: " + pedido.GetTotal());

        teclado.close();
    }
}
