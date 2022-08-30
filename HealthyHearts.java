import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        System.out.println("What is your age? ");

        String input = new String(in.nextLine());

        int age = Integer.parseInt(input);

        calculate(age);
        in.close();
    }

    private static void calculate(int age) {

        int maximum = 220 - age;

        System.out.printf("Your maximum heart rate should be %d beats per minute\n", maximum);

        System.out.println("Your target HR Zone is " + (maximum * 0.5) + " - " + (maximum * 0.85) + " beats per minute");

        //Your maximum heart rate should be 170 beats per minute
        //Your target HR Zone is 85 - 145 beats per minute
    }

}
