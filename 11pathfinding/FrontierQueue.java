import java.util.*;
public class FrontierQueue<T> implements Frontier<T>{
    /***Make This Work This Weekend!***/

    /***You can use your classes or built in ones***/

    /***You can extend another class OR wrap around it***/

    MyQueue<T> q = new MyQueue<T>();

    public void add(T element){
	q.enqueue(element);
    }

    public T next(){
	if(!hasNext()){
	    throw new NoSuchElementException();
	}
	return q.dequeue();
    }

    public boolean hasNext(){
	return q.size() != 0;
    }


    
    public static void main(String[]args){
	FrontierQueue<Integer>  t = new FrontierQueue<Integer>();
	t.add(5);
	t.add(7);
	System.out.println(t.next());
	System.out.println(t.hasNext());
	System.out.println(t.next());
	System.out.println(t.hasNext());
	System.out.println(t.next());
    }
    


}



