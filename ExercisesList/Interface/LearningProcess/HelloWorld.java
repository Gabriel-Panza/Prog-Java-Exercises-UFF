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
        
        JButton button1 = new JButton ("Hello World");
        JButton button2 = new JButton ("Hi World");

        button1.setVerticalTextPosition (AbstractButton.CENTER);
        button1.setHorizontalTextPosition (AbstractButton.LEFT);
        button1.setToolTipText ("Hello World means 'hi to the world'");
        button1.setEnabled (true);

        button2.setVerticalTextPosition (AbstractButton.CENTER);
        button2.setHorizontalTextPosition (AbstractButton.LEFT);
        button2.setToolTipText ("Hello World means 'hi to the world'");
        button2.setEnabled (true);
        
        painel.setLayout(new FlowLayout());
        painel.add(button1);
        painel.add(button2);
        frame.getContentPane().add(painel);

        frame.setVisible(true);    
        
        boolean visivel = button1.isVisible();
        if (visivel)
            System.out.println("Visible Button");
        else
            System.out.println("Invisible Button");
    }
}