import java.io.*;
import java.util.Scanner;
public class Silver{
    private int board[][];
    private int [] tline;
    private int [] bline;
    private int time;
    
    public Silver(){
	try{
	    Scanner in = new Scanner(new File("ctravel.in"));
	    Scanner f = new Scanner(in.nextLine());
	    tline = new int[3];
	    tline[0] = f.nextInt();
	    tline[1] = f.nextInt();
	    tline[2] = f.nextInt();
	    board = new int[tline[0]][tline[1]];
	    String s = "";
	    int no = 0;
	    while(in.hasNextLine() && no < tline[0]){
		s += in.nextLine();
		no ++;
	    }
	    //System.out.println(s);
	    int tracker = 0;
	    for(int i =0; i < board.length; i ++){
		for(int k =0; k < board[0].length; k ++){
		    if(s.charAt(tracker) == '*'){
			board[i][k] = -1;
		    }
		    else{board[i][k] = 0;}
		    tracker ++;
		}
		}
	    bline = new int[4];
	    bline[0] = in.nextInt();
	    bline[1] = in.nextInt();
	    bline[2] = in.nextInt();
	    bline[3] = in.nextInt();
	}
	catch(FileNotFoundException e){
	     System.out.println("wrong file name");
	}
    }

    public void printArray(){
	for(int i =0; i < board.length; i ++){
		for(int k =0; k < board[0].length; k ++){
		    if(board[i][k] < 10 && board[i][k] != -1){
			System.out.print(" ");
		    }
		    System.out.print(board[i][k]);
		}
		System.out.println();
	}
    }

    public void copyBoard(int [][]aboard, int [][] board){
	for(int i =0; i < board.length; i ++){
		for(int k =0; k < board[0].length; k ++){
		    aboard[i][k] = board[i][k];
		}
	}
	
    }

    public void solve(){
	int sx = bline[0]- 1;
	int sy = bline[1] -1;
	board[sx][sy] = 1;
	int [][] aboard = new int [board.length][board[0].length]; 
	copyBoard(aboard, board);
	for(int e = 1; e <= tline[2]; e ++){
	    for(int i =0; i < board.length; i ++){
		for(int k =0; k < board[0].length; k ++){
		    if(board[i][k] != -1){
			if(i != 0){
			    if(board[i - 1][k] != -1){
				aboard[i][k] += board[i - 1][k];
			    }
			}
			if(i != board.length -1){
			    if(board[i + 1][k] != -1){
				aboard[i][k] += board[i + 1][k];
			    }
			}
			if(k != 0){
			    if(board[i][k - 1] != -1){
				aboard[i][k] += board[i][k - 1];
			    }
			}
			if(k != board[0].length -1){
			    if(board[i][k + 1] != -1){
				aboard[i][k] += board[i][k + 1];
			    }
			}
		    }
		}
	    }
	    copyBoard(board,aboard);
	}
	System.out.println(board[bline[2]- 1][bline[3]- 1]);
    }
		    
	    





    public static void main(String[]args){
	Silver s = new Silver();
	s.printArray();
	//s.solve();
	//s.printArray();
    }
	    
	    
	    
	    
}
