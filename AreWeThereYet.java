
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Give a number, 4 to quit ");
            int userInput = Integer.valueOf(scanner.nextLine());
            if (userInput == 4){
                break;
            }
            System.out.println("You entered " + userInput);
        }
        System.out.println("Thank You!!");
    }
}
