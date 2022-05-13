import java.util.Stack;
import java.util.Scanner;
class PalindromeStack {

    public static void main(String[] args) {
    	Scanner scan =  new Scanner(System.in);
    	System.out.print("Bir Kelime Giriniz: ");
        String girilenKelime = scan.nextLine();
        
        Stack kelime = new Stack();

        for (int i = 0; i < girilenKelime.length(); i++) {
        	
            kelime.push(girilenKelime.charAt(i));
            System.out.println(kelime);
        }

        String reverseString = "";

        while (!kelime.isEmpty()) {
        	
            reverseString = reverseString+kelime.pop();
            System.out.println(reverseString);
        }

        if (girilenKelime.equals(reverseString))
        	
            System.out.println("Evet, palindromedir");
        else
            System.out.println("Hayir, palindrome degil");
    }
}