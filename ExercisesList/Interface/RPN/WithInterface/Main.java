package Interface.RPN.WithInterface;

public class Main extends Interface
{
    public static void main(String[] args) 
    {
        // Roda a minha calculadora
        Interface calc = new Interface();

        // Mostra o nome da classe e em que pasta ela está
        String nome = calc.getClass().getName();
        System.out.println(nome);
    }
}
