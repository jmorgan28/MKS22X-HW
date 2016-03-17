import java.util.*;
public class Sorts{
    static int debug = 0;
   public static void printArray(int[]data){
       String s = "";
       int i = 0;
       if (data.length ==0){
	   s += "[]";
       }
       while(i < data.length){
	   if(i == 0){
	       s +="[ " + data[i] + ",";
	   }
	   else if (i == data.length - 1){
	       s += " " + data[i] + "]";
	   }
	   else{s += " " + data[i] + ",";
	   }
	   i ++;
       }
       if (data.length == 1){
	   s = "[" + data[0] + "]";
       }
       System.out.println(s);
	   
   }
    //moves back until in place
   public static void insertionSort(int[]data){
       int i = 1;
       //int [] new = int[] data.length;
       while (i < data.length){
	   int w = i;
	   while(w > 0 && data[w] < data[w - 1]){
	       int r = data[w -1];
	       data[w - 1] = data[w];
	       data[w] = r;
	       w --;
	       
	   }
	   if (debug == 1){ 
	       printArray(data);}
	   i ++;
       }

	       
	   
      //your code here to make data re-order its elements
      //from least to greatest just like we did in class
      //same algorithm as the way you created your OrderedSuperArray
   }

    // loops through finds smallest swaps with left
    public static void selectionSort(int [] data){
	int q = 0;
	int ctr = 0;
	while(q < data.length){    
	int i = ctr;
	int n = data[i];
	int rem = 0;
	while(i < data.length){
	    if(n >= data[i]){
		n = data[i];
	        rem = i;}
	    if(i == data.length - 1){
		data[rem] = data[ctr];
		data[ctr] = n;
		ctr ++;}
	    i ++;
	}
	if (debug == 1){ 
	       printArray(data);}
	q ++;}
    }
    //go throgh and swap those not in order. then do it again
    public static void bubbleSort(int [] data){
	int i = 0;
	int swap = 1;
	while(i < data.length && swap != 0){
	    int k = 0;
	    swap = 0;
	    while(k < data.length - i - 1){
		if (data[k] > data[k + 1]){
			int rem = data[k];
			data[k] = data[k + 1];
			data[k + 1] = rem;
			swap ++;
		    }
		k ++;
	    }
	    if (debug == 1){ 
	       printArray(data);}
	    i ++;
	}
    }



     public static int[] fillRandom( int [] nums){
	 int t = (int)(Math.random() * 10000);
	 Random r = new Random(t);
	 int i = 0;
	 while(i < nums.length){
	     nums[i] = r.nextInt();
	     i ++;
	 }
	 return nums;
     }

    public static void swap(int [] ary, int i, int k){
	int rem = i;
	ary[i] = k;
	ary[k] = rem;
    }


     public static void merge(int[]data, int startA, int endA, int startB, int endB){
	int [] ary1 = new int[endA - startA + 1];
	//System.out.println(ary1.length);
	int [] ary2 = new int[endB - startB + 1];
	for(int i = 0; i <= endA - startA; i ++){
	    ary1[i] = data[i + startA];
	}
	for(int i = 0; i <= endB - startB; i ++){
	    ary2[i] = data[i + startB];
	    // System.out.println(ary2[i]);
	}
	int p = 0;
	int a1 = 0;
	int a2 = 0;
	int [] copy = new int[(endA - startA) + (endB - startB) + 2];
	while(p < copy.length){
	    if(a1 >= ary1.length && a2 < ary2.length){
		copy[p] = ary2[a2];
		p ++;
		a2 ++;
		
	    }
	    if(a2 >= ary2.length && a1 < ary1.length){
	
		copy[p] = ary1[a1];
		p ++;
		a1 ++;
		
		
	    }
	    if(a1 < ary1.length && a2 < ary2.length ){
		if(ary1[a1] <= ary2[a2]){
		    copy[p] = ary1[a1];
		    p ++;
		    a1 ++;
		
		    
		}
	    }
	    if(a1 < ary1.length && a2 < ary2.length ){
		if(ary2[a2] < ary1[a1]){
		    copy[p] = ary2[a2];
		    p ++;
		    a2 ++;
		
		    
		}
	    }
	}
	    for(int i = 0; i + startA <= endB; i ++){
		data[i + startA] = copy[i];
	    }
		
	    
    }
	    
	    
	    
	 
	
	public static String name(){
	 return "7,Morgan,Jackson";
     }

    


    public static void mergesort(int [] data){
	mergesortHelper(data, 0, data.length -1);
    }

    public static void mergesortHelper(int [] data, int start, int end){
	if( start + ((end - start) /2) > start){
	    mergesortHelper(data, start, start + ((end - start) /2)) ;
	    }
	if(start + ((end - start) /2) + 1 < end){
	    mergesortHelper(data, start + ((end - start) /2) + 1 , end);
	}
	merge(data,start,start + ((end - start) /2), start + ((end - start) /2) + 1 , end);
    }
	
	    
	


     public static void main(String[]args){
	 //int[] arrayName = {1 , 2,  9, 5, 0, 3, 32, -1232};
	 //int[] arrayName = {2, 1};
	 int[] arrayName = {-24, 32, 459, 459, -7, -7, 2323, 34, 392, 0, -203, 25, 3994, -53, 8, -232323232, 23};
	 Sorts.printArray( arrayName);
	 //System.out.println();
	 //Sorts.insertionSort( arrayName);
	 mergesort(arrayName);
	Sorts.printArray( arrayName);
	System.out.println(name());
	 //int [] ary = new int[100]; 
	 // Sorts.printArray(Sorts.fillRandom(ary));
	}
}
