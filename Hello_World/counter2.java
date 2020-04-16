package javaproject;

public class counter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Counter anotherVenue=new Counter()	;
int rValue=anotherVenue.getValue();
anotherVenue.clickMany(10);
rValue=anotherVenue.getValue();
System.out.println("Expected anotherVenue = 5 ");
anotherVenue.unclickMany(5);
rValue=anotherVenue.getValue();
System.out.println("Actual anotherVenue = " +rValue);
anotherVenue.reset();
anotherVenue.clickMany(3);
rValue=anotherVenue.getValue();
System.out.println("Expected anotherVenue = -1 ");
anotherVenue.unclickMany(4);
rValue=anotherVenue.getValue();
System.out.println("Actual anotherVenue = " +rValue);



	
	
	
	
	
	
	}

}
