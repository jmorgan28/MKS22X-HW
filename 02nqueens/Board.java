public class Board{
    private int [][] board;
    public Board(int n){
	board = new int[n][n];
    }

     public String name(){
	return "Morgan,Jackson";
    }

    public void printBoard(){
	String s = "";
	for(int i = 0; i < board.length; i++){
	    s += "\n"; 
	    for(int k = 0; k < board[i].length; k ++){
		s += board[i][k];
	    }
	}
	System.out.println(s);
    }

     public boolean solve()
    {
	return solveH(0);
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

    public void clear(){
	for(int r = 0; r < board.length; r++){
	    for(int c = 0; c < board[0].length; c++){
		board[r][c] = 0;
	    }
	}
    }
    
    private boolean solveH(int col){
	if(col >= board.length){
	    return true;}
        
	else{
	    for(int z = 0; z < board.length; z ++){
		if(addQueen(z,col)){
		    if(solveH(col + 1) == true){
			return true;
		    }
		    removeQueen(z,col);
		}
	    }
	}
	return false;
    }
		

    
    public boolean addQueen(int n, int k){
	if(board[n][k] != 0){
	    return false;
	}
	board[n][k] = 1;
	for(int i = 1; i < board[n].length - k ; i ++){
	    board[n][k + i] --;
	}
	

	for(int i = 0; i + n < board.length - 1 && k + i < board.length -1; i ++){
	    board[n + i + 1][k + i + 1] -- ;
	}
	for(int i = 1;  n - i >= 0 && k + i < board.length; i ++){
	    board[n - i ][k + i] -- ;
	}

	return true;
    }

    public boolean removeQueen(int n, int k){
	if(board[n][k] != 1){
	    return false;
	}
	board[n][k] = 0;
	for(int i = 1; i < board[n].length - k ; i ++){
	    board[n][k + i] ++;
	}

	for(int i = 0; i + n < board.length - 1 && k + i < board.length -1; i ++){
	    board[n + i + 1][k + i + 1] ++ ;
	}
	for(int i = 1;  n - i >= 0 && k + i < board.length; i ++){
	    board[n - i ][k + i] ++ ;
	}

	return true;
    }

   
       
}

