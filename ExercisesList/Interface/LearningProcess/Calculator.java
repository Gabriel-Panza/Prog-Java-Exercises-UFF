import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Calculadora");
        frame.setSize(1280,720);

        JPanel painel = new JPanel();
        painel.setBackground(Color.BLACK);

        JLabel labelA = new JLabel("a = ");
        JTextField numA = new JTextField(10);
        JLabel labelB = new JLabel("b = ");
        JTextField numB = new JTextField(10);
        JButton addButton = new JButton ("add");
        
        JLabel labelAdd = new JLabel("a+b = ");
        JLabel labelResult = new JLabel();
        
        
        class Click implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                int result = Integer.parseInt(numA.getText()) + Integer.parseInt(numB.getText());
                labelResult.setText(Integer.toString(result));
            }
        }
        addButton.addActionListener(new Click());
        
        painel.setLayout(new FlowLayout());
        painel.add(labelA);
        painel.add(numA);
        painel.add(labelB);
        painel.add(numB);
        painel.add(addButton);
        painel.add(labelAdd);
        painel.add(labelResult);
        frame.getContentPane().add(painel);
        frame.setVisible(true);
        
    }   
}
