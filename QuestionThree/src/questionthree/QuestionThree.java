package questionthree;

import java.util.Scanner;

public class QuestionThree {

    public static void main(String[] args) {
        Scanner horse = new Scanner(System.in);
        StudFarms h1 = new StudFarms();
        System.out.println("Digite a quantidade de cavalos que foram comprados pelo seu haras:");
        h1.horse = horse.nextInt();
        h1.horseshoe = (h1.horse * 4);
        System.out.println("O numero de ferraduras para os novos cavalos são:\n" + h1.horseshoe);
        
        
        

    }
}
