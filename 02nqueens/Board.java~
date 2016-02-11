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

    public boolean addQueen(int n, int k){
	if(board[n][k] != 0){
	    return false;
	}
	board[n][k] = 1;
	for(int i = 1; i < board[n].length - k ; i ++){
	    board[n][k + i] --;
	}
	//for(int i = 1; k - i >= 0 ; i ++){
	//  board[n][k - i] --;
	//} 

	for(int i = 0; i + n < board.length - 1 && k + i < board.length -1; i ++){
	    board[n + i + 1][k + i + 1] -- ;
	}
	for(int i = 1;  n - i >= 0 && k + i < board.length; i ++){
	    board[n - i ][k + i] -- ;
	}

	/*for(int i = 0; n - i > 0 && k - i > 0 ; i ++){
	  board[n - i - 1][k - i -1] -- ;
		}
	for(int i = 1;  i + n < board.length && k - i >= 0; i ++){
	  board[n + i ][k - i] -- ;
	  }*/
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
	//for(int i = 1; k - i >= 0 ; i ++){
	//  board[n][k - i] ++;
	//	} 

	for(int i = 0; i + n < board.length - 1 && k + i < board.length -1; i ++){
	    board[n + i + 1][k + i + 1] ++ ;
	}
	for(int i = 1;  n - i >= 0 && k + i < board.length; i ++){
	    board[n - i ][k + i] ++ ;
	}

	/*for(int i = 0; n - i > 0 && k - i > 0 ; i ++){
	  board[n - i - 1][k - i -1] ++ ;
		}
	for(int i = 1;  i + n < board.length && k - i >= 0; i ++){
	  board[n + i ][k - i] ++ ;
	  }*/
	return true;
    }

    /*public boolean helper(int col){
	int k = 0;
        for(int i = 0; i < board.length; i ++;){
	    for(int f = 0; f < board.length; f++;){
		    if(board[i][f] == 1){
			k ++;
		    }
		}
	}
	if(k == board.length){
	    return true;
	}
	if(col > board.length){
	    return false;
	}
	else {
	   
			}

	    
		  
       
 
    }

    public boolean solve(){
	return helper(0);
    }
    */
	    
	
	



    public static void main(String[]args){
	Board f = new Board(6);
	System.out.println(f.name());
	f.addQueen(2, 3);
	//f.removeQueen(2, 3);
	f.printBoard();
    }
       
}
