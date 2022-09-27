package ClassTraining;

public class Carro
{
    public int velocidade;
    
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