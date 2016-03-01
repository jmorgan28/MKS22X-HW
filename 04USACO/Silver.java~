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
	    int tracker = 0;
	    for(int i =0; i < tline[0]; i ++){
		for(int k =0; k < tline[1]; k ++){
		    if(s.charAt(tracker) == '*'){
			board[i][k] = -1;
		    }
		    else{board[i][k] = 0;}
		    tracker ++;
		}
	    }
	    bline = new int[4];
	    tline[0] = in.nextInt();
	    tline[1] = in.nextInt();
	    tline[2] = in.nextInt();
	    tline[3] = in.nextInt();
	}
	catch(FileNotFoundException e){
	     System.out.println("wrong file name");
	}
    }





    public static void main(String[]args){
	Silver s = new Silver();
    }
	    
	    
	    
	    
}
