import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;
public class stack {
	public static void main(String[] args) {
		
	String data[] = {"java","php","python","C","c++"};
	
	Stack<String> s=new Stack<String>();
	for(String word:data) {
		s.push(word);
	}
	System.out.println("stack = "+s);
	System.out.println(s.size());
	System.out.println(s.peek());
	s.pop();
	System.out.println("Stack = "+s);
	System.out.println(s.size());
	System.out.println(s.peek());	
	}		
	}

