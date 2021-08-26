package comm.bridgelabz.linecomparision;

public class LineComparatorImp implements LineComparatorIF{

	@Override
	public void CompareLines(Line line1, Line line2) {
		
		Double length1, length2;
		length1 = line1.calculateLength();
		length2 = line2.calculateLength();
		
		int result = length1.compareTo(length2);
		if(result==0)
			System.out.println("Both the lines are equal!");
		else if(result>0)
			System.out.println("Line 1 is greater than Line 2!");
		else
			System.out.println("Line 2 is greater than Line 1!");	
		
	}

}
