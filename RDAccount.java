import java.util.*;

public class RDAccount{
public static void main(String [] args){
@SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Amount : ");
int amount=sc.nextInt();
System.out.println("Enter the age : ");
int age=sc.nextInt();
System.out.println("Enter the maturity period : ");
int maturity=sc.nextInt();
double interest=0;
double rate=0;
if(amount<=10000000 & age<=65 ){
if(maturity == 6){
interest=7.50;
rate=amount*interest/100;
System.out.println("Rate : "+rate);
}
else if(maturity>6&maturity<=9){
interest=7.75;
rate=amount*interest/100;
System.out.println("Rate : "+rate);
}
else if(maturity>9&maturity<=12){
interest=8.00;
rate=amount*interest/100;
System.out.println("Rate : "+rate);
}
else if(maturity>12&maturity<=15){
interest=8.25;
rate=amount*interest/100;
System.out.println("Rate : "+rate);
}
else if(maturity>15&maturity<=18){
interest=8.50;
rate=amount*interest/100;
System.out.println("Rate : "+rate);
}
else if(maturity>18&maturity<=21){
interest=8.75;
rate=amount*interest/100;
System.out.println("Rate : "+rate);
}
}
else if(amount>10000000 & age>65 ){
if(maturity<=6){
interest=8.00;
rate=amount*interest/100;
System.out.println("Rate : "+rate);
}
else if(maturity>6&maturity<=9){
interest=8.25;
rate=amount*interest/100;
System.out.println("Rate : "+rate);
}
else if(maturity>9&maturity<=12){
interest=8.50;
rate=amount*interest/100;
System.out.println("Rate : "+rate);
}
else if(maturity>12&maturity<=15){
interest=8.75;
rate=amount*interest/100;
System.out.println("Rate : "+rate);
}
else if(maturity>15&maturity<=18){
interest=9.00;
rate=amount*interest/100;
System.out.println("Rate : "+rate);
}
else if(maturity>18&maturity<=21){
interest=9.25;
rate=amount*interest/100;
System.out.println("Rate : "+rate);
}
}
}
}
