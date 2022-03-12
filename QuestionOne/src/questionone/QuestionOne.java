
package questionone;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Construa uma classe que solicite uma frase escrita pelo usuário. 
 * Peça ao usuário para escolher uma palavra da frase escrita e substituí-la por outra palavra.
 * (Utilize o método replace()).
 */
/**
 *
 * @author Murilo Martins
 */
public class QuestionOne {

    
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);  
       ExchangeWords ew = new ExchangeWords();
       System.out.println("Digete uma frase:");
       ew.setPhrase(keyboard.nextLine());
       // System.out.println(ew.getPhrase());
        
        
       
        
                

    }
    
}
