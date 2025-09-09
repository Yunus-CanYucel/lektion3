package se.jensen.yunus.lektion3;

import java.util.Scanner;

public class Methodexcercizep2 {




        public static void printPersonalGreeting(String name){


        System.out.println("Hej," + name);

        }

        public static void printGreeting() {
            Scanner what = new Scanner(System.in);
            String name1 = what.nextLine();

            /*
            first part creates scanner so that the user can input their name


             */

            printPersonalGreeting(name1);
            System.out.println("Välkommen till JAVA!");


        }
        public static void main(String[] args) {
        System.out.println("Vad heter du?");
        printGreeting();




    }

}

