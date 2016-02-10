public class Board{
    private int [][] board;
    public board(int n){
	board = new int[n][n];
    }

     public String name(){
	return "Morgan,Jackson";
    }

    public void printBoard(){
	String s = ""
	for(int i = 0; i < board.length; i++){
	    s += "\n" 
	    for(int k = 0; k < board[i].length; k ++){
		s += board[i][k];
	    }
	}
	System.out.println(s);
    }



    public static void main(String[]args){
	Board f = new Board(6);
	System.out.println(f.name());
	f.printBoard();
    }
       
}
