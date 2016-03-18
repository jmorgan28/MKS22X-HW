public class MyLinkedList{
    private LNode start;
    private int size;

    // public MyLinkedList(){
    //	start = null;
    //	size = 0;
    //	}
	

    public boolean add(int value){
	if(start == null){
	    start = new LNode(value);
	}
	else{    
	LNode k = new LNode(value);
	LNode store = start;
	while(store.getNext() != null){
	    store = store.getNext();
	    //System.out.println("bye");
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
	     //System.out.println(store.getValue());
	}
	s += store.getValue();
	s += " ]";
	return s;
    }

    public int size(){
	return size;
    }

    public int get(int index){
	int i = 0;
	LNode store = start;
	while(i < index){
	    store = store.getNext();
	    i++;
	}
	return store.getValue();
    }


    public int set(int index, int newValue){
	int i = 0;
	LNode store = start;
	while(i < index){
	    store = store.getNext();
	    i++;
	}
	int ret = store.getValue(); 
	store.setValue(newValue);
	return ret;
	
    }


    public int indexOf(int value){
	int i = 0;
	LNode store = start;
	while(store.getValue() != value){
	    store = store.getNext();
	    i ++;
	}
	return i;
    }


    public int remove(int index){
	if(index == 0){
	    int ret = start.getValue();
	    start = start.getNext();
	    size --;
	    return ret;
	}
	if(index == size -1){
	    LNode store = start;
	    for(int i = 0; i < size -2; i ++){
		store = store.getNext();
	    }
	    int ret = store.getNext().getValue();
	    LNode no = null;
	    store.setNext(no);
	    size --;
	    return ret;
	}
	else{
	    LNode store = start;
	    for(int i = 0; i < index -1; i++){
		store = store.getNext();
	    }
	    int ret = store.getNext().getValue();
	    store.setNext(store.getNext().getNext());
	    size --;
	    return ret;
	}
	    
	    
    }

    public boolean add(int index, int value){
	if(index == 0){
	    LNode zero = new LNode(value);
	    zero.setNext(start);
	    start = zero;
	    size ++;
	    return true;
	}
	if(index == size -1){
	    LNode store = start;
	    LNode part = new LNode(value);
	    for(int i = 0; i < size - 1; i ++){
		store = store.getNext();
	    }
	    store.setNext(part);
	    size ++;
	    return true;
	}
	else{
	    LNode store = start;
	    LNode part = new LNode(value);
	    for(int i = 0; i < index -1; i ++){
		store = store.getNext();
	    }
	    part.setNext(store.getNext());
	    store.setNext(part);
	    size ++;
	    return true;
	}
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
	k.add(0);
	k.add(15);
	System.out.println(k);
        k.add(4,2924848);
	k.add(5,48);
        System.out.println(k);
	System.out.println(k.size());
    }

    
	    
	    
	    

}
