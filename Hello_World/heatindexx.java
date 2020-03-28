import java.util.Scanner;

public class heatindexx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner in=new Scanner(System.in);

System.out.println("                                 NOAA's Nation Weather Service");
System.out.println("                                       Heat Index");
System.out.println("Relative                              Temperature(F)");
System.out.println("Humidity(%)");
System.out.printf("    ");
for (int temperature=80; temperature<=110; temperature=temperature+2)
{
	System.out.printf("%6s ",temperature);
	
}
System.out.println();
System.out.println("____________________________________________________________________________________________________________________");
for (int humidity=40; humidity<=100; humidity=humidity+5)
{
	System.out.printf("%3s | ",humidity);
	for (int T=80;T<=110;T=T+2)
	
	
	{
	int total=(int)(-42.379+(2.04901523*T)+(10.14333127*humidity)-(0.22475541*T*humidity)-(.00683783*T*T)-(.05481717*humidity*humidity)+(.00122874*T*T*humidity)+( .00085282*T*humidity*humidity)-(.00000199*T*T*humidity*humidity));
	if (total<=137)
	{
		System.out.printf("%6s",total);
	}
	else 
	{
		System.out.printf("%6s"," ");
		
	}
	
	}
	System.out.println();
}

	
	
	boolean start=true;
	while(start==true)
	{
			
				System.out.print("Enter Temperature or 0 to end ");
				double user=in.nextDouble();
				if(user==0)
	
			
			
				{
				start=false;
				System.out.println("the program has ended");
				break;
				}
			System.out.print("Please enter the relative humidity:  ");
			double humidityuser=in.nextDouble();
			
			
			double total2=(int)(-42.379+(2.04901523*user)+(10.14333127*humidityuser)-(.22475541*user*humidityuser)-(.00683783*user*user)-(.05481717*humidityuser*humidityuser)+(.00122874*user*user*humidityuser)+( .00085282*user*humidityuser*humidityuser)-(.00000199*user*user*humidityuser*humidityuser));
			System.out.print("The THI for a temperatue of "+user+" and relative of "+humidityuser+" is:"+total2+"");
			if (total2<=90)
			{
			System.out.println("  ADVISORY: CAUTION");
			}
			else if (total2<105)
			{
				System.out.println("  ADVISORY: EXTREME CAUTION");
			}
			else if (total2<126)
			{
				System.out.println("  ADVISORY: DANGER");
			}
			
			else 
			{
				System.out.println("  ADVISORY: EXTREME DANGER");
			}
			
			
			
			
			
			
			
			
			
			}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


