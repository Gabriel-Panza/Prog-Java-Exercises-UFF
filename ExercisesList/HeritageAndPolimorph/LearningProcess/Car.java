package HeritageAndPolimorph.LearningProcess;

public class Car
{
    private int velocity;
    
    public int getVelocity()
    {
        return this.velocity;
    }

    public void setVelocity(int actualVelocity)
    {
        this.velocity = actualVelocity;
    }

    public void accelerate() 
    {
        velocity++;
    }
    
    public void disaccelerate() 
    {
        velocity--;
    }

    public Car(int starterVelocity) 
    {
        velocity = starterVelocity;
    }
}