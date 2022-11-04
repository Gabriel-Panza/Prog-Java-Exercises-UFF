package OOP.Lista2.Exercise2;

public class Contato 
{
    private String nome;
    private int telefone;

    public Contato(String nomeDoContato, int telefoneDoContato)
    {
        nome = nomeDoContato;
        telefone = telefoneDoContato;
    }

    public String GetNome()
    {
        return this.nome;
    }
    public int GetTelefone()
    {
        return this.telefone;
    }
}
