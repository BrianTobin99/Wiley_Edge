import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.w3c.dom.ranges.Range;

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
        List<String> breeds = new LinkedList<String>(Arrays.asList("St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug",  "King Doberman", "German Shepherd"));

        int n1 = ran.nextInt(100);
        int n2 = ran.nextInt(100 - n1);
        int n3 = ran.nextInt(100 - n1 - n2);
        int n4 = ran.nextInt(100 - n1 - n2 -n3);
        int n5 = (100 - n1 - n2 - n3 - n4);

        String breed1 = breeds.get(ran.nextInt(breeds.size()));
        breeds.remove((breeds.indexOf("breed1") + 1));
        String breed2 = breeds.get(ran.nextInt(breeds.size()));
        breeds.remove((breeds.indexOf("breed2") + 1));
        String breed3 = breeds.get(ran.nextInt(breeds.size()));
        breeds.remove(breeds.indexOf("breed3" + 1));
        String breed4 = breeds.get(ran.nextInt(breeds.size()));
        breeds.remove(breeds.indexOf("breed4" + 1));
        String breed5 = breeds.get(ran.nextInt(breeds.size()));

        System.out.printf("Sir %s is:\n%d% %s", input, n1, breed1);
        System.out.printf("\n%d% %s", input, n2, breed2);
        System.out.printf("\n%d% %s", input, n3, breed3);
        System.out.printf("\n%d% %s", input, n4, breed4);
        System.out.printf("\n%d% %s", input, n5, breed5);

        System.out.println("\n\nWo, that's QUITE the dog!");
    
    }
}
