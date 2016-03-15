public class MyLinkedList{
    private LNode start;
    private int size;

    //constructor

    public boolean add(int value){
	LNode store = start;
	while(store.getNext() != null){
	    store = start.getNext();
	}
	store.getNext().setValue(value);
	return true;
    }

    public String toString(){
	String s = "[";
	LNode store = start;
         while(store.getNext() != null){
	     s += start.getNext().getValue();
	     s += ", ";
	}
	s += store.getNext().getValue();
	s += "]";
	return s;
    }

	
	
	

    public class LNode{
	private int value;
	private LNode next; 
	
	public LNode(int numb){
	    value = numb;
	}

	public int getValue(){
	    return value;
	}

	public void setValue(int val){
	    value = val;
	}
	    
	public LNode getNext(){
	    return next;
	}
	
	public void setNext(LNode node){
	    next = node;
	}
    }
	    
	    
	    

}
