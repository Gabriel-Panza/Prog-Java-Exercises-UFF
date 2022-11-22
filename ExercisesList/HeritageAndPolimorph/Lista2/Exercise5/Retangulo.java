package HeritageAndPolimorph.Lista2.Exercise5;

public class Retangulo extends FormasGeometricas
{
    private int[] x;
    private int[] y;
    private double area;

    public Retangulo(int[] pontoX, int[] pontoY)
    {
        super(pontoX, pontoY);
    }

    public void setX(int[] x) {
        this.x = x;
    }
    public int[] getX() {
        return x;
    }
    public void setY(int[] y) {
        this.y = y;
    }
    public int[] getY() {
        return y;
    }
    
    public void calculaArea()
    {
        double a = (x[1] - x[0]) * (y[1] - y[0]);
        if(a<0)
            a*=-1;
        this.area = a;
    }
    public double getArea() 
    {
        return area;
    }    
}
