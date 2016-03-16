public class MyLinkedList{
    private LNode start;
    private int size;

    public MyLinkedList(){
	start = null;
	int size = -1;
	}
	

    public boolean add(int value){
	if(start == null){
	    start = new LNode(value);
	}
	else{    
	LNode k = new LNode(value);
	LNode store = start;
	while(store.getNext() != null){
	    store = start.getNext();
	    System.out.println("bye");
	}
	store.setNext(k);
	}
	size ++;
	return true;
    }

    public String toString(){
	if(start == null){
	    return "[ ]";
	}
	String s = "[ ";
	LNode store = start;
         while(store.getNext() != null){
	     s += store.getValue();
	     s += ", ";
	     store = store.getNext();
	     System.out.println(store.getValue());
	}
	s += store.getValue();
	s += " ]";
	return s;
    }

    

	
	
	

    public class LNode{
	private int value;
	private LNode next; 
	
	public LNode(int numb){
	    value = numb;
	    //next = new LNode(0);
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

    public static void main(String[]args){
	MyLinkedList k = new MyLinkedList();
	k.add(5);
	k.add(7);
	k.add(9);
	k.add(-2342);
	System.out.println(k);
    }

    
	    
	    
	    

}
