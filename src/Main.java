import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int i;
        int userNum;
        int square;
        int cube;
        String choice = "y";

        Scanner scnr = new Scanner(System.in);

        System.out.println("Learn your squares and cubes!");
        System.out.println("");

        while (choice.equalsIgnoreCase("y")) {

            System.out.println("Enter a number: ");
            userNum = scnr.nextInt();

            System.out.println("Number" + " Squared" + " Cubed");
            System.out.println("====== " + "=======" + " =====");

            for (i = 0; i <= userNum; i++) {

                square = (int) Math.pow(i, 2);
                cube = (int) Math.pow(i, 3);


                System.out.print(i + "      " + square + "       " + cube);
                System.out.println();


            }
            System.out.println("Would you like to coninue: y/n?");
            choice = scnr.next();
        }

        System.out.println("Goodbye");
    }
}
