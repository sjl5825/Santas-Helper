/* 
 * This program calculates toy totals.
 * Spenser Lehman 11/29/18
 */
import java.text.*;
import java.util.*;

public class Santa_Clause {

	//declare variables
	static String iString1;
	static String iString2;
	static String iFirstName, iLastName;
	static String iToyName1;
	static double cPrice1;
	static String oPrice1;
	static String iToyName2;
	static double cPrice2;
	static String oPrice2;
	static double cSubTotal;
	static String oSubTotal;
	static double cTotal;
	static String oTotal;
	static double cFinalTax;
	static String oFinalTax;
	static double cTax;
	static Scanner myScanner; 	
	static NumberFormat nf; 
	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub

		//call init
		init();
		
		//call input  
		input();
		
		//call calcs
		calcs();
		
		//call output
		output();
		
	System.out.println("Merry Christmas!! Have a holly jolly christmas!!");
		
		}
	
public static void init() {
	myScanner = new Scanner(System.in);
	myScanner.useDelimiter(System.getProperty("line.separator"));
	nf = NumberFormat.getCurrencyInstance(java.util.Locale.US);
	
}

public static void input() {
	System.out.println("Please enter child's first name.");
	iFirstName = myScanner.next();
			
	System.out.println("Please enter child's last name.");
	iLastName = myScanner.next();
	
    System.out.println("Please enter toy's name.");
	iToyName1 = myScanner.next();

try {
	System.out.println("Please enter toy's price.");
	iString1 = myScanner.next();
	cPrice1 = Double.parseDouble(iString1);
    }

catch (Exception e) {
	System.out.println("Price must be exact and have a decimal. Default is set to 0.");
	cPrice1 = 0;
    }
	
    System.out.println("Please enter the name of the second toy.");
	iToyName2 = myScanner.next();
	
try {	
	System.out.println("Please enter the price of the second toy.");
	iString2 = myScanner.next();
	cPrice2 = Double.parseDouble(iString2); 
}

catch (Exception e) {
	System.out.println("Price must be exact and have a decimal. Default is set to 0.");
	cPrice2 = 0; }
}



public static void calcs() {
	//calculating SubTotal
	cSubTotal = cPrice1 + cPrice2;
	//changing tax
	cTax = .07;
	//calculating tax
	cFinalTax = cSubTotal * cTax;
	//calculating total
	cTotal = cSubTotal + cFinalTax;
}
	
public static void output() {
	System.out.println("Name: " + iFirstName + " " + iLastName);
	System.out.println("First Toy's Name: " + iToyName1);
	oPrice1 = nf.format(cPrice1);
	System.out.println("First Toy's Price: " + oPrice1);
	System.out.println("Second Toy's Name: " + iToyName2);
	oPrice2 = nf.format(cPrice2);
	System.out.println("Second Toy's Price: " + oPrice2);
	oSubTotal = nf.format(cSubTotal);
	System.out.println("SubTotal: " + oSubTotal);
	oFinalTax = nf.format(cFinalTax);
	System.out.println("Tax Total: " + oFinalTax);
	oTotal = nf.format(cTotal);
	System.out.println("Total: " + oTotal);
}

}
