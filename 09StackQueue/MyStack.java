import java.util.*;
public class MyStack<T>{
    MyLinkedList Q = new MyLinkedList();
       /**
     * Adds the given item to the top of the stack.
     */
    public void push(T item){
	Q.add(0);
    }

    /**
     * Removes the top item from the stack and returns it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    public T pop(){
	if(Q.size() == 0){
	    throw new NoSuchElementException();
	}
	else{
	    return Q.remove(0);}
    }

    /**
     * Returns the top item from the stack without popping it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    public T peek(){
		if(Q.size() == 0){
	    throw new NoSuchElementException();
	}
	else{
	    return Q.get(0);}
    }

    /**
     * Returns the number of items currently in the stack.
     */
    public int size(){
	return Q.size();
    }

    /**
     * Returns whether the stack is empty or not.
     */
    public boolean isEmpty(){
	return size() == 0;
    }
}
