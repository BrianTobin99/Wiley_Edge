import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SummativeSums {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        System.out.println("How many  numbers would you like in  your array? ");

        String input1 = new String(in.nextLine());

        int arrayLen = Integer.parseInt(input1);

        calculate(arrayLen, getNums(arrayLen, in));
        in.close();
    }

    /**
     * @param arrayLen
     * @param in
     * @return 
     */
    private static List<Integer> getNums(int arrayLen, Scanner in) {

        List<Integer> input2 = new ArrayList<Integer>();

        for(int i = 0; i < arrayLen; i++){
            System.out.println("\nGive me a number. ");

            String num = new String(in.nextLine());

            input2.add(Integer.parseInt(num));
        }

        return input2;
    }

    private static void calculate(int arrayLen, List<Integer> nums) {
        int sum = 0;

        for (int i = 0; i < arrayLen; i++) {
            int num = nums.get(i);
            sum += num;
        }
        System.out.printf("\nThe total sum of your array is: %d", sum);
    }
}
