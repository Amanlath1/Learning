import java.util.*;
public class SBAccount {
	public static void main(String [] args){
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount : ");
		int amount=sc.nextInt();
//		System.out.println("Enter the age : ");
//		int age=sc.nextInt();
		System.out.println("Enter the days : ");
		int days=sc.nextInt();
		double interest=0;
		double rate=0;
		
		if(days>=7&days<=14){
			interest=6.50;
			rate=amount*interest/100;
			System.out.println("Rate : "+rate);
			}
		else if(days>=15&days<=29){
			interest=4.50;
			rate=amount*interest/100;
			System.out.println("Rate : "+rate);
			}
}
}
