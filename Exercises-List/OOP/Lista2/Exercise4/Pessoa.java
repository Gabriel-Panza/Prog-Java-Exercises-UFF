public class Pessoa 
{
    private String nome;
    private int idade;
    private Pessoa pai;
    private Pessoa mae;

    public Pessoa(String nomeDaPessoa, int idadeDaPessoa, Pessoa paiDaPessoa, Pessoa maeDaPessoa)
    {
        nome = nomeDaPessoa;
        idade = idadeDaPessoa;
        pai = paiDaPessoa;
        mae = maeDaPessoa;
    }

    public void setNome(String nomeDaPessoa)
    {
        nome = nomeDaPessoa;
    }
    public String getNome()
    {
        return this.nome;
    }
    public void setIdade(int IdadeDaPessoa)
    {
        idade = IdadeDaPessoa;
    }
    public int getIdade()
    {
        return this.idade;
    }

    public void setPai(Pessoa paiDaPessoa)
    {
        pai = paiDaPessoa;
    }
    public Pessoa getPai()
    {
        return pai;
    }
    public void setMae(Pessoa maeDaPessoa)
    {
        mae = maeDaPessoa;
    }
    public Pessoa getMae()
    {
        return mae;
    }
}