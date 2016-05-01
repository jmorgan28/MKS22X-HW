public class BSTree<T extends Comparable<T>>{
    private class Node{
	T data;
	Node left;
	Node right;
	// set/get: data/left/right

	public void setData(T value){
	    data = value;
	}
	
	public T getData(){
	     return data;
	}

	 public void setLeft(Node n){
	    left = n;
	}
	
	public Node getLeft(){
	     return left;
	}

	public void setRight(Node n){
	    right = n;
	}
	
	public Node getRight(){
	     return right;
	}


	//real methods here
	public int height(){ 
	    return 0;
	}
	public void add(T value){
	    Node temp = this;
	    add(value, temp); 
		
	}
	public void add(T value, Node temp){
	    if(value.compareTo(temp.getData()) > 0){
		while(!(temp.getRight() == null || (temp.getRight().getData()).compareTo(value) > 0)){
		    add(value, temp.getRight());
		}
		Node rem = temp.getRight();
		Node n = new Node();
		n.setData(value);
		temp.setRight(n);
		n.setRight(rem);
	    }
	    if(value.compareTo(temp.getData()) < 0){
		while(!(temp.getLeft() == null || (temp.getLeft().getData()).compareTo(value) < 0)){
		    add(value, temp.getLeft());
		}
		Node rem = temp.getLeft();
		Node n = new Node();
		n.setData(value);
		temp.setLeft(n);
		n.setLeft(rem);
	    }
		
	}
	
	public String toString(){
	    String s = "" + data;
	    Node temp = this;
	    while(temp.getLeft() != null){
		temp = temp.getLeft();
		s += " " + temp.getData();
	    }
	    return s;
	}
	public boolean contains(T value){
	    return value == data;
	}
    
    }

    private Node root;

    //OUTER methods here are wrapper methods for the root
    public int getHeight(){
	if(root == null){
	//call the root's methods
	//check for empty first!
	    return 0;
	}
	else{return root.height();}
    }

    public void add(T value){
	if(root == null){
	    root = new Node();
	    root.setData(value);
	}
        else{root.add(value);}
    }
	       
    //check for empty before you do things with root.
        
    public String toString(){
	if(root == null){
	return "null";
	}
	else{
	    return root.toString();
	}
	//check for empty before you do things with root.
	
    }


    public boolean contains(T value){
	if(root == null){
	    return false;
	}
	else{
	    return root.contains(value);
	}
	//check for empty before you do things with root.
    }



    public static void main(String[]args){
	BSTree<Integer> t = new BSTree<Integer>();
	t.add(5);
	t.add(-12);
	t.add(2);
	
	//t.add(4);
	//t.add(-12);
	//t.add(9);
	System.out.println(t);
    }
}



    
	
