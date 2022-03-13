
package questionone;

import java.util.Scanner;

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
       System.out.println("Digite uma frase:");
       ew.setPhrase(keyboard.nextLine());
       System.out.println("A fraseque você digitou foi :\n" + ew.getPhrase());
       System.out.println("Digite a palavra que quer trocar, e logo apos digite a nova palavra");
       ew.phrase = ew.phrase.replace(keyboard.nextLine(),keyboard.nextLine());
       System.out.println(ew.phrase);
       
         
        
       
        
                

    }
    
}
