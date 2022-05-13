import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
public class PalindromeQueue {
public static void main(String[] args) 
{
	Scanner scan =  new Scanner(System.in);
	System.out.print("Bir Kelime Giriniz: ");
    String girilenKelime = scan.nextLine();
    Queue queue = new LinkedList<>();
    for(int i = girilenKelime.length()-1; i>=0; i--) {
    	queue.add(girilenKelime.charAt(i));
    }
    String reverseString = "";
    while(!queue.isEmpty()) {
    	reverseString = reverseString + queue.remove();
    }
    if (girilenKelime.equals(reverseString)) {
    	System.out.println("Girilen Kelime Palindromedir");
    }
    else {
    	System.out.println("Girilen Kelime Palindrome degil");
    }
}
}