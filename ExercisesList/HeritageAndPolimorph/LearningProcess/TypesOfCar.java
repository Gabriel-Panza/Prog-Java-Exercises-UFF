package HeritageAndPolimorph.LearningProcess;
public class TypesOfCar 
{
    public static void main(String[] args)
    {
        Car ferrari = new Car(10);
        Car bmw = new Car(15);
        ferrari.disaccelerate();
        bmw.accelerate();

        System.out.println(ferrari);
        System.out.println(bmw);

        ferrari = bmw;

        if (ferrari.getVelocity()<bmw.getVelocity())
        {
            System.out.println("Ferrari is slower than bmw");
        }
        else if(ferrari.getVelocity()>bmw.getVelocity())
        {
            System.out.println("Ferrari is faster than bmw");
        }
        else
        {
            System.out.println("Ferrari has the same speed as bmw");
        }
    }        
}
