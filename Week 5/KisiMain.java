import java.util.ArrayList;
public class KisiMain {
public static void main(String[] args) {
	ArrayList<Kisi> bireyler = new ArrayList<>();
	
	bireyler.add(new Kisi("Ahmet",20));
	bireyler.add(new Kisi("Ali",21));
	bireyler.add(new Kisi("Mahmut",24));
	
      for (Kisi birey:bireyler) {
    	  System.out.println("isim: "+birey.getIsim()+" , yas: "+birey.getYas());
      }

}
}