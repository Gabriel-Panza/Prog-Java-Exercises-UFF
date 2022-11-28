package Interface.LearningProcess;

import javax.swing.*;
import java.awt.*;

public class HelloWorld
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Hello World");
        frame.setSize(1280,720);

        JPanel painel = new JPanel();
        painel.setBackground(Color.BLACK);
        
        // Container container = frame.getContentPane();
        // container.setLayout(new BorderLayout());;
        
        JButton botao1 = new JButton ("Hello World");
        JButton botao2 = new JButton ("Hi World");

        botao1.setVerticalTextPosition (AbstractButton.CENTER);
        botao1.setHorizontalTextPosition (AbstractButton.LEFT);
        botao1.setToolTipText ("Hello World means 'hi to the world'");
        botao1.setEnabled (true);

        botao2.setVerticalTextPosition (AbstractButton.CENTER);
        botao2.setHorizontalTextPosition (AbstractButton.LEFT);
        botao2.setToolTipText ("Hello World means 'hi to the world'");
        botao2.setEnabled (true);
        
        painel.setLayout(new FlowLayout());
        painel.add(botao1);
        painel.add(botao2);
        frame.getContentPane().add(painel);

        frame.setVisible(true);    
        
        boolean visivel = botao1.isVisible();
        if (visivel)
            System.out.println("Botao Visivel");
        else
            System.out.println("Botao Invisivel");
    }
}