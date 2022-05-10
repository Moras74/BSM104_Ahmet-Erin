import java.util.Stack;
import java.util.Scanner;
class Palindrome {

    public static void main(String[] args) {

    	System.out.print("Bir Kelime Giriniz");
        Scanner in=new Scanner(System.in);
        String inputString = in.nextLine();
        Stack stack = new Stack();

        for (int i = 0; i < inputString.length(); i++) {
        	
            stack.push(inputString.charAt(i));
        }

        String reverseString = "";

        while (!stack.isEmpty()) {
        	
            reverseString = reverseString+stack.pop();
        }

        if (inputString.equals(reverseString))
        	
            System.out.println("Evet, palindromedir");
        else
            System.out.println("Hayir, palindrome degil");
    }
}