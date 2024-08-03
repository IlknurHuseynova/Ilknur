package Practice;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args){
        int randomnumber = (int)(Math.random()*100)+1;
        Scanner sc = new Scanner(System.in);
        boolean att = false;
        for (int i = 10; i > 0; i--) {
            System.out.println("You have " + i + " attempts to guess");


        int gnumber = sc.nextInt();

            if(gnumber < randomnumber){
                System.out.println("The number is greater than " + gnumber);
            }
            else if(gnumber > randomnumber){
                System.out.println("The number is smaller than " + gnumber);
            }
            else{
                att = true;
            break;
            }
        }

        if(att){
            System.out.println("You Won!!!");
        }
        else{
        System.out.println("You could not guess the number(");
        }
    sc.close();

    }
}
