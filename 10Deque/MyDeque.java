import java.util.*;
public class MyDeque<T>{
    T[] data;
    private int start;
    private int end;
    private int size;

    public MyDeque(){ 
       data = (T[]) new Object[10];
    }

    private void resize(){
	T[] temp = (T[])new Object[data.length * 2];
	int k = 0;
	for(int i = 0; i < data.length; i ++){
	    if(start + i < data.length){
	    temp[i +1] = data[start + i];
	    }
	    else{
		temp[i + 1] = data[k];
		k ++;
	    }
		
	}
	data = temp;
	start = 1;
	end = start + size -1;
    }

    public void addFirst(T value){
	if(size == 0){
	    start = 4;
	    end = 4;}
	else{
	    if(start - 1 == end){
		resize();
	}
	    if(start == 0 && end < data.length -1){
	    start = data.length -1;
	    }else{
	    start --;}}
    
	data[start] = value;
	size ++;
    }


    public void addLast(T value){
	if(size == 0){
	    start = 4;
	    end = 4;}
	else{
	    if(end + 1 == start){
		resize();
	}
	    if(end  == data.length -1 && start > 0){
	    end = 0;
	    }else{
	    end ++;}}
    
	data[end] = value;
	size ++;
    }

    public T removeFirst(){
	if(size == 0){
	    throw new NoSuchElementException();
	}
	T ret = data[start];
	data[start] = null;
	start ++;
	size --;
	return ret;
    }

    public T removeLast(){
	if(size == 0){
	    throw new NoSuchElementException();
	}
	T ret = data[end];
	data[end] = null;
	end --;
	size --;
	return ret;
    }



    public T getFirst(){
	if(size == 0){
	    throw new NoSuchElementException();
	}
	return data[start];
    }

    public T getLast(){
	if(size == 0){
	    throw new NoSuchElementException();
	}
	return data[end];
    }

    public void print(){
	System.out.print("[");
	for(int i = 0; i < data.length; i ++){
	    System.out.print(data[i] + ", ");
	}
	System.out.print("]");			 
    }

    public String name(){
	 return "7,Morgan,Jackson";
     }
    

   
	
    public static void main(String[]args){
	MyDeque<Integer> d = new MyDeque<Integer>();
	d.addLast(3);
	d.addLast(4);
	d.addFirst(5);
	d.addLast(6);
	System.out.println(d.getLast());
	d.addLast(7);
	d.addLast(9);
	d.addFirst(10);
	d.addLast(11);
	d.addLast(12);
	System.out.println(d.getFirst());
	d.addLast(13);
	//d.addLast(14);
	//d.addLast(15);
	d.print();
    }
	
    
}
