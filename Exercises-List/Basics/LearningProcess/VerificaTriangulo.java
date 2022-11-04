package Basics.LearningProcess;
import java.util.Scanner;

class VerificaTriangulo 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        int x1, y1, x2, y2, x3, y3, det; 
        int L1, L2, L3, L4, L5, L6;

        System.out.println("Digite suas 3 coordenadas par ordenadas: ");
        x1 = teclado.nextInt();
        y1 = teclado.nextInt();
        x2 = teclado.nextInt();
        y2 = teclado.nextInt();
        x3 = teclado.nextInt();
        y3 = teclado.nextInt();

        L1 = x1*y2;
        L2 = x2*y3;
        L3 = x3*y1;
        L4 = y1*x2;
        L5 = y2*x3;
        L6 = y3*x1;

        det = (L1 + L2 + L3) - (L4 + L5 + L6);
        if (det==0)
        {
            System.out.println("Essas coordenadas não formam um triangulo");
        }
        else
        {
            if ((L1 == L2 && L2 == L3) || (L4 == L5 && L5 == L6))
                System.out.println("Essas coordenadas formam um triangulo equilatero");
            else if ((L1 == L2 && L2 == L3) || (L4 != L5 && L5 != L6))
                System.out.println("Essas coordenadas formam um triangulo isosceles");
            else
                System.out.println("Essas coordenadas formam um triangulo escaleno");
        }
        teclado.close();
    }    
}
