package comm.bridgelabz.linecomparision;

public class Line {

	private Point startPoint;
	private Point endPoint;
	
	public Line(int startXCoordinate, int endXCoordinate,int startYCoordinate, int endYCoordinate) {
		
		startPoint=new Point(startXCoordinate, startYCoordinate);
		endPoint=new Point(endXCoordinate,endYCoordinate);
	}
	
	public Double calculateLength() {
		Double length;
		length=Math.sqrt(Math.pow((this.endPoint.getXCoordinate()-this.startPoint.getXCoordinate()),2)+ Math.pow((this.endPoint.getYCoordinate()-this.startPoint.getYCoordinate()),2));
		return length;
	}
}
