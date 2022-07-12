import java.util.Scanner;

public class parlo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.print("enter a number:");
		int num =sc.nextInt();
		int temp=0;
		int rev=0;
		while(num!=0) {
			
		rev=rev*10+num%10;
		num=num/10;
		
		
		
	}
		if (temp==num) {
System.out.println("the no is a palindrome no"+" "+rev);
	}
		else {
			System.out.println("not a palindrome ");
		}
		}

}
