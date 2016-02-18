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

    public boolean move(int dir, int row, int col, int num){
	if(dir == 0){
	    if(board[row + 2][col -1] == 0){
		board[row + 2][col -1] = num;
		return true;
	    }
	}
	if(dir == 1){
	    if(board[row + 2][col +1] == 0){
		board[row + 2][col +1] = num;
		return true;
	    }
	}
	if(dir == 2){
	    if(board[row - 1][col + 2] == 0){
		board[row -1][col + 2] = num;
		return true;
	    }
	}
	if(dir == 3){
	    if(board[row + 1][col + 2] == 0){
		board[row + 1][col + 2] = num;
		return true;
	    }
	}
	if(dir == 4){
	    if(board[row -2][col +1] == 0){
		board[row -2][col +1] = num;
		return true;
	    }
	}
	if(dir == 5){
	    if(board[row - 2][col -1] == 0){
		board[row - 2][col -1] = num;
		return true;
	    }
	}
	if(dir == 6){
	    if(board[row -1][col - 2] == 0){
		board[row -1][col - 2] = num;
		return true;
	    }
	}
	if(dir == 7){
	    if(board[row + 1][col - 2] == 0){
		board[row + 1][col - 2] = num;
		return true;
	    }
	}
	return false;
    }



    public boolean remove(int dir, int row, int col, int num){
	if(dir == 0){
	    if(board[row + 2][col -1] == 0){
		board[row + 2][col -1] = 0;
		return true;
	    }
	}
	if(dir == 1){
	    if(board[row + 2][col +1] == 0){
		board[row + 2][col +1] = 0;
		return true;
	    }
	}
	if(dir == 2){
	    if(board[row - 1][col + 2] == 0){
		board[row -1][col + 2] = 0;
		return true;
	    }
	}
	if(dir == 3){
	    if(board[row + 1][col + 2] == 0){
		board[row + 1][col + 2] = 0;
		return true;
	    }
	}
	if(dir == 4){
	    if(board[row -2][col +1] == 0){
		board[row -2][col +1] = 0;
		return true;
	    }
	}
	if(dir == 5){
	    if(board[row - 2][col -1] == 0){
		board[row - 2][col -1] = 0;
		return true;
	    }
	}
	if(dir == 6){
	    if(board[row -1][col - 2] == 0){
		board[row -1][col - 2] = 0;
		return true;
	    }
	}
	if(dir == 7){
	    if(board[row + 1][col - 2] == 0){
		board[row + 1][col - 2] = 0;
		return true;
	    }
	}
	return false;
    }


    public static void main(String[]args){
	KnightBoard k = new KnightBoard(6);
	k.printSolution();
    }
	
}
