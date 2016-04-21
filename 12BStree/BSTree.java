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
	    data = value;
	}
	public String toString(){
	    return "" + data;
	}
	public boolean contains(T value){
	    return value == data;
	}
    
    }

    private Node root;

    //OUTER methods here are wrapper methods for the root
    public int getHeight(){
	//call the root's methods
	//check for empty first!
	return root.height();
    }

    public void add(T value){
	//check for empty before you do things with root.
    }
    public String toString(){
	//check for empty before you do things with root.
	return "";
    }
    public boolean contains(T value){
	//check for empty before you do things with root.
	return false;
    }
}



    
	
