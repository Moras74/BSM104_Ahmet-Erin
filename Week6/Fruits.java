import java.util.ArrayList;
public class Fruits {
public static void main(String[] args)
{
	ArrayList<String> list = new ArrayList<String>();
	list.add("Elma");
	list.add("Portakal");
	list.add("Muz");
	list.add("Ananas");
	list.add("Kiraz");
	
	System.out.println(list);
	for(String fruit:list)
		System.out.println(fruit);
			
}
}
