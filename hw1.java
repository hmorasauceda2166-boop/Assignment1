
import java.util.Scanner;

class hw1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = input.nextLine();

        for (int i = 0; i < text.length(); i++) {
            System.out.print((int) text.charAt(i));

            if (i < text.length() - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        input.close();
    }
}