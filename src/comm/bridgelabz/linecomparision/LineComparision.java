package comm.bridgelabz.linecomparision;

public class LineComparision {

	public static void main(String[] args) {
		
		double x1=0,x2=2,y1=2,y2=4;
		double length;
		
		length=Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1),2));
		
		System.out.println("Length of line :"+ length);
		
	}

}
