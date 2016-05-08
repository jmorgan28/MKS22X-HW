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
       data = (T[]) new Comparable[array.length];
       for(int i = 0; i < array.length; i++){
	   data[i] = array[i];
       }
       size = array.length;
   }

   private void swap(int i, int j){
       T rem = data[j];
       data[j] = data[i];
       data[i] = rem;
   }

   //private void pushDown(int k)
   private void pushUp(int k){
       while(k/2 >0 && data[k /2].compareTo(data[k]) > 0){
	   swap(k,k/ 2);
	   k = k/2;
       }
   }
   //  private void heapify()
   //  public T delete()
   private void grow(T[] array){
       

   }
   
   public void add(T x){
       if(size == data.length - 1){
       grow(data);
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
	   for(int i = 0; i < data.length - 1; i ++){
	       s += data[i] + ", ";
	   }
	   if(data.length > 0){
	   s += data[data.length -1];
	   }
	   s += "]";
	   return s;
       }
       

   //do this last
       //public MyHeap(boolean isMax)
       //public MyHeap(T[] array, boolean isMax)

       public static void main(String[]args){
	   MyHeap<Integer> h = new MyHeap<Integer>();
	   for(int i = 0; i < 20; i ++){
	       h.add((int)(Math.random() * 1000000));
	   }
	   System.out.println(h);
       }

}
