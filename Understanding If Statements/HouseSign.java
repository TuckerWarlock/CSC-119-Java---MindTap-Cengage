// HouseSign.java - This program calculates prices for custom house signs.

public class HouseSign 
{
	public static void main(String args[])
	{
		// This is the work done in the housekeeping() method
        // Declare and initialize variables here.
        double basePrice = 35.00;
        int addChars = 4;
        double oakWood = 20.00;
        int goldLeaf = 15;

        // Charge for this sign.
        // Number of characters.
        int numChars = 8;
        // Color of characters.
        String color = "gold";
        // Type of wood.
        String woodType = "oak";
        // This is the work done in the detailLoop() method
        // Write assignment and if statements here as appropriate.
        double charge = basePrice;

        if(numChars > 5){
            charge += ((numChars - 5) * addChars);
        }
        if(woodType.equals("oak")){
            charge += oakWood;
        }
        if(color.equals("gold")){
            charge += goldLeaf;
        }
		// This is the work done in the endOfJob() method	
		// Output Charge for this sign.
		System.out.println("The charge for this sign is $" + charge);

		System.exit(0); 
	}
} 	
