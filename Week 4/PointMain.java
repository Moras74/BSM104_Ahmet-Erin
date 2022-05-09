
public class PointMain 
{
 public static void main(String[] args) {
	 
	 Point p = new Point(4,6);
	 
	 System.out.println(p.distanceFromOrigin());
	 System.out.println(p.getX());
	 System.out.println(p.getY());
	 
	 p.translate(2, 3);
	 
	 System.out.println(p.distanceFromOrigin());
	 System.out.println(p.getX());
	 System.out.println(p.getY());
	 
	 p.setLocation(7, 12);
	 
	 System.out.println(p.distanceFromOrigin());
	 System.out.println(p.getX());
	 System.out.println(p.getY());
 
 }
}
