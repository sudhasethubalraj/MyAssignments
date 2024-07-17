package week1.day3;

public class Fibanacci {
	
	public void printFibonacci(int range) {
		int a = 0; int b = 1;
        System.out.print("Fibonacci series up to " + range + " terms: ");

		for (int i = 0; i < range; i++) {
			System.out.print("  " + a + " " );
			int next  = a + b;
			a = b;
			b = next;
		}
		
		

	}

	public static void main(String[] args) {
		
		Fibanacci obj = new Fibanacci();
		obj.printFibonacci(8);
		

	}

}
