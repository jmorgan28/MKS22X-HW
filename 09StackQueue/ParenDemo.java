public class ParenDemo{
    
    public static boolean isMatching(String s){
	MyStack<Character> m = new MyStack<Character>();
	for(int i = 0; i < s.length(); i ++){
	    m.push(s.charAt(i));
	}

	return true;
	
    }
    

    public static void main(String[]args){
	String input = "()()(([[]]))";
	if(args.length > 0){
	    input = args[0];
	    System.out.println( isMatching(input)); 
	}else{
	    System.out.println("Usage:"); 
	    System.out.println("java ParenDemo \"text\""); 
	}
 
    }
}
