//++++++++++++++++++++++++++++++++++++++++++++++++
// Name: assign1.java
// Function: assignment1 - boolean algebra
// Programmer: Charles Lett Jr.
// Last Updated: 04/17/22
//++++++++++++++++++++++++++++++++++++++++++++++++

import java.util.Scanner;

public class assign1 {
    public void run(){
        start_calc();
    }

    private void start_calc(){
        Scanner inp = new Scanner(System.in);
        int selection, x, y, z;

        System.out.print("Enter Values for x, y, and z\n");
        System.out.print("x >>> ");
        x = inp.nextInt();

        System.out.print("y >>> ");
        y = inp.nextInt();

        System.out.print("z >>> ");
        z = inp.nextInt();

        System.out.println("Which Expression would you like to use?\n" +
                "\t1) xy + 1 * z\n" +
                "\t2) x + z * (0 + y)");

        System.out.print(">>> ");
        selection = inp.nextInt();

        if (selection < 1 || selection > 2) {
            System.out.print("[ERR] Selection Not Found. Rerun the program and try again.");
            System.exit(404);
        }
        if (selection == 1) bool_calc1(x, y, z);
        if (selection == 2) bool_calc2(x, y, z);

    }

    private void bool_calc1(int x, int y, int z){
        // formula - xy + 1 * z
        int p1 = x * y;
        int p2 = p1 + 1;
        int p3 = p2 * z;

        if (p3 == 0) System.out.println("False");
        if (p3 > 0) System.out.println("True");
    }

    private void bool_calc2(int x, int y, int z){
        // formula - x + z * (0 + y)
        int p1 = y;
        int p2 = z * p1;
        int p3 = x + p2;

        if (p3 == 0) System.out.println("False");
        if (p3 > 0) System.out.println("True");
    }
}
