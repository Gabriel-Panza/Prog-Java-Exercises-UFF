package HeritageAndPolimorph.Lista2.Exercise1;

public class Produto 
{
    private String nome;
    private double preco;
    private int quantidadeEmEstoque = 1000;
    private int quantidadeDesejada;

    public Produto(String nomeDoProduto, double precoDoProduto, int quantidadeDoProdutoDesejada)
    {
        nome=nomeDoProduto;
        preco=precoDoProduto;
        if (quantidadeDoProdutoDesejada<quantidadeEmEstoque)
            quantidadeDesejada=quantidadeDoProdutoDesejada;
        else
            System.out.println("Ultrapassou a quantidade em estoque. Atualizando quantidade desejada para o nosso limite de estoque: 1000");
            quantidadeDesejada=1000;
    }
    public String GetNome()
    {
        return this.nome;
    }
    public double calculaSubTotal()
    {
        return preco*quantidadeDesejada;
    }
}
