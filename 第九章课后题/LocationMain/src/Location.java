import java.util.Arrays;
public class Location {
	static int row;
	static int column;
	static double maxValue;
	public Location(int row,int column,double maxValue){
		this.row =row ;
		this.column = column;
		this.maxValue = maxValue;
	}
	public void setRow(int row){
		this.row = row;
	}
	public void setColumn(int column){
		this.column = column;
	}
	public int getRow(){
		return row;
	}
	public int getColumn(){
		return column;
	}
	
	public static Location locateLargest(double [][] a){
		maxValue = a[0][0];
		for ( int i = 0; i < a.length; i++){
			for (int j = 0; j < a[i].length; j++){
				if (a[i][j] > maxValue){
					maxValue = a[i][j];
					row = i;
					column = j;
				}
			}
		}
		return new Location(row,column,maxValue);
	}
}
