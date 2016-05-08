import java.util.*;
@SuppressWarnings("unchecked")
public class MyHeap<T extends Comparable<T>>
{
   private int size;
   private T[] data;

   public MyHeap(){
       data = (T[]) new Comparable[1];
       size = 0;
   }
   public MyHeap(T[] array){
       data = (T[]) new Comparable[array.length + 1];
       for(int i = 0; i < array.length; i++){
	   data[i + 1] = array[i];
       }
       size = array.length;
       heapify();
   }

   private void swap(int i, int j){
       T rem = data[j];
       data[j] = data[i];
       data[i] = rem;
   }

    private void pushDown(int k){
	//while(k * 2
    }    
   private void pushUp(int k){
       while(k/2 >0 && data[k /2].compareTo(data[k]) > 0){
	   swap(k,k/ 2);
	   k = k/2;
       }
   }
    private void heapify(){
	for(int i = 1; i <= size; i ++){
	    pushUp(i);
	}
    }
   //  public T delete()
   
   
   public void add(T x){
       if(size == data.length - 1){
	   doubleSize();
	   //System.out.println("dsfs");
       }
       //System.out.println(this);
       data[size + 1] = x;
       if((size + 1)/ 2 > 0){ 
       if(data[(size + 1) /2].compareTo(x) > 0){
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
	   if(data.length > 1){
	   s += data[size];
	   }
	   s += "]";
	   return s;
       }
       

   //do this last
   // public MyHeap(boolean isMax){
       //public MyHeap(T[] array, boolean isMax)

       public static void main(String[]args){
	   Integer [] use = {3,2,1,4,5,0,7,6,19,79,-54,15,145,90,91,-1,};
	   MyHeap<Integer> h = new MyHeap<Integer>(use);
	   /*for(int i = 0; i < 20; i ++){
	     h.add((int)(Math.random() * 1000000));
	       //System.out.println(h);
	       }*/
	   System.out.println(h);
       }

}
