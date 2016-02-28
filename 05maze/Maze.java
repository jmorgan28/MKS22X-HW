import java.util.*;
import java.io.*;

public class Maze{


    private char[][]maze;
    private int startx,starty;
    private boolean animate;

    /*Constructor loads a maze text file.
      1. The file contains a rectangular ascii maze, made with the following 4 characters:
      '#' - locations that cannot be moved onto
      ' ' - locations that can be moved onto
      'E' - the location of the goal (only 1 per file)
      'S' - the location of the start(only 1 per file)

      2. The maze has a border of '#' around the edges. So you don't have to check for out of bounds!

      3. When the file is not found, print an error and exit the program.
    */
    public Maze(String filename, boolean ani){
        animate = ani;
	try{Scanner in = new Scanner(new File(filename));
	    String s = "";
	    int i = 0;
	    while(in.hasNextLine()){
		s += in.nextLine();
		i ++;
	    }
	    //System.out.println(s);
	    Scanner f = new Scanner(new File(filename));
            String w = f.nextLine();
	    int num = 0;
	    // System.out.println(i);
	    //System.out.println(w.length());
	    maze = new char[i][w.length()];
	    for(int r  = 0; r < i; r ++){
		for(int c = 0; c < w.length() ; c ++){
		     maze[r][c] = s.charAt(num);
		     num ++;


		   
		}
	    }
	    startx = -1;
	    starty = -1;
	    for(int n  = 0; n < maze.length; n ++){
		for(int m = 0; m < maze[n].length ; m ++){
		    if(maze[n][m] == 'S'){
			startx = n;
			starty= m;
		    }
		}
	    }
	    //System.out.println(startx);
	    //System.out.println(starty);
	    
	    }
	

	catch(FileNotFoundException e){
	    System.out.println("file not found");}
	 
	
	    
     }


    /*Main Solve Function

      Things to note:
       When no S is contained in maze, print an error and return false.
    */
    public boolean solve(){
        if(startx < 0){
            System.out.println("No starting point 'S' found in maze.");
            return false;
        }else{
            maze[startx][starty] = '@';
            return solve(startx,starty);
        }
    }

    /*
      Recursive Solve function:

      A solved maze has a path marked with '@' from S to E.
      The S is replaced with '@' but the 'E' is not.

      Postcondition:
        Returns true when the maze is solved,
        Returns false when the maze has no solution.

        All visited spots that were not part of the solution are changed to '.'
        All visited spots that are part of the solution are changed to '@'

    */
    private boolean solve(int x, int y){
        if(animate){
            System.out.println(this);
            wait(20);
        }

        if(maze[x][y] == 'E'){
	    return true;
	}
	int count = 0;
	if(maze[x + 1][y] == '.' || maze[x +1][y] == '#'){
	    count ++;
	}
	if(maze[x][y + 1] == '.' || maze[x][y + 1] == '#'){
	    count ++;
	}
	if(maze[x  - 1][y] == '.'|| maze[x  - 1][y] == '#'){
	    count ++;
	}
	 if(maze[x][y - 1] == '.'|| maze[x][y - 1] == '#'){
	     count ++;
	}
	 //if(count >= 3){
	 //  maze[x][y] = '.';
	 //  return false;
	 //}
 	else{
	    if( move(0,x,y)){
		    if(solve(x + 1, y)){
			return true;
		    }
		    else{
			remove(0,x,y);
		    }
		}
	    if (move(1,x,y)){
		    if(solve(x, y +1 )){
			return true;
		    }
		    else{
			remove(1,x,y);
		    }
		}
	    if (move(2,x,y)){
		    if(solve(x - 1, y)){
			return true;
		    }
		    else{
			remove(2,x,y);
		    }
		}
	    if (move(3,x,y)){
		    if(solve(x, y - 1)){
			return true;
		    }
		    else{
			remove(3,x,y);
		    }
		}

	   //so it compiles
    }
	return false;
    }



    public boolean move(int i, int x, int y){
	if(i == 0){
	    if(maze[x + 1][y] != '.' && maze[x +1][y] != '#'){
		maze[x + 1][y] = '@';
		return true;
	    }
	}
	if(i == 1){
	    if(maze[x][y + 1] != '.' && maze[x][y + 1] != '#'){
		maze[x][y + 1] = '@';
		return true;
	    }
	}
	if(i == 2){
	    if(maze[x - 1][y] != '.' && maze[x - 1][y] != '#'){
		maze[x - 1][y] = '@';
		return true;
	    }
	}
	if(i == 3){
	    if(maze[x][y - 1] != '.' && maze[x][y -1] != '#'){
		maze[x][y -1] = '@';
		return true;
	    }
	}
	return false;
    }

     public boolean remove(int i, int x, int y){
	if(i == 0){
	    if(maze[x + 1][y] != '.' && maze[x +1][y] != '#'){
		maze[x + 1][y] = '.';
		return true;
	    }
	}
	if(i == 1){
	    if(maze[x][y + 1] != '.' && maze[x][y + 1] != '#'){
		maze[x][y + 1] = '.';
		return true;
	    }
	}
	if(i == 2){
	    if(maze[x - 1][y] != '.' && maze[x - 1][y] != '#'){
		maze[x - 1][y] = '.';
		return true;
	    }
	}
	if(i == 3){
	    if(maze[x][y - 1] != '.' && maze[x][y -1] != '#'){
		maze[x][y -1] = '.';
		return true;
	    }
	}
	return false;
    }
	    
	
    
    //FREE STUFF!!! *you should be aware of this*


    public void clearTerminal(){
        System.out.println(CLEAR_SCREEN);
    }


    public String toString(){
        int maxx = maze.length;
        int maxy = maze[0].length;
        String ans = "";

        if(animate){

            ans = "Solving a maze that is " + maxx + " by " + maxy + "\n";

        }
        for(int i = 0; i < maxx * maxy; i++){
            if(i % maxx == 0 && i != 0){
                ans += "\n";
            }
            char c =  maze[i % maxx][i / maxx];
            if(c == '#'){
                ans += color(38,47)+c;
            }else{
                ans += color(33,40)+c;
            }
        }
        return HIDE_CURSOR + go(0,0) + ans + "\n" + SHOW_CURSOR + color(37,40);
    }


    //MORE FREE STUFF!!! *you can ignore all of this*

    //Terminal keycodes to clear the terminal, or hide/show the cursor
    private static final String CLEAR_SCREEN =  "\033[2J";
    private static final String HIDE_CURSOR =  "\033[?25l";
    private static final String SHOW_CURSOR =  "\033[?25h";
    //terminal specific character to move the cursor
    private String go(int x,int y){
        return ("\033[" + x + ";" + y + "H");
    }

    private String color(int foreground,int background){
        return ("\033[0;" + foreground + ";" + background + "m");
    }

    private void wait(int millis){
        try {
            Thread.sleep(millis);
        }
        catch (InterruptedException e) {
        }
    }

    public void print(){
	for(int i = 0; i < maze.length; i++){
	    for(int k = 0; k < maze[i].length; k++){
		System.out.print(maze[i][k]);
	    }
	    System.out.println();
	}
    }

    public static void main(String[]args){
	Maze m = new Maze("data1.dat", false);
	System.out.println(m.solve());
	//m.print();
    }

    

    //END FREE STUFF



}
