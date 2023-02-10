import java.util.Random;

public class Diceroller {

    Random random;

    int number;
    
    Diceroller(){
        random = new Random();
        number = 0;
        roll();
    }

    void roll(){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}
