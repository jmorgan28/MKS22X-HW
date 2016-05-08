import java.util.*;
@SuppressWarnings("unchecked")
public class MyHeap<T extends Comparable<T>>
{
   private int size;
   private T[] data;
    private boolean max;

   public MyHeap(){
       data = (T[]) new Comparable[1];
       size = 0;
       max = false;
   }
   public MyHeap(T[] array){
       data = (T[]) new Comparable[array.length + 1];
       for(int i = 0; i < array.length; i++){
	   data[i + 1] = array[i];
       }
       size = array.length;
       max = false;
       heapify();
       
   }


    public MyHeap(boolean isMax){
	data = (T[]) new Comparable[1];
	size = 0;
	max = isMax;
    }
	
	
    public MyHeap(T[] array, boolean isMax){
	data = (T[]) new Comparable[array.length + 1];
       for(int i = 0; i < array.length; i++){
	   data[i + 1] = array[i];
       }
       size = array.length;
       max = isMax;
       heapify();
       
    }


    public boolean compare(T c1, T c2){
	if(max){
	    return (c1.compareTo(c2)) < 0;
	}
	else{return c1.compareTo(c2) > 0;}
    }
	   
  


   private void swap(int i, int j){
       T rem = data[j];
       data[j] = data[i];
       data[i] = rem;
   }

    private void pushDown(int k){
	while((k *2 < data.length && data[k * 2] != null &&  compare(data[k],data[k*2])) || (k * 2 + 1 < data.length && data[k * 2 + 1] != null &&  compare(data[k],data[k*2 +1]))){
	    if(data[k * 2] != null && compare(data[k],data[k*2]) && data[k * 2 +1] != null && compare(data[k],data[k*2 +1])){
		if(compare(data[k*2 +1],data[k*2])){
		    swap(k, k *2);
		    k = k *2;
		}
		else{
		    swap(k, k *2 +1);
		    k = k * 2 +1;
		}
	}
	    
	    
	    else{
		
		if(k *2 < data.length && data[k * 2] != null && compare(data[k],data[k*2])){
		swap(k *2,k);
		k = k * 2;
	    }
		
		if(k *2 + 1 < data.length && data[k * 2 +1] != null && compare(data[k],data[k*2 +1])){
		    swap(k * 2 + 1, k);
		    k = k * 2 +1;
		}
	    }
	}
	
    }
		
       
   private void pushUp(int k){
       while(k/2 >0 && compare(data[k/2],data[k])){
	   swap(k,k/ 2);
	   k = k/2;
       }
   }
    private void heapify(){
	for(int i = 1; i <= size; i ++){
	    pushUp(i);
	}
    }

    public T delete(){
	T ret = data[1];
	data[1] = data[size];
	data[size] = null;
	pushDown(1);
	size --;
	//System.out.println(size);
	//heapify();
	return ret;
    }
	
   
   
   public void add(T x){
       if(size == data.length - 1){
	   doubleSize();
	   //System.out.println("dsfs");
       }
       //System.out.println(this);
       data[size + 1] = x;
       if((size + 1)/ 2 > 0){ 
	   if(compare(data[(size +1) /2],x)){
       	   pushUp(size + 1);
             }
       }
       size ++;
	   
   }
       

       
    private void doubleSize(){
	T[] ret = (T[]) new Comparable[data.length * 2];
       for(int i = 0; i < data.length; i++){
	   ret[i] = data[i];
       }
       data =  ret;
       
    }
   //*/
       public String toString(){
	   String s = "[";
	   for(int i = 1; i < size; i ++){
	       s += data[i] + ", ";
	   }
	   if(size > 0){
	   s += data[size];
	   }
	   s += "]";
	   return s;
       }
       

   //do this last
       public static void main(String[]args){
	   Integer [] use = {3,2,1,4,5,0,7,6,19,79,-54,15,145,90,91,-1};
	   //Integer [] use = {};
	   MyHeap<Integer> h = new MyHeap<Integer>(use, true);
	   //MyHeap<Integer> h = new MyHeap<Integer>(true);
	   /*for(int i = 0; i < 10000000; i ++){
	   h.add((int)(Math.random() * 5000000));
	   //System.out.println(h);
	   }*/
	   //System.out.println(h);
	   for(int i = 0; i < use.length; i ++){
	       h.delete();
	       System.out.println(h);
	       }
	   //System.out.println(h);
       }

}
