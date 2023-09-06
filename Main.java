import java.util.*;
import java.io.*;
class Game 
{
    int noOfGuesses = 0;
    int number;
    int inputNumber;
    public int getNoOfGuesses(){
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses = noOfGuesses;
    }
    Game()
    {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    public void inputUserFunc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess The NUmber: ");
        inputNumber = sc.nextInt();
    }
    public boolean isCorrectNumber(){
        noOfGuesses++;
        if(number==inputNumber){
            System.out.format("Your Guess is correct, the number is %d\n You guessed the number in %d attemps", number, noOfGuesses);
            return true;
        }
        else if(number>inputNumber){
            System.out.println("The Number is Low......");
        }
        else if(number<inputNumber){
            System.out.println("The Number is High......");
        }
    
        return false;
    }

}
public class Main 
{
    public static void main(String[] args)
    {
         boolean game = false;
         Game g = new Game();
         while(!game)
         {
            g.inputUserFunc();
            game = g.isCorrectNumber();
         }       
    }
}