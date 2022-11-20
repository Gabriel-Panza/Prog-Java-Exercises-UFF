public class Pessoa 
{
    private String nome;
    private int idade;
    private Pessoa pai;
    private Pessoa mae;

    public Pessoa(String nomeDaPessoa, int idadeDaPessoa)
    {
        nome = nomeDaPessoa;
        idade = idadeDaPessoa;
    }

    public void setNome(String nomeDaPessoa)
    {
        nome = nomeDaPessoa;
    }
    public String getNome()
    {
        return nome;
    }
    
    public void setIdade(int IdadeDaPessoa)
    {
        idade = IdadeDaPessoa;
    }
    public int getIdade()
    {
        return idade;
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