package HeritageAndPolimorph.Lista2.Exercise2;

public class Agenda extends Ordenador
{
    private Contato[] contatos;
    private int indice;
    private int cont;

    public Agenda(int quantidadeDeContatos)
    {
        contatos = new Contato[quantidadeDeContatos];
        indice = 0;
        cont=0;
    }

    public void SetContato(Contato contato)
    {
        contatos[indice++] = contato;
    }
    public void ResetIndice()
    {
        this.indice=0;
    }
    public void ResetCont()
    {
        this.cont=0;
    }

    public String GetNome()
    {
        return contatos[indice].GetNome();
    }
    public int GetTelefone()
    {
        return contatos[indice++].GetTelefone();
    }

    public Contato[] AddContato(String nome, int telefone, int quantidadeDeContatos)
    {
        Contato novoContato = new Contato(nome, telefone);
        Contato[] contatosAux = new Contato[++quantidadeDeContatos];
        contatosAux = contatos;
        contatosAux[--quantidadeDeContatos] = novoContato;
        return contatosAux;
    }

    public Contato[] RemoveContato(int telefone, int quantidadeDeContatos)
    {
        Contato[] contatosAux = new Contato[--quantidadeDeContatos];
        while (contatos[indice] != null)
        {
            if (contatos[indice++].GetTelefone() != telefone)
            {
                contatosAux[cont++] = contatos[indice];
            }
        }
        return contatosAux;
    }

    public void OrdenaAlfabetico(int quantidadeDeContatos)
    {
        Contato aux = new Contato(null, 0);
        for (int i=0;i<quantidadeDeContatos-1;i++)
        {
            if (CharToInt(contatos[i].GetNome()) > CharToInt(contatos[i+1].GetNome()))
            {
                aux = contatos[i];
                contatos[i] = contatos[i+1];
                contatos[i+1] = aux;
            }
        }
    }

    public int CharToInt(String nome)
    {
        if (nome.charAt(0) == 'a' || nome.charAt(0) == 'A')
            return 1;
        if (nome.charAt(0) == 'b' || nome.charAt(0) == 'B')
            return 2;
        if (nome.charAt(0) == 'c' || nome.charAt(0) == 'C')
            return 3;
        if (nome.charAt(0) == 'd' || nome.charAt(0) == 'D')
            return 4;
        if (nome.charAt(0) == 'e' || nome.charAt(0) == 'E')
            return 5;
        if (nome.charAt(0) == 'f' || nome.charAt(0) == 'F')
            return 6;
        if (nome.charAt(0) == 'g' || nome.charAt(0) == 'G')
            return 7;
        if (nome.charAt(0) == 'h' || nome.charAt(0) == 'H')
            return 8;
        if (nome.charAt(0) == 'i' || nome.charAt(0) == 'I')
            return 9;
        if (nome.charAt(0) == 'j' || nome.charAt(0) == 'J')
            return 10;
        if (nome.charAt(0) == 'k' || nome.charAt(0) == 'K')
            return 11;
        if (nome.charAt(0) == 'l' || nome.charAt(0) == 'L')
            return 12;
        if (nome.charAt(0) == 'm' || nome.charAt(0) == 'M')
            return 13;
        if (nome.charAt(0) == 'n' || nome.charAt(0) == 'N')
            return 14;
        if (nome.charAt(0) == 'o' || nome.charAt(0) == 'O')
            return 15;
        if (nome.charAt(0) == 'p' || nome.charAt(0) == 'P')
            return 16;
        if (nome.charAt(0) == 'q' || nome.charAt(0) == 'Q')
            return 17;
        if (nome.charAt(0) == 'r' || nome.charAt(0) == 'R')
            return 18;
        if (nome.charAt(0) == 's' || nome.charAt(0) == 'S')
            return 19;
        if (nome.charAt(0) == 't' || nome.charAt(0) == 'T')
            return 20;
        if (nome.charAt(0) == 'u' || nome.charAt(0) == 'U')
            return 21;
        if (nome.charAt(0) == 'v' || nome.charAt(0) == 'V')
            return 22;
        if (nome.charAt(0) == 'w' || nome.charAt(0) == 'W')
            return 23;
        if (nome.charAt(0) == 'x' || nome.charAt(0) == 'X')
            return 24;
        if (nome.charAt(0) == 'y' || nome.charAt(0) == 'Y')
            return 25;
        else
            return 26;
    }
}