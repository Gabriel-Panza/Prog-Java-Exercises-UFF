package HeritageAndPolimorph.Lista2.Exercise2;

public class Contato 
{
    private String nome;
    private int telefone[];

    public Contato(String nomeDoContato, int telefoneDoContato)
    {
        nome = nomeDoContato;
        telefone[0] = telefoneDoContato;
    }

    public String GetNome()
    {
        return this.nome;
    }
    public void SetTelefones(int telefones[], int qntdDeNumeros)
    {
        for (int i=1;i<qntdDeNumeros; i++)
        {
            telefone[i] = telefones[i];
        }
    }
    public int GetTelefone()
    {
        return this.telefone[0];
    }
}
