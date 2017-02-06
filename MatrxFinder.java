//Elaina Chung
//APCS2 pd3
//HW02 -- I Am Still Searching
//2017-2-2
public class MatrixFinder
{
    public static boolean search(int[][] arr, int i)
    {
	int row = 0;
	int col = arr[0].length - 1;
	int num = arr[row][col];
	while( i != num ){
	    if(col < 0 || row > arr.length){
		return false;
	    }
	    else if(i > n){
		row += 1;
	    }
	    else if(i < n){
		col += 1;
	    }
	}
    }
    public static void main(Sting[] args)
    {
    }
}
