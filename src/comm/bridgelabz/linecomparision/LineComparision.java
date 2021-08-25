package comm.bridgelabz.linecomparision;

public class LineComparision {
	
	public static class Line {
		double x1,x2,y1,y2;
		public Line(double i, double j, double k,double l) {
			x1=i;
			x2=j;
			y1=k;
			y2=l;
		}
	}
	
	public static Double calculate_length(double x1, double x2, double y1, double y2)
	{
		Double length;
		length=Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1),2));
		return length;
	}

	public static void main(String[] args) {
		
		Line line1 = new Line(0,2,2,4);
		Line line2 = new Line(0,-1,-5,0);

		Double length1, length2;
		length1 = calculate_length(line1.x1, line1.x2, line1.y1, line1.y2);
		length2 = calculate_length(line2.x1, line2.x2, line2.y1, line2.y2);
		
		int result = length1.compareTo(length2);
		
		if(result==0)
			System.out.println("Both the lines are equal!");
		else if(result>0)
			System.out.println("Line 1 is greater than Line 2!");
		else
			System.out.println("Line 2 is greater than Line 1!");	
	}

}
