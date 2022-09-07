import java.util.Arrays;
import java.util.Scanner;

public class Processor {
    String input;
    String originalInput;
    String endResult;

    public void Read() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        String string = "myObj.nextLine()";

        while (string.isEmpty() == false){
            System.out.println("Enter a string");
            string = myObj.nextLine();
            originalInput = string;
            Clean();
            Sort();
            Palindrome();
            Print();
        }
    }

    public void Clean() {
        input = originalInput.toUpperCase().replaceAll("\\s+","");
    }

    public void Sort() {
        char charsInString[] = input.toCharArray();
        Arrays.sort(charsInString);
        input = new String(charsInString);
    }

    public void Palindrome() {
        String firstHalf = "";
        char charsInString[] = input.toCharArray();
        for(int i = charsInString.length - 1; i > 0; i--)
        {
            firstHalf = firstHalf + charsInString[i];
        }
        endResult = firstHalf + input;
    }

    public void Print() {
        System.out.println("Original Input: " + originalInput);
        System.out.println("End Result: " + endResult);
    }
        
}