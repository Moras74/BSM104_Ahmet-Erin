import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Set;
public class Maps1 {
	public static void main(String[] args) {
		
		Map<Integer,String> citys = new TreeMap<Integer,String>();
		citys.put(34, "istanbul");
		citys.put(6, "ankara");
		citys.put(35, "izmir");
		citys.put(55, "samsun");

		System.out.println(citys);
		System.out.println("indeksler - keys"+citys.keySet());
		System.out.println(citys.values());
		System.out.println(citys.get(35));
		Map <Integer,Set<String>> citys2=new HashMap<Integer,Set<String>>();
		
		citys2.put(34, new TreeSet<String>());
		citys2.get(34).add("istanbul");
		citys2.get(34).add("besiktas");
		citys2.get(34).add("eminonu");
		citys2.put(6,new TreeSet<String>());
		citys2.get(6).add("ankara");
		citys2.get(6).add("cankaya");
		System.out.println(citys2);


		
		
	}
	
	
	
}
