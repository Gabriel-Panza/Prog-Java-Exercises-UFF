import java.util.Random;
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
    public static void Loop() 
    {
        for (int i = 2; i <= 8; i = i + 2) 
        {
            for (int j = i; j <= 4; j++) 
            {
                for (int k = 1; k <= j; k = k + i) 
                {
                    System.out.println(i + ", " + j + ", " + k); // (2 2 1), (2 3 1), (2 3 3), (2 4 1), (2 4 3), (4 4 1)
        
                }
        
            }
        }
    }

    /* Questão 10 */
    public static void Investimento()
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("\nInforme o valor a ser investido todo mes e quais os juros mensais que o seu investimento ira ter (separado por espaço)");
        double valorInvestido = teclado.nextDouble(), juros = teclado.nextDouble(), valorFinal=valorInvestido;
        char continua;

        do
        {
            for (int i=0;i<12;i++)
            {
                valorFinal *= (1+(juros/100));
                if (i<11)
                    valorFinal += valorInvestido;
            }
            System.out.println("Saldo do investimento após 1 ano: " + valorFinal);
            System.out.println("Deseja processar mais um ano? (S/N): ");
            continua = teclado.next().charAt(0);
            if (continua=='S')
                continue;
            else if (continua=='N')
                break;
            else
            {
                System.out.println("Comando Inválido! Encerrando o programa...");
                break;
            }
            
        }while(true);

        teclado.close();
    }

    /* Questão 11 */
    public static void RaizQuadrada()
    {
        Scanner teclado = new Scanner(System.in);
        
        do
        {
            System.out.println("Informe o numero inteiro a ser realizado a raiz quadrada e o limite de casas decimais (separados por espaco)");
            int numero = teclado.nextInt(), casasDecimais = teclado.nextInt();
            if (numero<0)
                break;
            double numeroPosRaiz = Math.pow(numero,1f/2) * Math.pow(10,casasDecimais);
            double numeroPosConversaoCasas = (int)numeroPosRaiz / Math.pow(10,casasDecimais);
            
            System.out.println("O resultado da operacao eh: " + numeroPosConversaoCasas);
        } while(true);

        teclado.close();
    }

    /* Questao 12 */
    public static char[][] criaJogoDaVelha(char v[][]) 
    {
        Random chance = new Random();
        int rand, contBolas=0, contX=0;
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                rand = chance.nextInt(100);
                if (i!=j)   
                { 
                    if (contBolas<3 && contX<3)
                    {
                        if (rand > 50)
                        {
                            v[i][j] = 'O';
                            contBolas+= 1;
                        }
                        else
                        {
                            v[i][j] = 'X';
                            contX += 1;
                        }
                    }
                    else
                    {
                        if (contX==3)
                            v[i][j] = 'O';
                        if (contBolas==3)
                            v[i][j] = 'X';
                    }
                }
                else
                    v[i][j] = ' ';
            }
        }
        return v; 
    }
    public static int checaBola(char v[][])
    {
        if ((v[1][0] == 'O' && v[2][0] == 'O') || (v[0][1] == 'O' && v[0][2] == 'O'))
            return 0;
        if ((v[0][2] == 'O' && v[1][2] == 'O') || (v[2][0] == 'O' && v[2][1] == 'O'))
            return 2;
        return 1;
    }
    public static int checaJogo(char v[][])
    {
        if ((v[0][0] == 'X' && v[1][0] == 'X' && v[2][0] == 'X') || (v[0][1] == 'X' && v[1][1] == 'X' && v[2][1] == 'X') || (v[0][2] == 'X' && v[1][2] == 'X' && v[2][2] == 'X'))
            return 0;
        if ((v[0][0] == 'X' && v[0][1] == 'X' && v[0][2] == 'X') || (v[1][0] == 'X' && v[1][1] == 'X' && v[1][2] == 'X') || (v[2][0] == 'X' && v[2][1] == 'X' && v[2][2] == 'X'))
            return 0;
        if ((v[0][0] == 'X' && v[1][1] == 'X' && v[2][2] == 'X') || (v[0][2] == 'X' && v[1][1] == 'X' && v[2][0] == 'X'))
            return 0;
        if ((v[0][0] == 'O' && v[1][0] == 'O' && v[2][0] == 'O') || (v[0][1] == 'O' && v[1][1] == 'O' && v[2][1] == 'O') || (v[0][2] == 'O' && v[1][2] == 'O' && v[2][2] == 'O'))
            return 2;
        if ((v[0][0] == 'O' && v[0][1] == 'O' && v[0][2] == 'O') || (v[1][0] == 'O' && v[1][1] == 'O' && v[1][2] == 'O') || (v[2][0] == 'O' && v[2][1] == 'O' && v[2][2] == 'O'))
            return 2;
        if ((v[0][0] == 'O' && v[1][1] == 'O' && v[2][2] == 'O') || (v[0][2] == 'O' && v[1][1] == 'O' && v[2][0] == 'O'))
            return 2;
        return 1;
    }
    public static void JogoDaVelha()
    {
        Scanner teclado = new Scanner(System.in);

        int verifica;
        char v[][] = new char[3][3];
        v = criaJogoDaVelha(v);

        // Jogo da velha antes da decisao
        for (int i=0;i<3;i++)
        {
            System.out.print("\n");
            for (int j=0;j<3;j++)
            {
                System.out.print(v[i][j] + " ");
            }
        }

        System.out.println("\nDiga onde o X deve ser jogado para que o jogador 1 ganhe ou empata: \n0 -> esquerda, \n1 -> meio, \n2-> direita");
        int x = teclado.nextInt();
        if (x==0 || x==1 || x==2)
        {
            v[x][x] = 'X';
            if (x==0)
            {
                v[x+2][x+2] = 'O';
            }
            else if (x==1)
            {
                verifica = checaBola(v);
                if (verifica==0)
                    v[x-1][x-1] = 'O';
                if (verifica==2)
                    v[x+1][x+1] = 'O';
            }
            else if (x==2)
            {
                v[x-2][x-2] = 'O';
            }

            // Verifica se ganhou ou se foi empate
            verifica = checaJogo(v);

            // Resultado Vitoria
            if (verifica==0)
            {
                if (x==0)
                {
                    v[x+2][x+2]= ' ';
                }
                if (x==1)
                {
                    v[x-1][x-1]= ' ';
                    v[x+1][x+1]= ' ';
                }
                if (x==2)
                {
                    v[x-2][x-2]= ' ';
                }
                System.out.println("\nParabens, Jogador! Voce venceu!");
            }
                // Resultado Empate
            if (verifica==1)
                System.out.println("\nVish, Jogador! Deu empate!");
            // Resultado Derrota
            if (verifica==2)
                System.out.println("\nVish, Jogador! Voce perdeu!");
            
            // Jogo da velha depois da decisao
            for (int i=0;i<3;i++)
            {
                System.out.print("\n");
                for (int j=0;j<3;j++)
                {
                    System.out.print(v[i][j] + " ");
                }
            }
        }
        else
            // Error
            System.out.println("Error! Comando Invalido! Encerrando simulacao...");

        teclado.close();
    }

    /* Questao 13 */
    public static void OrdenaVetor()
    {        
        Random number = new Random();
        int v[] = new int[100];
        for (int i =0;i<100;i++)
        {
            v[i] = number.nextInt(1000);
        }
        for (int i=0;i<50;i++)
        {
            for (int j=i;j<50;j++)
            {
                if (v[i]>v[j])  
                {  
                    int temp= v[i];
                    v[i] = v[j];
                    v[j] = temp; 
                }
            }
        }        
        for (int i =0;i<100;i++)
        {
            System.out.print(v[i] + ", ");;
        }
    }

    /* Questao 14 */
    public static void CombinaVetor()
    {
        Random number = new Random();
        int v1[] = new int[50];
        int v2[] = new int[50];
        int vf[] = new int[100];
        
        for (int i =0;i<50;i++)
        {
            v1[i] = number.nextInt(100);
            v2[i] = number.nextInt(100);
        }
        for (int i=0;i<50;i++)
        {
            for (int j=i;j<50;j++)
            {
                if (v1[i]>v1[j])  
                {  
                    int temp= v1[i];
                    v1[i] = v1[j];
                    v1[j] = temp; 
                }
            }
        }
        for (int i=0;i<50;i++)
        {
            for (int j=i;j<50;j++)
            {
                if (v1[i]<v2[j])  
                {  
                    int temp= v1[i];
                    v1[i] = v2[j];
                    v2[j] = temp; 
                }
            }
            for (int j=i;j<50;j++)
            {
                if (v1[i]>v2[j])  
                {  
                    int temp = v1[i];
                    v1[i] = v2[j];
                    v2[j] = temp; 
                }
            }
        }

        // A partir daqui v1 tem os 50 primeiros termos e v2 tem os ultimos 50 termos. So falta organizar o v2.
        for (int i=0;i<50;i++)
        {
            for (int j=i;j<50;j++)
            {
                if (v2[i]>v2[j])  
                {  
                    int temp= v2[i];
                    v2[i] = v2[j];
                    v2[j] = temp; 
                }
            }
        }

        // Preencho o vf com tudo organizado
        for (int k=0;k<50;k++)
        {
            vf[k]=v1[k];
            vf[50+k]=v2[k];
        }
        for (int i =0;i<100;i++)
        {
            System.out.print(vf[i] + ", ");
        }
    }

    /* Questao 15 */
    public static String CalculaStatus(double nota, String condicao)
    {
        if (nota>=6)
            condicao = "Aprovado";
        if (4<=nota && nota<6)
            condicao = "Verificacao Suplementar";
        if (nota<4)
            condicao = "Reprovado";
        return condicao;
    }
    public static double CalculaMedia(int p1, int p2, int p3)
    {
        return (float)(p1*2 + p2*3 + p3*5)/10;
    }
    public static void Situacao()
    {
        Scanner teclado = new Scanner(System.in);

        int nota1,nota2,nota3;
        double media;
        String condicao;

        System.out.println("\nDigite as notas das 3 provas realizadas neste periodo:");
        System.out.print("Nota 1: ");
        nota1 = teclado.nextInt();
        System.out.print("Nota 2: ");
        nota2 = teclado.nextInt();
        System.out.print("Nota 3: ");
        nota3 = teclado.nextInt();

        media = CalculaMedia(nota1,nota2,nota3);
        condicao = CalculaStatus(media, "");
        System.out.println("\nMedia final: " + media);
        System.out.println("Condicao: " + condicao);

        teclado.close();
    }

    /* Questao 16 */
    public static int horas(int tempo)
    {
        return tempo/3600;
    }
    public static int minutos(int tempo)
    {
        return tempo/60 - (horas(tempo)*60);
    }
    public static int segundos(int tempo)
    {
        return tempo - (horas(tempo)*3600 + minutos(tempo)*60);
    }
    public static void EscritaDoTempo(int horas, int minutos, int segundos)
    {
        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
    public static void LeituraDoTempo()
    {
        Scanner teclado = new Scanner(System.in);
    
        System.out.print("Digite um numero de segundos para ser convertido em horas e minutos: ");
        int tempoSegundos = teclado.nextInt();
        int horas = horas(tempoSegundos);
        int minutos = minutos(tempoSegundos);
        int segundos = segundos(tempoSegundos);
        EscritaDoTempo(horas, minutos, segundos);

        teclado.close();
    }

    /* Questao 17 */
    public static void ConverteCentenas(char x)
    {
        switch(x)
        {
            case '1':
            {
                System.out.print("C");
                break;
            }
            case '2':
            {
                System.out.print("CC");
                break;
            }
            case '3':
            {
                System.out.print("CCC");
                break;
            }
            case '4':
            {
                System.out.print("CD");
                break;
            }
            case '5':
            {
                System.out.print("D");
                break;
            }
            case '6':
            {
                System.out.print("DC");
                break;
            }
            case '7':
            {
                System.out.print("DCC");
                break;
            }
            case '8':
            {
                System.out.print("DCCC");
                break;
            }
            case '9':
            {
                System.out.print("CM");
                break;
            }
            default:
                System.out.print("");
        }
    }
    public static void ConverteDezenas(char x)
    {
        switch(x)
        {
            case '1':
            {
                System.out.print("X");
                break;
            }
            case '2':
            {
                System.out.print("XX");
                break;
            }
            case '3':
            {
                System.out.print("XXX");
                break;
            }
            case '4':
            {
                System.out.print("XL");
                break;
            }
            case '5':
            {
                System.out.print("L");
                break;
            }
            case '6':
            {
                System.out.print("LX");
                break;
            }
            case '7':
            {
                System.out.print("LXX");
                break;
            }
            case '8':
            {
                System.out.print("LXXX");
                break;
            }
            case '9':
            {
                System.out.print("XC");
                break;
            }
            default:
                System.out.print("");
        }
    }

    public static void ConverteUnidades(char x)
    {
        switch(x)
        {
            case '1':
            {
                System.out.print("I\n");
                break;
            }
            case '2':
            {
                System.out.print("II\n");
                break;
            }
            case '3':
            {
                System.out.print("III\n");
                break;
            }
            case '4':
            {
                System.out.print("IV\n");
                break;
            }
            case '5':
            {
                System.out.print("V\n");
                break;
            }
            case '6':
            {
                System.out.print("VI\n");
                break;
            }
            case '7':
            {
                System.out.print("VII\n");
                break;
            }
            case '8':
            {
                System.out.print("VIII\n");
                break;
            }
            case '9':
            {
                System.out.print("IX\n");
                break;
            }
            default:
                System.out.print("\n");
        }        
    }
    public static void LeituraDoNumeroRomano()
    {
        Scanner teclado = new Scanner(System.in);

        do
        {   
            System.out.print("Informe um numero decimal de até 3 digitos (0 -> 999): ");
            String numero = teclado.nextLine();
            if (numero.length()<=0 || numero.length()>=4)
            {
                System.out.println("Error! Numero Invalido! Encerrando simulacao...");
                break;
            }

            System.out.print("O numero informado em romano eh: ");
            if (numero.length()==3)
            {
                ConverteCentenas(numero.charAt(0));
                ConverteDezenas(numero.charAt(1));
                ConverteUnidades(numero.charAt(2));
            }
            else if (numero.length()==2)
            {
                ConverteDezenas(numero.charAt(0));
                ConverteUnidades(numero.charAt(1));
            }
            else
            {
                ConverteUnidades(numero.charAt(0));
            }
        } while(true);

        teclado.close();
    }

    /* Questão 18 */
    public static void LeituraDoNumeroPorExtenso()
    {
        Scanner teclado = new Scanner(System.in);

        do
        {   
            System.out.print("Informe um numero inteiro de até 9 digitos (0 -> 999999999): ");
            String numero = teclado.nextLine();
            if (numero.length()<=0 || numero.length()>=10)
            {
                System.out.println("Error! Numero Invalido! Encerrando simulacao...");
                break;
            }

            System.out.print("O numero informado por extenso eh: ");
            /*                                                                                     
            Chamada das funçoes que printarão o número usando a mesma logica da questao anterior 
                                                                                                */
        } while(true);

        teclado.close();
    }

    /* Codigo main no qual chamo as funções */
    public static void main(String[] args)
    {
        CombinaVetor();
    }
}