class Carro
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

class TypesOfCar 
{
    public static void main(String[] args)
    {
        Carro fusca = new Carro(10);
        Carro bmw = new Carro(15);
        fusca.freia();
        bmw.acelera();
        
        if (fusca.velocidade<bmw.velocidade)
        {
            System.out.println("O fusca eh mais lento que uma bmw");
        }
        else if(fusca.velocidade>bmw.velocidade)
        {
            System.out.println("O fusca eh mais rapido que uma bmw");
        }
        else
        {
            System.out.println("O fusca tem a mesma velocidade que uma bmw");
        }
    }    
}
