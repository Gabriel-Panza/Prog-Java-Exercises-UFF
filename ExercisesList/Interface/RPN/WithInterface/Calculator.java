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
        
        JLabel labelResposta = new JLabel("Resultado = ");
        JLabel labelResFinal = new JLabel();
        
        class Click implements ActionListener
        {
            public void actionPerformed(ActionEvent actionEvent)
            {
                try{
                    labelResFinal.setText(Double.toString(RPN.evaluate(expression.getText())));
                } catch(Exception e){
                    System.out.println("Invalid Expression, Try again.");
                }
            }
        }
        botaoCalcula.addActionListener(new Click());
        
        painel.setLayout(new FlowLayout());
        painel.add(labelExpression);
        painel.add(expression);
        painel.add(botaoCalcula);
        painel.add(labelResposta);
        painel.add(labelResFinal);
        frame.getContentPane().add(painel);
        frame.setVisible(true);
    }   
}
