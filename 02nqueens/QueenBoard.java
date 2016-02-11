public class QueenBoard{
    private int[][]board;

    
    public QueenBoard(int size){
	board = new int[size][size];
    }

    public String name(){
	return "Morgan,Jackson";
    }

    /**
     *precondition: board is filled with 0's only.
     *postcondition: 
     *-return false, and board is still filled
     *with 0's for a board that cannot be solved.
     *-return true, and board is filled with the 
     *final configuration of the board after adding 
     *all n queens.
     */
    public boolean solve()
    {
	return solveH(0);
    }

    /**
     *Helper method fr solve. 
     */
    private boolean solveH(int col){
	if(col == board.length){
	    for(int i = 0; i <board.length; i++){
		if(board[i][col] == 1){
		    return true;
		}
	    }
	    return false;
	}
 	if(col != board.length){
	    int f = 0;
	        for(int i = 0; i <board.length; i++){
		    if(board[i][col] < 0){
			    f ++;
			}
		    }
		if(f == board.length){
		    for(int r = 0; r < board.length; r++){
			for(int c = 0; c < board[0].length; c++){
			    removeQueen(r,c);
			}
		    }
		    return false;
		}
	}
	
	else{
	    for(int w = 0; w < board.length; w ++){
	    addQueen(w,col);
	}
	    return solveH(col) || solveH(col + 1);
	}
	return false;
    }

    public void printSolution(){
	String ans = "";
	for(int r = 0; r < board.length; r++){
	    for(int c = 0; c < board[0].length; c++){
		if(board[r][c] != 1){
		ans+= "_\t";
	    }
	    else{ ans += "Q\t";}
	    }
	    ans+="\n";
	}
	System.out.println( ans);
    }



    /********Do Not Edit Below This Line**********************************/

    private boolean addQueen(int row, int col){
	if(board[row][col] != 0){
	    return false;
	}
	board[row][col] = 1;
	int offset = 1;
	while(col+offset < board[row].length){
	    board[row][col+offset]--;
	    if(row - offset >= 0){
		board[row-offset][col+offset]--;
	    }
	    if(row + offset < board.length){
		board[row+offset][col+offset]--;
	    }
	    offset++;
	}
	return true;
    }

    private boolean removeQueen(int row, int col){
	if(board[row][col] != 1){
	    return false;
	}
	board[row][col] = 0;
	int offset = 1;
	while(col+offset < board[row].length){
	    board[row][col+offset]++;
	    if(row - offset >= 0){
		board[row-offset][col+offset]++;
	    }
	    if(row + offset < board.length){
		board[row+offset][col+offset]++;
	    }
	    offset++;
	}
	return true;
    }

    public String  toString(){
	String ans = "";
	for(int r = 0; r < board.length; r++){
	    for(int c = 0; c < board[0].length; c++){
		ans+= board[r][c]+"\t";
	    }
	    ans+="\n";
	}
	return ans;
    }
    
    public static void main(String[]args){
	QueenBoard b = new QueenBoard(4);
	// System.out.println(b);
	//b.addQueen(3,0);
	//b.addQueen(0,1);
        //System.out.println(b);
	//b.removeQueen(3,0);
        //System.out.println(b);
	//b.printSolution();
	System.out.println(b.solve());
    }
    
    
}
