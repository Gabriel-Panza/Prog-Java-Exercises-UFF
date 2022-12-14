package HeritageAndPolimorph.Lista2.Exercise5;

public class Circulo extends FormasGeometricas
{
    private int[] x;
    private int[] y;
    private double area;

    public  Circulo(int[] pontoX, int[] pontoY)
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
        double pi = 3.14;
        this.area = pi * Math.pow((Math.pow((x[1] - x[0]),2) + Math.pow((y[1] - y[0]),2)), 1/2f);
    }
    public double getArea()
    {
        return area;
    }    
}
