class Carro
{
    protected int velocidade;
    
    public void acelera() 
    {
        velocidade++;
    }
    
    public void freia() 
    {
        velocidade--;
    }

    public Carro(int velocidadeInicial) 
    {
        velocidade = velocidadeInicial;
    }
}