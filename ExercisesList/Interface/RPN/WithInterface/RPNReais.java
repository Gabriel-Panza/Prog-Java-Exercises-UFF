package Interface.RPN.WithInterface;

import java.util.*;

public class RPNReais extends RPN 
{
    public String operate(char operand, String a, String b) 
    {
        Hashtable<Character,Double> opHash = new Hashtable<Character,Double>();
        opHash.put('+', Double.parseDouble(a) + Double.parseDouble(b));
        opHash.put('-', Double.parseDouble(a) - Double.parseDouble(b));
        opHash.put('*', Double.parseDouble(a) * Double.parseDouble(b));
        opHash.put('/', Double.parseDouble(a) / Double.parseDouble(b));

        // returno o resultado de a <operando> b
        return String.valueOf(opHash.get(operand));
    }
}