import java.util.*;
public class MyLinkedList<T> implements Iterable<T>{
    private LNode start;
    private int size;
    private LNode end;

    // public MyLinkedList(){
    //	start = null;
    //	size = 0;
    //	}

    public Iterator<T> iterator(){
	return new x();
    }

    public boolean add(T value){
	if(start == null){
	    start = new LNode(value);
	    end = start;
	}
	else{    
	LNode k = new LNode(value);
	end.setNext(k);
	end = end.getNext();
	//LNode store = start;
	//while(store.getNext() != null){
	//  store = store.getNext();
	    //System.out.println("bye");
	//}
	//store.setNext(k);
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

    public T get(int index){
	if(index < 0 || index >= size){
	    throw new IndexOutOfBoundsException();
	}
	int i = 0;
	LNode store = start;
	while(i < index){
	    store = store.getNext();
	    i++;
	}
	return store.getValue();
    }


    public T set(int index, T newValue){
	if(index < 0 || index >= size){
	    throw new IndexOutOfBoundsException();
	}
	int i = 0;
	LNode store = start;
	while(i < index){
	    store = store.getNext();
	    i++;
	}
	T ret = store.getValue(); 
	store.setValue(newValue);
	return ret;
	
    }


    public int indexOf(T value){
	int i = -1;
	int k = 0;
	LNode store = start;
	while(k < size && i == -1){
	    if(value.equals(store.getValue())){
		i = k;
	    }
	    store = store.getNext();
	    k ++;
	}
        return i;
    }


    public T remove(int index){
	if(index < 0 || index >= size){
	    throw new IndexOutOfBoundsException();
	}
	if(index == 0){
	    T ret = start.getValue();
	    start = start.getNext();
	    size --;
	    return ret;
	}
	if(index == size -1){
	    LNode store = start;
	    for(int i = 0; i < size -2; i ++){
		store = store.getNext();
	    }
	    LNode newEnd = store;
	    end = store;
	    T ret = store.getNext().getValue();
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
	    T ret = store.getNext().getValue();
	    store.setNext(store.getNext().getNext());
	    size --;
	    return ret;
	}
	    
	    
    }

    public boolean add(int index, T value){
	if(index < 0 || index > size){
	    throw new IndexOutOfBoundsException();
	}
	if(index == 0){
	    if(start == null){
	    start = new LNode(value);
	    end = start;
	    size ++;
	    return true;
	}
	    LNode zero = new LNode(value);
	    zero.setNext(start);
	    start = zero;
	    size ++;
	    return true;
	}
	if(index == size){
	    return add(value);
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

    
    	public String name(){
	 return "7,Morgan,Jackson";
     }
	
	
	

    public class LNode{
	private T value;
	private LNode next; 
	
	public LNode(T numb){
	    value = numb;
	    //next = new LNode(0);
	}

	public T getValue(){
	    return value;
	}

	public void setValue(T val){
	    value = val;
	}
	    
	public LNode getNext(){
	    return next;
	}
	
	public void setNext(LNode node){
	    next = node;
	}
    }

    public class x implements Iterator<T>{
	LNode current = start;
	public void remove(){
	    throw new UnsupportedOperationException();
	}
	public T next(){
	    if(! hasNext()){
		throw new NoSuchElementException();
	    }
	    T store = current.getValue();
	    current = current.getNext();
	    return store;
	}
	public boolean hasNext(){
	    return  current != null;
	}
    }

    public static void main(String[]args){
	MyLinkedList<String> k = new MyLinkedList<String>();
	
	k.add(0,"t");
	k.add("up");
	//k.add(0,7);
	k.add("that");
	k.add("who");
	k.add("how");
	k.add("never");
	//System.out.println(k);
	//System.out.println(k.get(2));
        //k.add(4,2924848);
	//k.add(5,48);
	k.add(4,"just no");
	System.out.println(k);
	k.remove(5);
	System.out.println(k);
	k.add("last");
	k.add("people");
	System.out.println(k.indexOf("just no"));
	System.out.println(k);
	//System.out.println(k.name());
	System.out.println(k.size());
        
	
    }

    
	    
	    
	    

}
