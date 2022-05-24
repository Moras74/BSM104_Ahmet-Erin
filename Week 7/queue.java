import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;
public class queue {
	public static void main(String[] args) {
		
	String data[] = {"java","php","python","C","c++"};
	
	Queue<String> q=new LinkedList<String>();
	for(String word:data) {
		q.add(word);
	}
	System.out.println("queue = "+q);
	System.out.println("Queue Size = "+q.size());
	System.out.println("peek = "+q.peek());	
	}		
	}