import java.util.Scanner;

public class Lista1 
{
    /* Questão 1 */
    public static void EquacaoSegundoGrau() 
    {
        Scanner teclado = new Scanner(System.in);
        int a,b,c;
        double delta=0, raiz1=0, raiz2=0;
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        
        delta = Math.pow(b,2) - 4*a*c;
        if (delta>0)
        {
            raiz1 = (-b + Math.pow(delta,1/2))/2*a;
            raiz2 = (-b - Math.pow(delta,1/2))/2*a;
            System.out.println("As raizes da equacao sao: " + raiz1 + " " + raiz2);
        }
        if (delta==0)
        {
            raiz1 = (-b + Math.pow(delta,1/2))/2*a;
            System.out.println("A raiz da equacao eh: " + raiz1);
        }
        if (delta<0)
            System.out.println("A equacao nao tem raiz!");
        teclado.close();   
    }

    /* Questão 2 */
    public static void DistanciaTresDimensoes() 
    {
        Scanner teclado = new Scanner(System.in);
        double x1,x2,y1,y2,z1,z2,distancia;
        System.out.println("Entre com as coordenadas x, y, z dos pontos nesta ordem:");
        x1 = teclado.nextFloat();
        y1 = teclado.nextFloat();
        z1 = teclado.nextFloat();
        x2 = teclado.nextFloat();
        y2 = teclado.nextFloat();
        z2 = teclado.nextFloat();

        distancia = Math.pow(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) + Math.pow(z2-z1, 2f), 1f/2);
        System.out.println("A distância é: " + distancia);
        teclado.close();
    }

    /* Questão 3 */
    /* Ache o erro do por que este programa sempre printa 1 */
    public static void DistanciaDuasDimensoes() 
    {
        Scanner teclado = new Scanner(System.in);
        double x1, y1, x2, y2, distancia;
        System.out.println("Entre com as coordenadas x e y dos pontos nesta ordem:");
        x1 = teclado.nextFloat();
        y1 = teclado.nextFloat();
        x2 = teclado.nextFloat();
        y2 = teclado.nextFloat();
        
        distancia = Math.pow(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2), 1/2); // Uma divisão de inteiros sempre dará um inteiro, 
                                                                                // logo 1/2 = 0, pois 0 eh a parte inteira de 0.5,
                                                                               // e, portanto, qualquer numero elevado a 0 é igual a 1
        System.out.println("A distância é: " + distancia);
        teclado.close();
    }

    /* Questão 4 */
    public static void Desconto() 
    {
        Scanner teclado = new Scanner(System.in);
        int qntd = teclado.nextInt();
        double precoFinal;

        System.out.println("\nTodos os produtos da loja custam 1 dolar, mas dependendo de quantos voce comprar, tem desconto");
        System.out.println("\nInforme o nome do produto que quieres comprar: " + teclado.nextLine());
        System.out.println("\nInforme a quantidade deste produto que quieres comprar: " + qntd);
        if (qntd<11)
            precoFinal = 1 * 1.0f;
        else if (qntd>=11 && qntd<21)
            precoFinal = 1 * 0.9f;
        else if (qntd>=21 && qntd<51)
            precoFinal = 1 * 0.8f;
        else
            precoFinal = 1 * 0.75f;
        System.out.println("O Valor a ser pago eh: " + precoFinal*qntd);

        teclado.close();
    }

    /* Questão 5 */
    public static void TabelaMultiplica()
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Entenda como a multiplicacao funciona: ");
        for(int i = 0;i<10;i++)
        {
            System.out.println("A multiplicacao de " + 1 + " por " + i + " = " + 1*i);
        }

        System.out.println("Agora tente voce mesmo. Informe dois numeros para serem multiplicados: ");
        int n = teclado.nextInt(), m = teclado.nextInt();
        System.out.println("A multiplicacao de " + n + " por " + m + " = " + n*m);

        teclado.close();
    }

    /* Questão 6 */
    public static void TamanhoDoNumero()
    {
        Scanner teclado = new Scanner(System.in);
        do
        {
            String numero;
            System.out.println("Informe o numero que deseja analisar: (caso deseje parar, dê enter sem digitar nada)");
            numero = teclado.nextLine();
            if (numero.length()<1)
                break;

            System.out.println("O numero " + numero + " tem " + numero.length() + " digitos");
        }while(true);

        teclado.close();
    }

    /* Questão 7 */
    /* Ache o erro em uma das duas implementações e corria-o */
    public static void Repeticao() 
    {
        Scanner teclado = new Scanner(System.in);

        // Programa A
        int codigoA;
        System.out.println("Informe o código: ");
        codigoA = teclado.nextInt();
        while (codigoA != -1) 
        {
            System.out.println("Código: " + codigoA);
            System.out.println("Informe o código: ");
            codigoA = teclado.nextInt();
        }
        
        // Programa B
        int codigoB;
        do 
        {
            System.out.print("Informe o código: ");
            codigoB = teclado.nextInt();
            System.out.println("Código: " + codigoB); // O codigo vai printar o -1 antes de parar. 
                                                     // Para consertar, acrescente um "if,break" antes do print com condiçao de parada no -1
        } while (codigoB != -1);

        teclado.close();
    }

    /* Questão 8 */
    public static void Fibonacci() 
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite quantos numeros da sequencia de Fibonacci, desejas ver: ");
        int qntd = teclado.nextInt(), t1=1, t2=1, f=t1+t2;
        if (qntd == 1)
            System.out.print(t1);
        else if (qntd == 2)
            System.out.print(t1 + ", " + t2);
        else
        {
            System.out.print(t1 + ", " + t2 + ", ");
            for(int i=0;i<qntd-2;i++)
            {
                t1=f;
                f = t2+f;
                t2=t1;
                System.out.print(f + ", ");
            }
        }
        teclado.close();
    }

    /* Questão 9 */
    /* Determine o que esta sendo printado */
    public static void Loop() {
        for (int i = 2; i <= 8; i = i + 2) 
        {
            for (int j = i; j <= 4; j++) 
            {
                for (int k = 1; k <= j; k = k + i) 
                {
                    System.out.println(i + ", " + j + ", " + k);
        
                }
        
            }
        }
    }

    /* Codigo main no qual chamo as funções */
    public static void main(String[] args)
    {
        Loop();
    }

}
