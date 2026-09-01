package Lec_04;

public class Valid_Sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean isValidSudoku(char[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]!='.') {
					if(chekvalid(i,j,arr)==false) {
						return false;
					}					
				}
			}
		}
		return true;
	}

	private static boolean chekvalid(int r, int c, char[][] arr) {
		// TODO Auto-generated method stub
		char target=arr[r][c];
		for(int i=0;i<arr.length;i++) {
			if(i==r) {
				continue;
			}
			if(arr[i][c]==target) {
				return false;
			}
		}
		for(int i=0;i<arr[0].length;i++) {
			if(i==c) {
				continue;
			}
			if(arr[r][i]==target) {
				return false;
			}
		}
		
		int nr=(r/3)*3;
		int nc=(c/3)*3;
		
		for(int i=nr;i<nr+3;i++) {
			for(int j=nc;j<nc+3;j++) {
				if(i==r&&  j==c) {
					continue;
				}
				if(arr[i][j]==target) {
					return false;
				}
			}
		}
		return true;
	}

}
