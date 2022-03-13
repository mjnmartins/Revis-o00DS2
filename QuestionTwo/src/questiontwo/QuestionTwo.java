
package questiontwo;

import java.util.Scanner;

/**
 * Uma imobiliária vende apenas terrenos retangulares. 
 * Faça um programa em java para ler as dimensões de um terreno e depois exibir a área do terreno. 
 * (lado x altura)

 */
/**
 *
 * @author Murilo Martins
 */
public class QuestionTwo {

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Ground g1 = new Ground();
        System.out.println("Digite o comprimento do terreno:");
        g1.setLength(keyboard.nextFloat());
        System.out.println("Digite a altura do terreno:");
        g1.setHeight(keyboard.nextFloat());
        g1.setResult(g1.getLength() * g1.getHeight());
        System.out.println("A area do terreno é: " + g1.getResult());
        
        
    }
    
}
