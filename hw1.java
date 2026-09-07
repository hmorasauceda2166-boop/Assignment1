
import java.util.Scanner;

class hw1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //My name
        String s = "Hiram";

        for (Character c : s.toCharArray()){
            System.out.println((int)c);
        }

        //Any name or text to be converted
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