package Interface.RPN.WithInterface;

import java.util.*;

public class RPNComplexos extends RPN 
{
    public String operate(char operand, String a, String b) 
    {
        Hashtable<Character,String> opHash = new Hashtable<Character,String>();
        opHash.put('+',"(" + a + "+" + b + ")");
        opHash.put('-',"(" + a + "-" + b + ")");
        opHash.put('*',"(" + a + "*" + b + ")");
        opHash.put('/',"(" + a + "/" + b + ")");

        // returno o resultado de a <operando> b
        return String.valueOf(opHash.get(operand));
    }
}