import java.util.Scanner;

public class AveragePoint {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Physics points: ");
        byte phys = scanner.nextByte();
        System.out.println("Enter your Chemistry points: ");
        byte chem = scanner.nextByte();
        System.out.println("Enter your Biology points: ");
        byte bio = scanner.nextByte();

        int total = phys + chem + bio;
        float avr = (float) total / 3;

        System.out.println("Your total points is: " + total);
        System.out.println("Your average points is: " + avr);
    }

}
