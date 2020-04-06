
public class Counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Counter Venue=new Counter();
int rValue=Venue.getValue();
Venue.unclick();
Venue.unclick();
rValue=Venue.getValue();
{
   rValue = rValue + 10;
}

{
	   rValue = rValue-5;
}
System.out.println("Expected: 5");
System.out.println("Actual:" +rValue);

{
    rValue = 0;
 }
{
	rValue=rValue+3;
}
{
	rValue=rValue-4;
	
}
System.out.println("Expected: -1");
System.out.println("Actual:" +rValue);
	
	
	 
	   
	
	{
	
	}
	

	
}




	


	private void unclick() {
		// TODO Auto-generated method stub
		
	}
	private void click() {
		// TODO Auto-generated method stub
		
	}

	private int getValue() {
		// TODO Auto-generated method stub
		return 0;
		
	
	
	
	
	}

	
	
	
}
