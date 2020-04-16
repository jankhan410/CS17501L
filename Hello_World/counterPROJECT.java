package javaproject;


public class counterPROJECT {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Counter venue= new Counter();
for(int counter=0;counter<=10;counter++) 
{
	venue.click();
}
	for(int counter=5;counter>=0;counter--) 
	{
		venue.unclick();
		

	
	}
	int rValue=venue.getValue();
	System.out.println("Expected:5");
	System.out.println("Actual="+rValue);

	venue.reset();
	
	for(int counter=0;counter<=3;counter++) 
	{
		venue.click();
		

	}
	
	for(int counter=4;counter>=0;counter--) 
	{
		venue.unclick();
	}
	rValue=venue.getValue();
	System.out.println("Expected=-1");
	System.out.println("Actual="+rValue);
	}}
	


