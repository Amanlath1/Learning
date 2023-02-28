import java.util.*;

public class FDAccount{
public static void main(String [] args){
@SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Amount : ");
int amount=sc.nextInt();
System.out.println("Enter the age : ");
int age=sc.nextInt();
System.out.println("Enter the days : ");
int days=sc.nextInt();
double interest=0;
double rate=0;
if(amount<=10000000 || age<65 ){
if(days>=7&days<=14){
interest=4.50;
rate=amount*interest/100;
System.out.println("Rate : "+rate);
}
else if(days>=15&days<=29){
interest=4.75;
rate=amount*interest/100;
System.out.println("Rate : "+rate);
}
else if(days>=30&days<=45){
interest=5.50;
rate=amount*interest/100;
System.out.println("Rate : "+rate);
}
else if(days>=46&days<=60){
interest=7.00;
rate=amount*interest/100;
System.out.println("Rate : "+rate);
}
else if(days>=61&days<=184){
interest=7.50;
rate=amount*interest/100;
System.out.println("Rate : "+rate);
}
else if(days>=185&days<=365){
interest=8.00;
rate=amount*interest/100;
System.out.println("Rate : "+rate);
}
}
else if(amount<=10000000 || age>=65 ){
	if(days>=7&days<=14){
		interest=5.00;
		rate=amount*interest/100;
		System.out.println("Rate : "+rate);
		}
		else if(days>=15&days<=29){
		interest=5.25;
		rate=amount*interest/100;
		System.out.println("Rate : "+rate);
		}
		else if(days>=30&days<=45){
		interest=6.00;
		rate=amount*interest/100;
		System.out.println("Rate : "+rate);
		}
		else if(days>=46&days<=60){
		interest=7.50;
		rate=amount*interest/100;
		System.out.println("Rate : "+rate);
		}
		else if(days>=61&days<=184){
		interest=8.00;
		rate=amount*interest/100;
		System.out.println("Rate : "+rate);
		}
		else if(days>=185&days<=365){
		interest=8.50;
		rate=amount*interest/100;
		System.out.println("Rate : "+rate);
}
}
else if(amount>10000000) {
if(days>=7&days<=14){
interest=4.50;
rate=amount*interest/100;
System.out.println("Rate : "+rate);
}
else if(days>=15&days<=29){
interest=4.75;
rate=amount*interest/100;
System.out.println("Rate : "+rate);
}
else if(days>=30&days<=45){
interest=5.50;
rate=amount*interest/100;
System.out.println("Rate : "+rate);
}
else if(days>=46&days<=60){
interest=7.00;
rate=amount*interest/100;
System.out.println("Rate : "+rate);
}
else if(days>=61&days<=184){
interest=7.50;
rate=amount*interest/100;
System.out.println("Rate : "+rate);
}
else if(days>=185&days<=365){
interest=8.00;
rate=amount*interest/100;
System.out.println("Rate : "+rate);
}
}
}
}
