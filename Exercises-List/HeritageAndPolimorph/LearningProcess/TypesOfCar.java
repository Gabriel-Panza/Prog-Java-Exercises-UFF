package HeritageAndPolimorph.LearningProcess;
public class TypesOfCar 
{
    public static void main(String[] args)
    {
        Carro fusca = new Carro(10);
        Carro bmw = new Carro(15);
        fusca.freia();
        bmw.acelera();

        // Ao printar o objeto, printa-se o endereço da Classe
        System.out.println(fusca);
        System.out.println(bmw);

        // Igualamos o endereço do fusca ao do bmw, sobrescrevendo seus atributos
        fusca = bmw;

        if (fusca.getVelocidade()<bmw.getVelocidade())
        {
            System.out.println("O fusca eh mais lento que uma bmw");
        }
        else if(fusca.getVelocidade()>bmw.getVelocidade())
        {
            System.out.println("O fusca eh mais rapido que uma bmw");
        }
        else
        {
            System.out.println("O fusca tem a mesma velocidade que uma bmw");
        }
    }        
}
