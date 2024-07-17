package week1.day3;

public class Palindrome {
	
	public void checkPalindrome(int value) {
		int output = 0;
		for (int i = value; i > 0; i/=10) {
			int rem = i%10;
			
			output = output * 10 + rem;
			
		}
		
		if(value == output)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

	public static void main(String[] args) {
		int input = 454;
		 
		Palindrome obj = new Palindrome();
		
		obj.checkPalindrome(input);
		
	

	}

}
