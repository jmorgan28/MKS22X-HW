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

    public void addQueen(int n, int k){
	board[n][k] = 1;
	for(int i = 1; i < board[n].length - k ; i ++){
	    board[n][k + i] --;
	}
	for(int i = 1; k - i >= 0 ; i ++){
	    board[n][k - i] --;
	} 

	for(int i = 0; i + n < board.length - 1 && k + i < board.length -1; i ++){
	    board[n + i + 1][k + i + 1] -- ;
	}
	for(int i = 1;  n - i >= 0 && k + i < board.length; i ++){
	    board[n - i ][k + i] -- ;
	}

	for(int i = 0; n - i > 0 && k - i > 0 ; i ++){
	  board[n - i - 1][k - i -1] -- ;
		}
	for(int i = 1;  i + n < board.length && k - i >= 0; i ++){
	  board[n + i ][k - i] -- ;
	}
	
    }

    public void removeQueen(int n, int k){
	board[n][k] = 0;
	for(int i = 1; i < board[n].length - k ; i ++){
	    board[n][k + i] ++;
	}
	for(int i = 1; k - i >= 0 ; i ++){
	    board[n][k - i] ++;
	} 

	for(int i = 0; i + n < board.length - 1 && k + i < board.length -1; i ++){
	    board[n + i + 1][k + i + 1] ++ ;
	}
	for(int i = 1;  n - i >= 0 && k + i < board.length; i ++){
	    board[n - i ][k + i] ++ ;
	}

	for(int i = 0; n - i > 0 && k - i > 0 ; i ++){
	  board[n - i - 1][k - i -1] ++ ;
		}
	for(int i = 1;  i + n < board.length && k - i >= 0; i ++){
	  board[n + i ][k - i] ++ ;
	}
	
    }
	    
	    
	
	



    public static void main(String[]args){
	Board f = new Board(6);
	System.out.println(f.name());
	f.addQueen(2, 3);
	f.removeQueen(2, 3);
	f.printBoard();
    }
       
}
