import java.util.*;

public class FrontierStack<T> implements Frontier<T>{
    /***Make This Work This Weekend!***/

    /***You can use your classes or built in ones***/

    /***You can extend another class OR wrap around it***/
    Stack<T> s = new Stack<T>();

    public void add(T element){
	s.push(element);
    }

    public T next(){
	if(!hasNext()){
	    throw new NoSuchElementException();
	}
	return s.pop();
    }

    public boolean hasNext(){
	return !s.empty();
    }


    public static void main(String[]args){
	FrontierStack<Integer>  t = new FrontierStack<Integer>();
	t.add(5);
	t.add(7);
	System.out.println(t.next());
	System.out.println(t.hasNext());
	System.out.println(t.next());
	System.out.println(t.hasNext());
	System.out.println(t.next());
    }

}
