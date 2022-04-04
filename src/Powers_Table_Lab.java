import java.util.Scanner;

public class Powers_Table_Lab {

	public static void main(String[] args) {
		System.out.println("Learn your squares and cubes!");
		Scanner scnr = new Scanner(System.in);
        String choice = "y";

        do
        {
            System.out.print("Enter a number: ");
            int num = scnr.nextInt();
            String table = "Number  " + "Squared " + "Cubed   " + "\n"
                        +   "======  " + "======= " + "=====   ";
            System.out.println(table);
            int square = 0;
            int cube = 0;
            String row = "";
            for (int i = 1; i <= num; i++)
            {
                square = i * i;
                cube = i * i * i;

                row = i + "       " + square + "       " + cube;
                System.out.println(row);
            }
            System.out.print("Do you want to continue? (y/n): ");
            choice = scnr.next();
            System.out.println();

        }
        while (!choice.equalsIgnoreCase("n"));  
        System.out.println("Have a good day!");
    }
	}


