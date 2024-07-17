package week1.day3;

public class IsPrime {

	public boolean checkPrime(int num) {
		boolean flag = true;
		for (int i=2;i<num-1;i++)
		{
			if(num%i==0) {
				flag = false;
				break;
			}

		}
		return flag;
	}

	public static void main(String[] args) {

		IsPrime obj = new IsPrime();
		int input = 3;
		boolean flag = obj.checkPrime(input);
		if(flag) {
			System.out.println("The given input " + input +" is prime " );
		}
		else {
			System.out.println("The given input " + input +" is not a prime " );
		}


	}

}
