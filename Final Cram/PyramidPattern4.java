import java.util.Scanner;
public class PyramidPattern4{
	private static void printPattern4(int rows) {
		// for loop for the rows
		for (int i = rows; i >= 1; i--) {
			// white spaces in the front of the numbers
			int numberOfWhiteSpaces = rows - i;

			//print leading white spaces
			printString(" ", numberOfWhiteSpaces);

			//print character
			printString("* ", i);

			//move to next line
			System.out.println("");
		}
	}

		//utility function to print string given times
		private static void printString(String s, int times) {
			for (int j = 0; j < times; j++) {
				System.out.print(s);
			}
		}

		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter the rows to print:");
			int rows = scanner.nextInt();
			// System.out.println("Rows = "+rows);
			scanner.close();

			System.out.println("Printing Pattern 1\n");
			printPattern4(rows);

		}}

	
