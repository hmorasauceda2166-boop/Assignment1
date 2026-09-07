import java.util.Scanner;

public class BaseConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = input.nextLine();

        System.out.print("Enter its base (2, 8, 10, or 16): ");
        int base = input.nextInt();

        int decimal = Integer.parseInt(number, base);

        // Used ChatGPT/google search to help with the base conversion methods below
        System.out.println("Binary: " + Integer.toBinaryString(decimal));
        System.out.println("Decimal: " + decimal);
        System.out.println("Octal: " + Integer.toOctalString(decimal));
        System.out.println("Hexadecimal: " + Integer.toHexString(decimal).toUpperCase());

        input.close();
    }
}