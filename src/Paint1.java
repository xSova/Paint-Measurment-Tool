import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea;
        double gallonsPaintNeeded;
        boolean askForInput;
		final double squareFeetPerGallons = 350.0;
        
        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's height
        do {
        	System.out.println("Enter wall height: ");
        	try {
        		wallHeight = scnr.nextInt();
        		askForInput = false;
        		if (wallHeight <= 0) {
        			throw new Exception();
        		} 
        	} catch(Exception e) {
    			scnr.nextLine();
        		askForInput = true;
    		}
        	
            } while(askForInput);
        //System.out.println("Wall height collected: " + wallHeight);
        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's width
	    do {
	    	System.out.println("Enter wall width (feet): ");
	    	try {
        		wallWidth = scnr.nextInt();
        		askForInput = false;
        		if (wallWidth <= 0) {
        			throw new Exception();
        		}
        	} catch(Exception e) {
        		scnr.nextLine();
        		askForInput = true;
        		
        	}
	    	} while(askForInput);
        //System.out.println("Wall width collected: " + wallWidth);
        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea +  " square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;
        System.out.printf("Paint needed: " + gallonsPaintNeeded + " gallons", "%.2f\n");

    }
}
