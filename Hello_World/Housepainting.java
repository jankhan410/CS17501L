import java.util.Scanner;
public class Housepainting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan= new Scanner(System.in);
System.out.println("Enter the length of the house:");
int houseLength=scan.nextInt();
System.out.println("Enter the width of the house:");
int houseWidth=scan.nextInt();
System.out.println("Enter the Height of the house:  ");
int houseHeight=scan.nextInt();
System.out.println("Enter the Number of Windows:  ");
int numWindow=scan.nextInt();
System.out.println("Enter the length of the Windows:  ");
int lengthWindow=scan.nextInt();
System.out.println("Enter the width of the Windows:  ");
int widthWindow=scan.nextInt();
System.out.println("Enter the Number of Doors: ");
int numDoor=scan.nextInt();
System.out.println("Enter the length of the Doors:  ");
int lengthDoor=scan.nextInt();
System.out.println("Enter the Width of the Doors: ");
int widthDoor=scan.nextInt();
System.out.println("Enter the cost per square feet from the painter:  ");
int costPerSqFt=scan.nextInt();
double peakSide=(houseLength*houseWidth+0.5*(houseLength*(houseHeight-houseWidth)))*2;
System.out.println(" The Square feet for the peakside is: ");
System.out.println(peakSide);
double normSqFT=((houseLength*houseWidth)*2);
System.out.println("The Square feet for the normal sides is:  ");
System.out.println(normSqFT);
double totalSqFT=(peakSide+normSqFT);
System.out.println("The total Square feet is:  ");
System.out.println(totalSqFT);
double totalCost=(totalSqFT*5);
System.out.println("The total cost is: ");
System.out.println(totalCost);










	}

}
