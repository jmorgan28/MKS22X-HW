import java.io.*;
import java.util.Scanner;
public class Bronze{
    private int board[][];
    private int []  qwerty;
    private int[][] asd;
    

    public Bronze(){
	qwerty = new int[4];
	getVar();
	
    }

    public void getVar(){
	try{
	    
	    Scanner in = new Scanner(new File("makelake.txt"));
	    Scanner f = new Scanner(in.nextLine());
	    int l =0;
	    while(f.hasNextInt()){
		qwerty[l] = f.nextInt();
		l ++;}
	    board = new int[qwerty[0]][qwerty[1]];
	    for(int i =0; i < qwerty[0]; i ++){
		for(int k =0; k < qwerty[1]; k ++){
		    board[i][k] = in.nextInt();
		}
		}
	    asd = new int[qwerty[3]][3];
	    for(int r =0; r < asd.length; r ++){
		for(int c =0; c < asd[r].length; c ++){
		    asd[r][c] = in.nextInt();
		}
	    }   
		    
	}
	catch(FileNotFoundException e){
	     System.out.println("wrong file name");
	}
    }

    public void setup(){
	for(int i = 0; i < asd.length; i ++){
	    manipulate(asd[i][0],asd[i][1],asd[i][2]);
	}
    }

    public void manipulate(int r, int c, int a){
	int ra = r -1;
	int ca = c - 1;
	int max = 0;
	    for(int i = ra; i < r + 2; i++){
		for(int k = ca; k < c + 2; k ++){
		     if(board[i][k] > max){
			max = board[i][k];
		    }
		}
	    }
	while(a > 0){
	    for(int i = ra; i < r + 2; i++){
		for(int k = ca; k < c + 2; k ++){
		    if(board[i][k] == max){
			board[i][k] --;
		    }
		}
	    }
	    a --;
	    max --;
	}
	
    }

    public int depth(){
	int sum = 0;
	for(int i = 0; i < board.length; i++){
	    for(int k = 0; k < board[i].length; k ++){
		if(board[i][k] < qwerty[2]){
		    sum += qwerty[2] - board[i][k];
		}
	    }
	}
	return sum;
    }
		
	    
    public int calculate(){
	setup();
	return depth() * 72 * 72;
    }

    public void solved(){
	System.out.println(calculate() + ",7,Morgan,Jackson");
    }

    
    public void printBoard(){
	for(int i =0; i < board.length; i ++){
	    for(int k =0; k < board[i].length; k ++){
		System.out.print(board[i][k] + " ");
	    }
	    System.out.println();
	}
    }

    public static void main(String[]args){
	Bronze w = new Bronze();
	w.solved();
    }
	

}
