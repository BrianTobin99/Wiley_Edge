import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your dog's name? ");
        String input = new String(scan.nextLine());

        scan.close();

        getReport(input);
    }

    private static void getReport(String input) {

        System.out.printf("Well then, I have this highly reliable report on %s prestigious background right here.\n", input);
        Random ran = new Random();
        List<Integer> randoms = new ArrayList<Integer>();
        List<String> breeds = new ArrayList<String>(){{
            add("St. Bernards");
            add("Chihuahua");
            add("Pug");
            add("Labrador");
            add("Golden Doodle");
        }
        };

        int sum = 100;
        for(int i = 0; i < 4; i++){

            int ranInt = ran.nextInt(sum);
            sum -= ranInt;
            System.out.println(sum);
            randoms.add(ranInt);

        }
        randoms.add(sum);

        System.out.println(randoms);

        System.out.printf("Sir %s is:", input);

        while (breeds.size() > 0) {
            int randomIndex = ran.nextInt(breeds.size());
            String breed = breeds.get(randomIndex);
            System.out.printf("\n%d %s", randoms.get(randomIndex), breed);
            breeds.remove(randomIndex);
            randoms.remove(randomIndex);
            

        }
        System.out.println("\n\nWo, that's QUITE the dog!");
    
    }
}
