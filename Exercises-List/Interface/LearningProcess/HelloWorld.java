import javax.swing.*;
//import javax.swing.event.*;

public class HelloWorld
{
    public static void main(String[] args) 
    {
        JFrame frame;
        frame = new JFrame("Hello World");
        frame.setSize(1280,720);
        frame.setVisible(true);    
        
        JPanel painel;
        painel = new JPanel ();
        frame.getContentPane().add (painel);
        painel.setVisible(true);

        ImageIcon icone = new ImageIcon("images/barra.jpg");
        JButton botao = new JButton ("Hello World", icone);
        botao.setVerticalTextPosition (AbstractButton.CENTER);
        botao.setHorizontalTextPosition (AbstractButton.LEFT);
        botao.setToolTipText ("Hello World means 'hi to the world'");
        botao.setEnabled (true);
        boolean visivel = botao.isVisible();
        if (visivel)
            System.out.println("Botao Visivel");
        else
            System.out.println("Botao Invisivel");
    }
}