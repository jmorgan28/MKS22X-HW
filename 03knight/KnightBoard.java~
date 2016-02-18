public class KnightBoard{
    private int[][] board;
    public KnightBoard(int n){
	board = new int[n + 2][n +2];
	for(int i = 0; i < board.length; i++){
	    for(int k = 0; k < 2; k ++){
		board[i][k] = -1;
	    }
	    for(int k = n ; k < board.length; k ++){
		board[i][k] = -1;
	    }
	    for(int k = 0; k < board.length && i < 2; k ++){
		board[i][k] = -1;
	    }
	    for(int k = 0; k < board.length && i >= n; k ++){
		board[i][k] = -1;
	    }
	}

    }

    public boolean solveH(){
	return false;
    }

    public boolean solve(){
	return false;
    }

    public void printSolution(){
	for(int i = 0; i < board.length; i++){
	    for(int k = 0; k < board[i].length; k ++){
		System.out.print(board[i][k]);
	    }
	    System.out.println();
	}

    }


    public static void main(String[]args){
	KnightBoard k = new KnightBoard(6);
	k.printSolution();
    }
	
}
