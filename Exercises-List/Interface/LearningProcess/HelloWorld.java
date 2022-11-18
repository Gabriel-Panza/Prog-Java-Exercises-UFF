import javax.swing.*;
// import javax.swing.event.*;
// import java.awt.*;
// import java.awt.event.*;

public class HelloWorld
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Hello World");
        frame.setSize(1280,720);
        frame.setVisible(true);    
        
        JPanel painel = new JPanel ();
        painel.setSize(1280,720);
        painel.setVisible(true);
        
        ImageIcon icone = new ImageIcon("images/barra.png");
        JButton botao = new JButton ("Hello World", icone);
        botao.setBounds(frame.getWidth()/2 - 150, frame.getHeight()/2 - 50, 200, 45);
        botao.setVerticalTextPosition (AbstractButton.CENTER);
        botao.setHorizontalTextPosition (AbstractButton.LEFT);
        botao.setToolTipText ("Hello World means 'hi to the world'");
        botao.setEnabled (true);
        
        painel.add(botao);
        frame.getContentPane().add(painel);
        
        boolean visivel = botao.isVisible();
        if (visivel)
            System.out.println("Botao Visivel");
        else
            System.out.println("Botao Invisivel");
    }
}