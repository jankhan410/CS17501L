import java.util.Scanner;
public class grocerystore3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.println("Please enter the cost of your groceries or 0 to quit:");
double price=in.nextDouble();
double discount8=0.08;
double discount10=0.10;
double discount12=0.12;
double discount14=0.14;
double discountcount8=price*discount8;
double discountcount10=price*discount10	;	
double discountcount12=price*discount12;
double discountcount14=price*discount14;
boolean turn=true;
while(turn);
	{
	if(price==0)
	{
		turn=false;
	}
	else if(price<10)
	{
		System.out.print("You are not eligible for a coupon this time");
	}
	else if (price>=10&&price<=60)
	{   
	System.out.println("You win a discount coupon of $"+discountcount8+"(8% of your purchase");
	
	}

	else if (price>=60&&price<=150)
	{
	System.out.println("You win a discount coupon of $"+discountcount10+"(10% of your purchase");
	}
	else if (price>=15&&price<=210)
	{
	System.out.println("You win a discount coupon of $"+discountcount12+"(12% of your purchase");
	}
	else if (price>210);
	{
	System.out.println("You win a discount coupon of $"+discountcount14+"(14% of your purchase");
	}
	}



	}}


