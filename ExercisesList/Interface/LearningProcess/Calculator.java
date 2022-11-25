package Interface.LearningProcess;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Hello World");
        frame.setSize(1280,720);

        JPanel painel = new JPanel();
        painel.setBackground(Color.RED);

        JLabel labelA = new JLabel("a = ");
        JTextField numA = new JTextField(10);
        JLabel labelB = new JLabel("b = ");
        JTextField numB = new JTextField(10);
        JButton botaoSoma = new JButton ("somar");
        
        JLabel labelSoma = new JLabel("a+b = ");
        JLabel labelResultado = new JLabel();
        
        
        class Click implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                int resultado = Integer.parseInt(numA.getText()) + Integer.parseInt(numB.getText());
                labelResultado.setText(Integer.toString(resultado));
            }
        }
        botaoSoma.addActionListener(new Click());
        
        painel.setLayout(new FlowLayout());
        painel.add(labelA);
        painel.add(numA);
        painel.add(labelB);
        painel.add(numB);
        painel.add(botaoSoma);
        painel.add(labelSoma);
        painel.add(labelResultado);
        frame.getContentPane().add(painel);
        frame.setVisible(true);
        
    }   
}
