package Day_4;
import java.util.Random;
public class Snake_and_Ladder {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Program");
        int playerPosition = 0; // UC1 - initial position
        System.out.println("Starting Position is " + playerPosition );
        Random random = new Random(); // UC2 - Random 1 to 6 roll die
        int roll_die = random.nextInt(6+1);
        System.out.println("Player gets number " + roll_die);
    }
}
