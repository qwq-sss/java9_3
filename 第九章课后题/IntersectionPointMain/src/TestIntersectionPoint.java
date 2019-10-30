import java.util.Scanner;
public class TestIntersectionPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter x1,y1,x2,y2,x3,y3,x4,y4: ");
		Scanner input = new Scanner(System.in);
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();
		double a = y1 - y2;
		double b = -(x1-x2);
		double c = (y3 - y4);
		double d = -(x3 -x4);
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;
		LinearEquation p = new LinearEquation(a,b,c,d,e,f);
		System.out.println("The intersecting point is at " + "(" + (int)(p.getX() * 100000)/100000.0 + " " + (int)(p.getY()*100000)/100000.0 + ")");
	}

}
