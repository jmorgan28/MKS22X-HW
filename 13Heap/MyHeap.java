import java.util.*;
@SuppressWarnings("unchecked")
public class MyHeap<T extends Comparable<T>>
{
   private int size;
   private T[] data;

   public MyHeap(){
       data = (T[]) new Comparable[0];
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
       while(data[k /2].compareTo(data[k]) > 0){
	   swap(k,k/ 2);
       }
   }
   //  private void heapify()
   //  public T delete()
   private void grow(T[] array){
       T[] ret = (T[]) new Comparable[array.length + 1];
       for(int i = 0; i < array.length; i++){
	   data[i] = array[i];
       }
       data =  ret;

   }
   
   public void add(T x){
	   grow(data);
	   data[data.length-1] = x;
	   if(data[data.length /2].compareTo(x) > 0){
		   pushUp(data.length -1);
	       }
   }
       

       
	   //  private void doubleSize()
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
	   Integer [] temp = {3,4,6,2,7};
	   MyHeap<Integer> h = new MyHeap<Integer>(temp);
	   System.out.println(h);
       }

}
