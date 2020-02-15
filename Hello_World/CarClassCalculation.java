import java.util.Scanner;

public class CarClassCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan=new Scanner(System.in);
System.out.println("Enter cost of regular car:  ");
double carCost=scan.nextDouble();
System.out.println("Enter miles per gallon of regular car: ");
double mpgRegular=scan.nextDouble();
System.out.println("Enter the cost of the hybrid car: ");
double costHybrid=scan.nextDouble();
System.out.println("Enter miles per gallon of hybrid car: ");
double mpgHybrid=scan.nextDouble();
System.out.println("Enter the miles traveled in a year: ");
double milesTraveled=scan.nextDouble();
System.out.println("Enter the cost per gallon of gas:");
double costPerGallon=scan.nextDouble();
double regYearly=costPerGallon*(milesTraveled/carCost);
double hybYearly=costPerGallon*(milesTraveled/costHybrid);
double reg1Yr=carCost+milesTraveled*1;
double hyb1Yr=costHybrid+mpgHybrid*1;
double reg2Yrs=carCost+milesTraveled*2;
double hyb2Yrs=costHybrid+mpgHybrid*2;
double reg3Yrs=carCost+milesTraveled*3;
double hyb3Yrs=costHybrid+mpgHybrid*3;

double reg4Yrs=carCost+milesTraveled*4;
double hyb4Yrs=costHybrid+mpgHybrid*4;
double reg5Yrs=carCost+milesTraveled*5;
double hyb5Yrs=costHybrid+mpgHybrid*5;
System.out.println("The Cost to own after year 1 for regular car:"+reg1Yr+" for hybrid car:"+hyb1Yr);
System.out.println("The Cost to own after year 2 for regular car:"+reg2Yrs+" for hybrid car:"+hyb2Yrs);
System.out.println("The Cost to own after year 3 for regular car:"+reg3Yrs+" for hybrid car:"+hyb3Yrs);
System.out.println("The Cost to own after year 4 for regular car:"+reg4Yrs+" for hybrid car:"+hyb4Yrs);
System.out.println("The Cost to own after year 5 for regular car:"+reg5Yrs+" for hybrid car:"+hyb5Yrs);
if(reg5Yrs<hyb5Yrs) {
System.out.println("The regular car pays itself back after 5 years");
}
else {
System.out.println("The hybrid car pays itself back after 5 years");


}
	}
}



