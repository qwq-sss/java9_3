import java.util.Scanner;
public class TestLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number of rows and columns in the array: ");
		Scanner input = new Scanner(System.in);
		int row = input.nextInt();
		int column = input.nextInt();
		System.out.println("Enter the array:");
		double[][] a = new double[row][column];
		for (int i = 0 ; i < a.length; i++){
			for (int j = 0; j < a[i].length; j++){
				a[i][j] = input.nextDouble();
			}
		}
		Location p = Location.locateLargest(a);
		System.out.println("The location of the largest element is " + p.maxValue + " at " + "(" + p.row + ", " + p.column + ")");
	}

}
