package OOP.Lista2.Exercise5;

import java.util.Scanner;

public class Exercise5 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe a forma geometrica que deseje calcular a area:");
        System.out.println("(1) - Quadrado\n (2) - Retângulo\n (3) - Triângulo\n (4) - Círculo\n");
        int formaGeometrica = teclado.nextInt();
        double area = calculaArea(formaGeometrica, teclado);
        if (area>=0)
            System.out.println("Area: " + area);
        else
            System.out.println("Figura geometrica invalida");

        teclado.close();
    }

    public static double calculaArea(int formaGeometrica, Scanner teclado)
    {
        int[] x,y;
        FormasGeometricas figura;
        switch (formaGeometrica) {
            case 1:
                x = new int[2];
                y = new int[2];
                System.out.println("Informe duas coordenadas opostas do quadrado:");
                for (int i=0;i<2;i++)
                {
                    System.out.print("x" + i + ": ");
                    x[i] = teclado.nextInt();
                    System.out.print("y" + i + ": ");
                    y[i] = teclado.nextInt();
                }
                figura = new Quadrado(x, y);
                figura.calculaArea();
                break;
            case 2:
                x = new int[2];
                y = new int[2];
                System.out.println("Informe duas coordenadas opostas do retangulo:");
                for (int i=0;i<2;i++)
                {
                    System.out.print("x" + i + ": ");
                    x[i] = teclado.nextInt();
                    System.out.print("y" + i + ": ");
                    y[i] = teclado.nextInt();
                }
                figura = new Retangulo(x, y);
                figura.calculaArea();
                break;
            case 3:
                x = new int[3];
                y = new int[3];
                System.out.println("Informe as coordenadas do triangulo:");
                for (int i=0;i<3;i++)
                {
                    System.out.print("x" + i + ": ");
                    x[i] = teclado.nextInt();
                    System.out.print("y" + i + ": ");
                    y[i] = teclado.nextInt();
                }
                figura = new Triangulo(x, y);
                figura.calculaArea();
                break;
            case 4:
                x = new int[2];
                y = new int[2];
                System.out.println("Informe as coordenadas do centro do circulo e de um ponto qualquer:");
                for (int i=0;i<2;i++)
                {
                    System.out.print("x" + i + ": ");
                    x[i] = teclado.nextInt();
                    System.out.print("y" + i + ": ");
                    y[i] = teclado.nextInt();
                }
                figura = new Circulo(x, y);
                figura.calculaArea();
                break;
            default:
                return -1;
        }
        return figura.getArea();
    }
}
