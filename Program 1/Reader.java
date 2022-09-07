import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
    ArrayList<Double> numbersList;
    
    public Reader() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        Double number;
        ArrayList<Double> numbers = new ArrayList<Double>();

        String stringNum = "myObj.nextLine();";

        while (stringNum != null){
            System.out.println("Enter a number");
            stringNum = myObj.nextLine();

            try {
                number = Double.parseDouble(stringNum);
                numbers.add(number);
            } catch (Exception e){
                stringNum = null;
            }


            System.out.println("Current numbers are: " + numbers); 
        }
        numbersList = numbers;
    }

    public ArrayList<Double> getData(){
        
        return numbersList;

    }

}