import java.util.ArrayList;

public class StarAdd
{
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList();
		words.add("ahmet");
		words.add("muhammed");
		words.add("ali");
		System.out.println("for den onceki hali"+words);
		System.out.println("Listenin uzunlugu = "+words.size());
		for (int i=0;i<words.size();i+=2) {
			words.add(+i,"*");
		}
		System.out.println("döngüden Sonraki hali"+words);
		System.out.println("Listenin uzunlugu = "+words.size());
for (int index =0; index < words.size(); index++) {
	words.remove(index);
}
System.out.println("silme sonrasi"+words);
System.out.println("silme liste uzunlugu = "+words.size());

		
		
	}
	
	
	
	
	
}