package Day_4;
import java.util.Scanner;
public class Snake_and_Ladder {
    public static final int winningPosition = 100 ;
    public static void main(String[] args) {
        System.out.println(" Enter Player Name : " );
        Scanner s = new Scanner(System.in);
        String playerName = s.next();
        int playerPosition = 0; // UC1 - initial position
        System.out.println(" Player Name : " + playerName );

        while ( winningPosition > playerPosition )
        {
            int die = (int) (Math.floor(Math.random() * 10) % 6 + 1);
            int remainingPosition = winningPosition - playerPosition ;
            int option = (int) (Math.floor(Math.random() * 10) % 3);
            if ( remainingPosition >= die ) {
                switch (option) {
                    case 0:
                        System.out.println("No Play");
                        playerPosition += 0;
                        break;

                    case 1:
                        System.out.println("Ladder");
                        playerPosition += die;
                        if (playerPosition > 100)
                            playerPosition = 100;
                        break;

                    default:
                        System.out.println("Snake");
                        playerPosition -= die;
                        if (playerPosition < 0)
                            playerPosition = 0;
                        break;
                }
            }
        }
        System.out.println("Player Position : " + playerPosition);
    }
}
