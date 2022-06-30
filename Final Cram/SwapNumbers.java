public class SwapNumbers{
public static void swapNumbers(int a, int b) {
    b = b + a;
	a = b - a;
	b = b - a;
		System.out.print("a is "+a+" b is "+b);
}

public static void main(String[] args) {
	int a = 10;
	int b = 20;
	swapNumbers(a, b);
 }}