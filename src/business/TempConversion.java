package business;

//Name of the file    :: TempConversionCL.java
//created by          :: Sridhar Kandukuri
//Date                :: 06/15/98
//Description         :: this program takes a temperature 
//                        in Celsius as
//                        a single command line argument
//                        and converts it to Fahrenheit 

public class TempConversion {

	public static void main(String[] args) {
		// convert command line arg[0] (a String)
		// to double
		double cels = (new Double(args[0])).doubleValue();

		// print out original temperature value
		System.out.println("The temperature in Celsius is : " + args[0]);

		// convert to Fahrenheit value
		double fahren = (cels / 5) * 9 + 32;

		// print out Fahrenheit value
		System.out.print("The corresponding temperature " + "in Fahrenheit ");
		System.out.println("is : " + fahren);
	}
}