package OOP.Lista2.Exercise3;

public class Livro 
{
    private String nome;
    private int id;
    private int custo;

    public Livro(String nomeDoLivro, int idDoLivro, int custoDoLivro)
    {
        nome = nomeDoLivro;
        id = idDoLivro;
        custo = custoDoLivro;
    }

    public String GetNome()
    {
        return this.nome;
    }
    public int GetId()
    {
        return this.id;
    }
    public int GetCusto()
    {
        return this.custo;
    }
}
