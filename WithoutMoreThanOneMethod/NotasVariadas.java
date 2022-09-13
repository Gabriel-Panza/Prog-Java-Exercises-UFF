import java.util.Scanner;

public class NotasVariadas
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        int NUMERO_ALUNOS = teclado.nextInt();
        
        String[] nomes = new String[NUMERO_ALUNOS];
        float[] notas = new float[NUMERO_ALUNOS];
        float media = 0;
        
        for (int i = 0; i < NUMERO_ALUNOS; i++) 
        {
            System.out.print("Informe o nome do aluno "+(i+1)+": ");
            nomes[i] = teclado.nextLine();
        }
        for (int i = 0; i < NUMERO_ALUNOS; i++) 
        {
            System.out.print("Informe a nota de " + nomes[i] + ": ");
            notas[i] = teclado.nextFloat();
            media += notas[i];
        }
        media /= NUMERO_ALUNOS;
        
        for (int i = 0; i < NUMERO_ALUNOS; i++) 
        {
            if (notas[i] > media)
            System.out.println("Parabéns " + nomes[i]);
        }
        teclado.close();
    }
}
