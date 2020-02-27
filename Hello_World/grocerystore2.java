import java.util.Scanner;
public class grocerystore2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the cost of your groceries or 0 to quit:");
		Scanner in=new Scanner(System.in);
		double price=in.nextDouble();
		double discount8=0.08;
		double discount10=0.10;
		double discount12=0.12;
		double discount14=0.14;
		double discountcount8=price*discount8;
		double discountcount10=price*discount10	;	
		double discountcount12=price*discount12;
		double discountcount14=price*discount14;
		
		
		
		if(price<10)
			{
			System.out.println("You are not eligible for a coupon this time");
			}
		else if(price>=10&&price<=60)
	    {   
			System.out.printf("You win a discount coupon of $%.2f",discountcount8);
			System.out.print(" (8% of your purchase)");
			
		}
			else if (price>=60&&price<=150)
		{
			System.out.printf("You win a discount coupon of $%.2f",discountcount10);
		    System.out.print("  (10% of your purchase)");
		}
			else if (price>=15&&price<=210)
		{
			System.out.printf("You win a discount coupon of $%.2f",discountcount12);
			System.out.print("(12% of your purchase)");
		}
			else if(price>210)
		{
			System.out.printf("You win a discount coupon of $%.2f",discountcount14);
			System.out.print(" (14% of your purchase) ");
		}
		else 
		{
			exit(0);
		}

{ 
	
}
	}

	private static void exit(int i) {
		// TODO Auto-generated method stub
		
	}

}
