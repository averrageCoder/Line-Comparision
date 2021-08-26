package comm.bridgelabz.linecomparision;

public class LineComparision {
	
	public static void main(String[] args) {
		
		Line line1 = new Line(0,2,2,4);
		Line line2 = new Line(0,-1,-5,0);
		
		LineComparatorIF lineComparator = new LineComparatorImp();
		
		lineComparator.CompareLines(line1, line2);
		
	}

}
