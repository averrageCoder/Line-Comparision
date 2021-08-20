package comm.bridgelabz.linecomparision;

public class LineComparision {
	
	public static Double calculate_length(double x1, double x2, double y1, double y2)
	{
		Double length;
		
		length=Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1),2));
		
		return length;
	}

	public static void main(String[] args) {
		
		double x1=0,x2=2,y1=2,y2=4;
		
		double p1=0,p2=-1,q1=-5,q2=0;
		
		Double length1, length2;
		length1 = calculate_length(x1, x2, y1, y2);
		length2 = calculate_length(p1, p2, q1, q2);
		
		if(length1.equals(length2))
			System.out.println("Both the lines are equal!");
		else
			System.out.println("Both the lines are NOT equal!");
		
	}

}
