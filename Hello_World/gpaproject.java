import java.util.Scanner; 

public class gpaproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		double gradepoint=0;
		double credithour=0.0;
		double totalgp=0.0;
		for(boolean run=true; run!=false;) {
			System.out.println("Enter course information separated by commas (title, credit hours, letter grade) or type Q to quit:");
			String inform=in.nextLine();
			if (inform.contentEquals("Q"))
			{ 
		         run = false; 
			   break;
			 
			
			}
			
        String[] information1=inform.split(",");
		String course=information1[0];
		String credith=information1[1];
		double creditInteger=Double.parseDouble(credith);
		String finalgrade=information1[2];
	   
		if(finalgrade.contentEquals("A"))
	    	gradepoint=4.00;
	     else if(finalgrade.contentEquals("A-"))
	    	 gradepoint=3.70;
	    else if(finalgrade.contentEquals("B+"))
	    	gradepoint=3.33;
	    else if(finalgrade.contentEquals("B"))
	    	gradepoint=3.00;
	    else if(finalgrade.contentEquals("B-"))
	    	gradepoint=2.70;
	    else if(finalgrade.contentEquals("C+"))
	    	gradepoint=2.30;
	    else if(finalgrade.contentEquals("C"))
	    	gradepoint=2.00;
	    else if(finalgrade.contentEquals("C-"))
	    	gradepoint=1.70;
	    else if(finalgrade.contentEquals("D+"))
	    	gradepoint=1.30;
	    else if(finalgrade.contentEquals("D"))
	    	gradepoint=1.00;
	    else if(finalgrade.contentEquals("D-"))
	    	gradepoint=0.70;
	    else if(finalgrade.contentEquals("F"))
	    	gradepoint=0;
	    else if(finalgrade.contentEquals("WF"))
	    	gradepoint=0;
	    double gpr=(gradepoint*creditInteger);
	    credithour=credithour+creditInteger;
	    totalgp=totalgp+gpr;
	    System.out.println("Course      Credit Hours    Grade     Grade Points");
	    System.out.println(course+"     "+credith+"                 "+finalgrade+ "     "+gpr);
	    System.out.println();
	    double GPA=(totalgp/credithour);
	    System.out.println();
	 
	    System.out.println(credithour+   " Total Credit Hours   "+totalgp+" Total Grade Points");
	    		System.out.println("gpa="+totalgp+"/"+credithour+" =    "    );
	    		System.out.printf("%.2f",GPA);
}
}}
	    		
	    
	    
	    
	    
	    
	    		
	    		
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
	
	

		
		
	
	
		
	
		
		
			
	
				
		
		
		
	
	           
	        
	           
	                 		
	
	
	
	
		
		
		
	
		
		
		
		
		
				
		
		
		
	
				
		
		



	

