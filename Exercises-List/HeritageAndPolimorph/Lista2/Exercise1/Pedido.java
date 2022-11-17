package HeritageAndPolimorph.Lista2.Exercise1;

import java.text.DecimalFormat;

public class Pedido 
{
    private Produto[] itens;
    private int indice, cont;
    private double total;

    public Pedido(int quantidadeDeItens)
    {
        itens = new Produto[quantidadeDeItens];
        indice = 0;
        cont = 0;
        total = 0;
    }

    public void SetItens(Produto prod)
    {
        itens[indice++] = prod;
    }
    public void ResetIndice()
    {
        this.indice=0;
    }
    
    public String GetTotal()
    {
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        return numberFormat.format(total);
    }

    public void CalculaTotal(int quantidadeDeItens)
    {
        total += itens[cont++].calculaSubTotal();
    }
}
