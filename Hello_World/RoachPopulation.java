
public class RoachPopulation {

double roaches;
double breedRoaches;
double sprayRoaches;
int period;
int percentage;


public RoachPopulation(int NumberOfRoaches)
{
	roaches=NumberOfRoaches;
	System.out.println(" The initial Roach Population is "+(int)roaches);
}
public void getRoaches()
{
	System.out.println("The Roach population after cycle " +period+ " of breeding is " +(int)breedRoaches);
	System.out.println("The Roach population after cycle " +period+ " at  "+percentage+ " percent spraying is "+(int)sprayRoaches);
	
}
public void spray(int death)
{
	percentage=death;
	roaches-=((roaches*(death*.01)));
	roaches=Math.round(roaches);
	sprayRoaches=roaches;
	}
public void breed()
{
	roaches*=2;
	breedRoaches=roaches;
	period++;
}















}
