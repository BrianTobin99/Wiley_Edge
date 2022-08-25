
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	/**
	 * @param args
	 * @param String
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		
        System.out.println("Enter Number of Rounds: ");
        String Input = new String(in.nextLine());

        Map<String, Integer> results = new HashMap<String, Integer>();
        // int P1wins = 0;
        // int Cwins = 0;
        // int Ties = 0;


        if (checkInput(Input)){

            int rounds = Integer.parseInt(Input);
            for(int i = 1; i <= rounds; i++){

                System.out.println("Enter your choice:");
                String P = new String(in.nextLine());
                playGame(P, results);

                //print map so I can see if its adding to it
                // if (results.containsKey("P1")){
                //     P1wins = P1wins + results.get("P1");
                // }

                // if (results.containsKey("C")){
                //     Cwins = Cwins + results.get("C");
                // }
                
                // if (results.containsKey("Tie")){
                //     Ties = Ties + results.get("Tie");
                // }
            }
            //System.out.printf("P1 Wins: ", P1wins, "\n", "C Wins: ", Cwins, "\n", "Ties: ", Ties, "\n");
            // if (P1wins > Cwins & P1wins > Ties){
            //     System.out.printf("P1 wins with ", P1wins);
            // }
            // if (Cwins > P1wins & Cwins > Ties){
            //     System.out.printf("C wins with", Cwins);
            // }
            // else{
            //     System.out.printf("It was a draw with", Ties);
            // }

            List<Integer> scores = new ArrayList<Integer>();
            List<String> winners = new ArrayList<String>();
            for(String key : results.keySet()){     
                scores.add(results.get(key));
                winners.add(key);
            }
            System.out.printf("The winner is: " + winners.get(scores.indexOf(Collections.max(scores))) + " with a total score of: " + Collections.max(scores));
        }            
        else{
            System.out.println("Restart Program to start again.");
        }
        in.close();
	}

    private static Map<String, Integer> playGame(String P1, Map<String, Integer> results) {   
        List<String> choices = Arrays.asList("Paper", "Scissors", "Rock");
        String C = choices.get(new Random().nextInt(choices.size()));

        if (P1.equals("Rock") & C.equals("Scissors")){
            System.out.println("P wins");
            if (results.containsKey("P")){
                results.put("P", (results.get("P") + 1));
            }

            else{
                results.put("P", 1);
            }
            
        }

        if (P1.equals("Scissors") & C.equals("Paper")){
            System.out.println("P wins");
            if (results.containsKey("P")){
                results.put("P", (results.get("P") + 1));
            }

            else{
                results.put("P", 1);
            }
        }

        if (P1.equals("Paper") & C.equals("Rock")){
            System.out.println("P wins");
            if (results.containsKey("P")){
                results.put("P", (results.get("P") + 1));
            }

            else{
                results.put("P", 1);
            }
        }


        if (C.equals("Rock") & P1.equals("Scissors")){
            System.out.println("C wins");
            if (results.containsKey("C")){
                results.put("C", (results.get("C") + 1));
            }

            else{
                results.put("C", 1);
            }
            
        }

        if (C.equals("Scissors") & P1.equals("Paper")){
            System.out.println("C wins");
            if (results.containsKey("C")){
                results.put("C", (results.get("C") + 1));
            }

            else{
                results.put("C", 1);
            }
        }

        if (C.equals("Paper") & P1.equals("Rock")){
            System.out.println("C wins");
            if (results.containsKey("C")){
                results.put("C", (results.get("C") + 1));
            }

            else{
                results.put("C", 1);
            }

        }

        if (P1.equals(C)){
            System.out.println("Tie");
            if (results.containsKey("T")){
                results.put("T", (results.get("T") + 1));
            }

            else{
                results.put("T", 1);
            }

            
        }
        return results;
    }

    private static boolean checkInput(String input) {
        try{
            int rounds = Integer.parseInt(input);
            
            if ((rounds >= 1) && (rounds <= 10)){
                return true;
            }
        }
        catch(Exception e){
            System.out.println("You didn't enter number of rounds correctly.");
        }

        return false;
    }

}