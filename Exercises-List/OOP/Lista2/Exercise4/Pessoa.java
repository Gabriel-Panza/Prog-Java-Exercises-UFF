public class Pessoa 
{
    private String nome;
    private int idade;
    private String pai;
    private String mae;

    public Pessoa(String nomeDaPessoa, int idadeDaPessoa, String paiDaPessoa, String maeDaPessoa)
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

    public void setPai(String paiDaPessoa)
    {
        pai = paiDaPessoa;
    }
    public String getPai()
    {
        return pai;
    }
    public void setMae(String maeDaPessoa)
    {
        mae = maeDaPessoa;
    }
    public String getMae()
    {
        return mae;
    }
}