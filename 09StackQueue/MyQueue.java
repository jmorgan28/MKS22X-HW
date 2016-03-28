import java.util.*;
public class MyQueue<T>{
    MyLinkedList Q = new MyLinkedList();
    /**
     * Adds the given item to the rear of the queue.
     */
    public void enqueue(T item){
	Q.add(item);
    }
    

    /**
     * Removes the front item from the queue and returns it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    public T dequeue(){
	if(Q.size() == 0){
	    throw new NoSuchElementException();
	}
	else{
	    return Q.remove(0);}
    }

    /**
     * Returns the front item from the queue without popping it.
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
     * Returns the number of items currently in the queue.
     */
    public int size(){
	return Q.size();
    }

    /**
     * Returns whether the queue is empty or not.
     */
    boolean isEmpty(){
	return Q.size() == 0;
    }
}
