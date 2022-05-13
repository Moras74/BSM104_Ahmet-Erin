import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
    	Scanner scan =  new Scanner(System.in);
    	System.out.print("Bir Kelime Giriniz: ");
        String inputString = scan.nextLine();
        String reverseString="";
        int length = inputString.length();
        
        for (int index = length-1; index >=0; index--) {
        	reverseString = reverseString + inputString.charAt(index);
        }
        	if (inputString.equals(reverseString)) {
            	
                System.out.println("Evet, palindromedir");
        	}else {
                System.out.println("Hayir, palindrome degil");
        }}
    }
        
    

