
package se.jensen.yunus.lektion3;

import java.util.Scanner;

public class Methodexcercizep3 {
    //create an input for users
    private static Scanner scan = new Scanner(System.in);
    //method for the first number
    public static int number1(){

        System.out.print("Enter your first number: ");
        int n1umber = Integer.parseInt(scan.nextLine());

        return n1umber;
    }

    //method for the second number
    public static int number2(){
        System.out.print("Enter your second number: ");
        int n2umber = Integer.parseInt(scan.nextLine());

        return n2umber;
    }

    //Main method for the code
    public static void main(String[] args) {

        //array for the numbers
        int[] values = new int[]{number1(),number2()};
        //calculating the sum of the values in the array and printing it out
        System.out.println((values[0]+values[1]));

    }

}

