import java.util.*;
import java.io.*;

public class BetterMaze{
    private class Node{
	int row,col;
	Node previous;

	public Node(int r, int c, Node prev){
	    row = r;
	    col = c;
	    previous = prev;
	}

	public Node getPrev(){
	    return previous;
	}

	public int getRow(){
	    return row;
	}
	public int getCol(){
	    return col;
	}

    }

    private char[][] maze;
    private int[]    solution;
    private int      startRow,startCol;
    private Frontier<Node> placesToGo;
    private boolean  animate;//default to false
    private Node store;

   /**return a COPY of solution.
     *This should be : [x1,y1,x2,y2,x3,y3...]
     *the coordinates of the solution from start to end.
     *Precondition : one of the solveXXX methods has already been 
     * called (solveBFS OR solveDFS OR solveAStar)
     *(otherwise an empty array is returned)
     *Postcondition:  the correct solution is in the returned array
    **/
    public int[] solutionCoordinates(){
        /** IMPLEMENT THIS **/      
	return new int[1];
    }    


    /**initialize the frontier as a queue and call solve
    **/
    public boolean solveBFS(){  
        placesToGo = new FrontierQueue();       
	return solve();
    }   


   /**initialize the frontier as a stack and call solve
    */ 
    public boolean solveDFS(){  
        placesToGo = new FrontierStack(); 
	return solve();
    }    

   /**Search for the end of the maze using the frontier. 
      Keep going until you find a solution or run out of elements on the frontier.  DO ANIMATE
    **/
    private boolean solve(){
	placesToGo.add(new Node(startRow,startCol, null));
	maze[startRow][startCol] = '.';
	while(placesToGo.hasNext()){
	    Node n = placesToGo.next();
	    if(maze[n.getRow() + 1][n.getCol()] == (' ')){
		placesToGo.add(new Node(n.getRow() + 1, n.getCol(), n));
		maze[n.getRow() + 1][n.getCol()] = '.';
	    }
	    if(maze[n.getRow()][n.getCol() + 1] == (' ')){
		placesToGo.add(new Node(n.getRow(), n.getCol() + 1, n));
		maze[n.getRow()][n.getCol() + 1] = '.';
	    }
	    if(maze[n.getRow() - 1][n.getCol()] == (' ')){
		placesToGo.add(new Node(n.getRow() - 1, n.getCol(), n));
		maze[n.getRow() - 1][n.getCol()] = '.';
	    }
	    if(maze[n.getRow()][n.getCol() -1] == (' ')){
		placesToGo.add(new Node(n.getRow(), n.getCol() -1, n));
		store = new Node(n.getRow() + 1, n.getCol(), n);
		maze[n.getRow()][n.getCol() - 1] = '.';
	    }
	    
	    if(maze[n.getRow() + 1][n.getCol()] == ('E')){
		store = new Node(n.getRow() + 1, n.getCol(), n);
		maze[n.getRow() + 1][n.getCol()] = '.';
		return true; 
	    }
	    if(maze[n.getRow()][n.getCol() + 1] == ('E')){
		store = new Node(n.getRow(), n.getCol() + 1, n);
		maze[n.getRow()][n.getCol() + 1] = '.';
		return true; 
	    }
	    if(maze[n.getRow() - 1][n.getCol()] == ('E')){
		store = new Node(n.getRow() - 1, n.getCol(), n);
		maze[n.getRow() - 1][n.getCol()] = '.';
		return true; 
	    }
	    if(maze[n.getRow()][n.getCol() -1] == ('E')){
		store = new Node(n.getRow(), n.getCol() - 1, n);
		maze[n.getRow()][n.getCol() - 1] = '.';
		return true; 
	    }	    


	}
		
	return false;
    }    
     
   /**mutator for the animate variable  **/
    public void setAnimate(boolean b){ animate = b;}    


    public BetterMaze(String filename){
	animate = false;
	int maxc = 0;
	int maxr = 0;
	startRow = -1;
	startCol = -1;
	//read the whole maze into a single string first
	String ans = "";
	try{
	    Scanner in = new Scanner(new File(filename));

	    //keep reading next line
	    while(in.hasNext()){
		String line = in.nextLine();
		if(maxr == 0){
		    //calculate width of the maze
		    maxc = line.length();
		}
		//every new line add 1 to the height of the maze
		maxr++;
		ans += line;
	    }
	}
	catch(Exception e){
	    System.out.println("File: " + filename + " could not be opened.");
	    e.printStackTrace();
	    System.exit(0);
	}
	System.out.println(maxr+" "+maxc);
	maze = new char[maxr][maxc];
	for(int i = 0; i < ans.length(); i++){
	    char c = ans.charAt(i);
	    maze[i / maxc][i % maxc] = c;
	    if(c == 'S'){
		startCol = i % maxc;
		startRow = i / maxc;
	    }
	}
    }







    private static final String CLEAR_SCREEN =  "\033[2J";
    private static final String HIDE_CURSOR =  "\033[?25l";
    private static final String SHOW_CURSOR =  "\033[?25h";
    private String go(int x,int y){
	return ("\033[" + x + ";" + y + "H");
    }
    private String color(int foreground,int background){
	return ("\033[0;" + foreground + ";" + background + "m");
    }

    public void clearTerminal(){
	System.out.println(CLEAR_SCREEN);
    }

    public void wait(int millis){
	try {
	    Thread.sleep(millis);
	}
	catch (InterruptedException e) {
	}
    }


    public String toString(){
	int maxr = maze.length;
	int maxc = maze[0].length;
	String ans = "";
	if(animate){
	    ans = "Solving a maze that is " + maxr + " by " + maxc + "\n";
	}
	for(int i = 0; i < maxc * maxr; i++){
	    if(i % maxc == 0 && i != 0){
		ans += color(37,40) + "\n";
	    }
	    char c =  maze[i / maxc][i % maxc];
	    if(c == '#'){
		ans += color(38,47)+c;
	    }else{
		ans += color(33,40)+c;
	    }
	}
	//nice animation string
	if(animate){
	    return HIDE_CURSOR + go(0,0) + ans + color(37,40) +"\n"+ SHOW_CURSOR + color(37,40);
	}else{
	    return ans + color(37,40) + "\n";
	}
    } 
    


       
    
    

}
