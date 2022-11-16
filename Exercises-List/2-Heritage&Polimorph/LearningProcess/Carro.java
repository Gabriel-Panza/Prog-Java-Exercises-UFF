package OOP.LearningProcess;
public class Carro
{
    private int velocidade;
    
    public int getVelocidade()
    {
        return this.velocidade;
    }

    public void setVelocidade(int velocidadeAtual)
    {
        this.velocidade = velocidadeAtual;
    }

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