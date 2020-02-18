import java.util.Scanner;

public class Cardecision2 {

	public static void main(String[] args) {
		
// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Please enter the Car information: ");
String carModelInfo=scan.nextLine();
System.out.println("Please enter the hybrid car information");
String hybModelInfo=scan.nextLine();
System.out.println("Please enter the miles traveled in a year");
double milesYear=scan.nextDouble();
System.out.println("Enter the cost per gallon ");
double costPerGallon=scan.nextDouble();

String carName=carModelInfo.substring(0,14);
String carCost=carModelInfo.substring(15,20);
String carMiles=carModelInfo.substring(21,23);
int carcost$=Integer.parseInt(carCost);
int carMiles$=Integer.parseInt(carMiles);
String hybcarName=hybModelInfo.substring(0,12);
String hybcarCost=hybModelInfo.substring(13,19);
String hybcarMiles=hybModelInfo.substring(20,22);
int hybCarcost$=Integer.parseInt(hybcarCost);
int hybcarMiles$=Integer.parseInt(hybcarMiles);
double hybYearly=costPerGallon*(milesYear/hybcarMiles$);
double carYearly=costPerGallon*(milesYear/carMiles$);
double year1=carcost$+carYearly*1;
double hyb1=hybCarcost$+hybYearly*1;
double year2=carcost$+carYearly*2;
double hyb2=hybCarcost$+hybYearly*2;
double year3=carcost$+carYearly*3;
double hyb3=hybCarcost$+hybYearly*3;
double year4=carcost$+carYearly*4;
double hyb4=hybCarcost$+hybYearly*4;
double year5=carcost$+carYearly*5;
double hyb5=hybCarcost$+hybYearly*5;
System.out.println("the cost to own "+carName+ "after one year is:"+year1+"and for " +hybcarName+ " it is"+hyb1);
System.out.println("the cost to own"+carName+"after two years is:"+year2+"and for"+hybcarName+"it is"+hyb2);	
System.out.println("the cost to own"+carName+"after three years is:"+year3+"and for"+hybcarName+"it is"+hyb3);
System.out.println("the cost to own"+carName+"after four years is:"+year4+"and for"+hybcarName+"it is"+hyb4);
System.out.println("the cost to own"+carName+"after five years is:"+year5+"and for"+hybcarName+"it is"+hyb5);
	
if(year5<hyb5)
	{System.out.print("The regular car pays itself back after 5 years");}
else if (year5==hyb5)
{ System.out.print("the prices are the same");}
else
{System.out.print("The hybrid car pays itself back after 5 years");}
	
	}}

	


