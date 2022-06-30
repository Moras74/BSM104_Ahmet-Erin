import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Fibonacci_ArrayList {
	
	   public static void main(String[] args) {

		      Scanner scan = new Scanner(System.in);
		      System.out.print("Enter a number :");
		      
		      int n = scan.nextInt();

		      List<Integer> numbersList = new ArrayList<>();
		      int first = 0, second = 1, fib;
		      numbersList.add(first);
		      numbersList.add(second);
		      
		      for(int i = 2; i < n; i++) {
		          fib = second + first;
		          first = second;
		          second = fib;
		          numbersList.add(fib);
		      }
		      System.out.println(numbersList);
		  }
		}