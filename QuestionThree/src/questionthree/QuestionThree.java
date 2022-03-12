package questionthree;

import java.util.Scanner;

public class QuestionThree {

    public static void main(String[] args) {
        Scanner horse = new Scanner(System.in);
        StudFarms h1 = new StudFarms();
        System.out.println("Digite a quantidade de cavalo que tem no seu haras:");
        h1.horse = horse.nextInt();
        h1.horseshoe = (h1.horse * 4);
        System.out.println("O numero de ferraduras para seu haras é:\n" + h1.horseshoe);
        
        
        

    }
}
