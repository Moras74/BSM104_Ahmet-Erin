import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

	public class FibonacciLinkList {
	    private LinkedList<Integer> fibonacciList;

	    public FibonacciLinkList() {
	        this.fibonacciList = new LinkedList<Integer>();
	    }

	    public LinkedList<Integer> sum()
	    {
	        int n, a = 0, b = 0, c = 1;

	        for(int i = 1; i <= 20; i++)
	        {
	            fibonacciList.add(a);
	            a = b;
	            b = c;
	            c = a + b;
	        }
	        return fibonacciList;
	    }

	    public void display() {
	        System.out.println(fibonacciList);  
	    }

	    public static void main(String[] args) {
	        FibonacciLinkList fibonacciList = new FibonacciLinkList();
	        fibonacciList.sum();
	        fibonacciList.display();
	    }
	}