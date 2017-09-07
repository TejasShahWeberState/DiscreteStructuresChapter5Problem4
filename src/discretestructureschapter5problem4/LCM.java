
package discretestructureschapter5problem4;

/**
 * Author: Tejas Shah Date: 11/10/2015 Due: 11/18/2015 Chapter 1 Computer Projects
 * Given two positive integers, find their least common multiple
 * @author shaht_000
 */
public class LCM 
{
    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) 
     {
         //Set the words you want reversed
        String str = "Discrete Math RULES!!";
        String reverseStr = reverseRecursiveDivide(str);
        System.out.println("Normal String is : " + str
                + " \nReverse String is : " + reverseStr);
    }
    public static String reverseRecursiveDivide(String str) 
    {
        if (str.length() <= 1) 
        {
            return str;
        }
        return reverseRecursiveDivide(str.substring(str.length() / 2, str.length())) + reverseRecursiveDivide(str.substring(0, str.length() / 2));
    }    
}
