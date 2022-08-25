import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sampleInput = "Hello World How Are You";
		
		//Sample Output
		// H : Hello How
		// W : World 
		// A : Are
		// Y : You
		
		
		display(formatTheInput(sampleInput));
	}

	private static String formatTheInput(String sampleInput) {
		// TODO Auto-generated method stub
		String StringToReturn = "";
		// Code to format the String
        List<String> list = new ArrayList<String>(Arrays.asList(sampleInput.split(" ")));
        System.out.print(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

		
		return StringToReturn;
	}

	private static void display(String outputString) {
		// TODO Auto-generated method stub
		
	}

}