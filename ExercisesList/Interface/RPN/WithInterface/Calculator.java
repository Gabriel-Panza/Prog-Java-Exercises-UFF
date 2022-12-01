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
        painel.setBackground(Color.GRAY);

        JLabel labelExpression = new JLabel("Expressão = ");
        JTextField expression = new JTextField(50);
        
        JButton botaoCalcula = new JButton ("Calcular");
        
        JLabel labelResposta = new JLabel("Resultado = ");
        JLabel labelResFinal = new JLabel();
        
        JLabel espacosIniciais[] = new JLabel[10];
        for (int i=0; i<10;i++)
        {
            espacosIniciais[i] = new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                ");

        }
        JLabel espacosDeSeparacao[] = new JLabel[3];
        for (int i=0; i<3;i++)
        {
            espacosDeSeparacao[i] = new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                ");
        }
        JLabel labelEspacoFim = new JLabel("                                                                                                 ");

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
        for (int i=0;i<10;i++)
        {
            painel.add(espacosIniciais[i]);
        }
        painel.add(espacosDeSeparacao[0]);
        painel.add(labelExpression);
        painel.add(expression);
        painel.add(espacosDeSeparacao[1]);
        painel.add(botaoCalcula);
        painel.add(espacosDeSeparacao[2]);
        painel.add(labelResposta);
        painel.add(labelResFinal);
        painel.add(labelEspacoFim);
        frame.getContentPane().add(painel);
        frame.setVisible(true);
    }   
}
