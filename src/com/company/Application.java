import java.util.Scanner;
public class Application{
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int input=0;
        int num1,num2,num3;
        int integer;

        // If user enters anything besides an integer
        do {
            System.out.println("Enter an integer:");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a integer. Please enter an integer.");
                sc.next();
            }

            input = sc.nextInt();
        }
        //restating users input
        while (input <= 0);
        System.out.println("Thank you! You entered: " + input);


        //print the cube of digits
        int number = input; //temp variable
        int counter = 0; // count no of digits
        int sum = 0;

        //digits are cubed and added together.
        while(number >0){
            int t=number%10;
            sum += t*t*t;
            counter = counter+1;
            number = number/10;

        }
        //out put prompt based on input integer outcome
        if (input == sum ){
            System.out.println("The answer is true. This number passes the test.");
        }
        else {
            System.out.println("The answer is false. This number fails the test.");
        }
        return;

    }
}
