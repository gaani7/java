package nodePackage;

import java.util.Scanner;

public class tester {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Geli size-ka array/queue: ");
        int size = input.nextInt();

        cercularArray<Integer> queue = new cercularArray<>(size);

        System.out.println("Hadda geli " + size + " element(s):");
        for (int i = 0; i < size; i++) {
            System.out.print("Element [" + (i + 1) + "]: ");
            int value = input.nextInt();
            queue.enqueue(value);
        }

        int choice;
        do {
            System.out.print("\nGeli value aad raadinayso: ");
            int searchValue = input.nextInt();

            boolean found = queue.searchArry(searchValue); // searchArry waa inuu return boolean

            if (found) {
                System.out.println("Waa la soo helay");
            } else {
                System.out.println("Waa la waayay");
            }

            System.out.print("Mar kale ma rabtaa search? (1=Haa, 0=Maya): ");
            choice = input.nextInt();

        } while (choice == 1);

        System.out.println("Waa dhammaatay.");
    }
}
