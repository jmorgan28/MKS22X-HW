public class ParenDemo{
    
    public static boolean isMatching(String s){
	MyStack<Character> m = new MyStack<Character>();
	MyStack<Character> f = new MyStack<Character>();
	for(int i = 0; i <  s.length(); i++){
	    if(s.charAt(i) == ('(')){
	    m.push(s.charAt(i));
		}
	    if(s.charAt(i) == ('[')){
		m.push(s.charAt(i));
	    }
	    if(s.charAt(i) == ('{')){
		m.push(s.charAt(i));
	    }

	    if(s.charAt(i) ==('<')){
		m.push(s.charAt(i));
	    }
	}
	for(int i = s.length() -1; i > 0; i--){
	    if(s.charAt(i) == (')')){
	    f.push(s.charAt(i));
		}
	    if(s.charAt(i) == (']')){
		f.push(s.charAt(i));
	    }
	    if(s.charAt(i) == ('}')){
		f.push(s.charAt(i));
	    }

	    if(s.charAt(i) ==('>')){
		f.push(s.charAt(i));
	    }
	}
	if(m.size() != f.size()){
	    return false;
	}
	int k = 0;
	while(k < m.size()){
	    if(m.peek() == '(' && f.peek() != ')'){
		return false;
	    }
	    else{
	    if(m.peek() == '{' && f.peek() != '}'){
		return false;
	    }else {
   
	    
	    if(m.peek() == '[' && f.peek() != ']'){
		return false;
	    }else{
	    
	    if(m.peek() == '<' && f.peek() != '>'){
		return false;
	    }}}}
	    m.pop();
	    f.pop();
	    k ++;
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
