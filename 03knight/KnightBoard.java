public class KnightBoard{
    private int[][] board;
    public KnightBoard(int n){
	board = new int[n + 4][n +4];
	for(int i = 0; i < board.length; i++){
	    for(int k = 0; k < 2; k ++){
		board[i][k] = -1;
	    }
	    for(int k = n + 2 ; k < board.length; k ++){
		board[i][k] = -1;
	    }
	    for(int k = 0; k < board.length && i < 2; k ++){
		board[i][k] = -1;
	    }
	    for(int k = 0; k < board.length && i >= n + 2; k ++){
		board[i][k] = -1;
	    }
	}
    }

    public KnightBoard(int n, int w){
	board = new int[n +4][w + 4];
	for(int i = 0; i < board.length; i++){
	    for(int k = 0; k < 2; k ++){
		board[i][k] = -1;
	    }
	     for(int k = w + 2 ; k < board[i].length; k ++){
		board[i][k] = -1;
	    }
	     for(int k = 0; k < w + 4 && i < 2; k ++){
		board[i][k] = -1;
	    }
	     for(int k = 0; k < w + 4 && i >= n + 2; k ++){
		board[i][k] = -1;
		}
	}
        
    }


    public String name(){
	return "Morgan,Jackson";
    }

    public boolean solveH(int row, int col, int num){
	if(num > (board.length - 4) * (board[0].length - 4)){
	    return true;
	}
	else{
	    if(move(0,row,col, num)){
		if (solveH(row + 2, col -1, num ++) == true){
		    return true;
		}
		remove(0,row,col,num);
		    }
	     if(move(1,row,col, num)){
		if (solveH(row + 2, col +1, num ++) == true){
		    return true;
		}
		remove(1,row,col,num);
		    }
	     if(move(2,row,col, num)){
		if (solveH(row - 1, col +2, num ++) == true){
		    return true;
		}
		remove(2,row,col,num);
		    }
	     if(move(3,row,col, num)){
		if (solveH(row + 1, col + 2, num ++) == true){
		    return true;
		}
		remove(3,row,col,num);
		    }
	      if(move(4,row,col, num)){
		if (solveH(row - 2, col + 1, num ++) == true){
		    return true;
		}
		remove(4,row,col,num);
		    }
	      if(move(5,row,col, num)){
		if (solveH(row - 2, col -1, num ++) == true){
		    return true;
		}
		remove(5,row,col,num);
		    }
	      if(move(6,row,col, num)){
		if (solveH(row -1, col -2, num ++) == true){
		    return true;
		}
		remove(6,row,col,num);
		    }
	      if(move(7,row,col, num)){
		if (solveH(row + 1, col -2, num ++) == true){
		    return true;
		}
		remove(7,row,col,num);
		    }
	      
	}
	return false;
    }

    public boolean solve(){
	return solveH(2,2,1); 
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
	if(dir == -1){
	    if(board[row][col] == 0){
		board[row][col] = num;
		return true;
	    }
	}
	return false;
    }



    public boolean remove(int dir, int row, int col, int num){
	if(dir == 0){
	    if(board[row + 2][col -1] > 0){
		board[row + 2][col -1] = 0;
		return true;
	    }
	}
	if(dir == 1){
	    if(board[row + 2][col +1] > 0){
		board[row + 2][col +1] = 0;
		return true;
	    }
	}
	if(dir == 2){
	    if(board[row - 1][col + 2] > 0){
		board[row -1][col + 2] = 0;
		return true;
	    }
	}
	if(dir == 3){
	    if(board[row + 1][col + 2] > 0){
		board[row + 1][col + 2] = 0;
		return true;
	    }
	}
	if(dir == 4){
	    if(board[row -2][col +1] > 0){
		board[row -2][col +1] = 0;
		return true;
	    }
	}
	if(dir == 5){
	    if(board[row - 2][col -1] > 0){
		board[row - 2][col -1] = 0;
		return true;
	    }
	}
	if(dir == 6){
	    if(board[row -1][col - 2] > 0){
		board[row -1][col - 2] = 0;
		return true;
	    }
	}
	if(dir == 7){
	    if(board[row + 1][col - 2] > 0){
		board[row + 1][col - 2] = 0;
		return true;
	    }
	}
	if(dir == -1){
	    if(board[row][col] > 0){
		board[row][col] = 0;
		return true;
	    }
	}
	return false;
    }
    

    public static void main(String[]args){
	KnightBoard k = new KnightBoard(7,7);
	//System.out.println(k.move(7,4,4,1));
	k.printSolution();
	System.out.println(k.solve());
	k.printSolution();
    }
	
}
