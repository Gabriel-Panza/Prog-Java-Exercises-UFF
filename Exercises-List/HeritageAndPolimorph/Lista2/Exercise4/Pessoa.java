public class Pessoa 
{
    private String nome;
    private int idade;
    private Pessoa pai;
    private Pessoa mae;

    public Pessoa(String nomeDaPessoa, int idadeDaPessoa, String paiDaPessoa, String maeDaPessoa)
    {
        nome = nomeDaPessoa;
        idade = idadeDaPessoa;
        pai.nome = paiDaPessoa;
        mae.nome = maeDaPessoa;
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

    public void setPai(String paiDaPessoa)
    {
        pai.nome = paiDaPessoa;
    }
    public String getPai()
    {
        return pai.nome;
    }
    public void setMae(String maeDaPessoa)
    {
        mae.nome = maeDaPessoa;
    }
    public String getMae()
    {
        return mae.nome;
    }
}