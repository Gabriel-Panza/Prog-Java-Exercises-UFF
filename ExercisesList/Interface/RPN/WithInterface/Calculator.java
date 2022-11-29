package Interface.RPN.WithInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Calculadora RPN");
        frame.setSize(1280,720);

        JPanel painel = new JPanel();
        painel.setBackground(Color.BLACK);

        JLabel labelExpression = new JLabel("Expressão = ");
        JTextField expression = new JTextField(50);
        JButton botaoCalcula = new JButton ("Calcular");
        
        JLabel labelSoma = new JLabel("Resultado = ");
        JLabel labelResultado = new JLabel();
        
        
        class Click implements ActionListener
        {
            public void actionPerformed(ActionEvent actionEvent)
            {
                System.out.println(RPN.evaluate(expression.toString()));
                try{
                    labelResultado.setText(Double.toString(RPN.evaluate(expression.toString())));
                } catch(Exception exception){
                    System.out.println("Invalid Expression, Try again or type '.exit' to quit");
                }
            }
        }
        botaoCalcula.addActionListener(new Click());
        
        painel.setLayout(new FlowLayout());
        painel.add(labelExpression);
        painel.add(expression);
        painel.add(botaoCalcula);
        painel.add(labelSoma);
        painel.add(labelResultado);
        frame.getContentPane().add(painel);
        frame.setVisible(true);
    }   
}
