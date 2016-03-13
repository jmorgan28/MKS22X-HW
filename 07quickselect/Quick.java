import java.util.Arrays;

public class Quick{
    
    private static int partitionOld(int[]data, int left, int right){
	int split = (int)(Math.random() * (right + 1 - left))+ left;
	swap(data,split, right);
	int rem = right;
	right --;
	//System.out.println(split);
	while(right != left){
	    if(data[left] > data[rem]){
		swap(data,left,right);
		right --;
	    }
	    else{left ++;}
	}
	
	if (data[right] > data[rem]){
	    swap(data, right, rem);
	    return right;
	}
	else{
	    swap(data, right + 1, rem);
	    return right + 1;
	}
	    
	}
	/*if(right - left == 1){
	    if(data[right] < data[left]){
		int r = data[right];
		data[right] = data[left];
		data[left] = r;
		//return left;
	    }
	    return left + (int)(Math.random()*2);
	}
	int split = (int)(Math.random() * (right - left + 1))+ left;
	int store = data[split];
	//System.out.println("the split is at " + split);
	data[split] = data[right];
	data[right] = store;
	int transfer = 0;
	int remain = right;
	int i =left;
	right --;
	while(right != left){
	  if(data[i] < store){
	      transfer = data[i];
	      data[i] = data[left];
	      data[left] = transfer;
	      left ++;
	      if(data[i] < store){
		  i ++;
	      }
	  
	  }
	  else{
		transfer = data[i];
		data[i] = data[right];
		data[right] = transfer;
		right --;
		if(data[i] > store){
		  i ++;
	      }
	
	  }
	  
	 
	}

	if (data[right] >= store){
	    transfer = data[right];
	    data[right] = store;
	    data[remain] = transfer;
	    return right;
	}
	else{
	    transfer = data[right + 1];
	    data[right + 1] = store;
	    data[remain] = transfer;
	    return right + 1;
	}
	
		
	}*/


    private static void swap(int [] data, int pos1, int pos2){
	int store = data[pos1];
	data[pos1] = data[pos2];
	data[pos2] = store;
    }
	

    private static int[] partition(int [] data, int left, int right){
	int [] ret = new int[2];
	int [] store = new int[right - left + 1];
	int split = (int)(Math.random() * (right + 1 - left))+ left;
	System.out.println(split);
	swap(data,split, right);
	int rem = right;
	right --;
	int l = 0;
	int r = store.length - 1;
	
	for(int i = 0; i < rem; i ++){	    
	    if(data[i] > data[rem]){
		store[r] = data[i];
		r --;
	    }
	    else{
		if(data[i] < data[rem]){
		    store[l] = data[i];
		    l ++;
		}
	
	    }
	   
	}
	print(store);
	
	return ret;
    }
	//if (data[right] > data[rem]){
	//  swap(data, right, rem);
	//  return right;
	//}
	//else{
	//  swap(data, right + 1, rem);
	//   return right + 1;
	//}
	    
    





    public static int quickselectOld(int[]data, int k){
	return quickselectOld(data,k,0,data.length -1);
    }

    private static int quickselectOld(int [] data,int k, int start, int end){
	int s = start;
	int e = end;
	if(s == e){
	    return data[s];
	    /*if(e < data.length - 1){
	        e ++;
	       }
	    else{
		if(s > 0){
		    s --;
		}
		}*/
	}
    
	//System.out.println("the start value is " + s);
	//System.out.println("the end value is " + e);
	//print(data);
	
	//System.out.println("the value gotten is " + rem);
	//System.out.println(k);
	
	else{
	    int rem = partitionOld(data,s,e);
	    if(rem == k){
	    return data[k];
	}
	    if( rem < k){
		//	if(start == data.length - 2){
		    //return quickselect(data,k,rem, end); 
		//}
		//else{
		return quickselectOld(data,k,rem + 1, e);
		//}
	    }
	    if(rem > k){
		//if(end == 1 && start != 0){
		    //return quickselect(data,k,start- 1,end);
		 //}
		//if(end == 1 && start == 0){
		    //return quickselect(data,k,start,end);
		 //}
		 //else{
		return quickselectOld(data,k,start,rem - 1);
		//}
	    }
	}
	return -1;					
    }
	
	    
	    
    	public static String name(){
	 return "7,Morgan,Jackson";
     }
    
    public static void print(int [] data){
	for(int r = 0; r < data.length; r ++){
	    System.out.print(data[r] + ",");
	}
    }

    public static void quickSortOld(int[]data){
	quickSortOld(data,0,data.length -1);
    }

    private static void quickSortOld(int[]data,int left,int right){
	if(left < right){
	    int p = partitionOld(data,left,right);
	    quickSortOld(data,p + 1, right);
	    //quickSortOld(data,left, p);
	    quickSortOld(data,left,p - 1);
	    //quickSortOld(data,p,right);
	}
    }

    //public static int[] makeAry(){
	//int ary = new int [4000000];
	//for(int i =0; i < ary.length; i ++){
	    //ary[i] = (Math.random() * (Integer.Max_Value));
	    //}
	//}
	    
	    
	    
	    
	




    public static void main(String[]args){
	int [] data = {2,1,4324,-1234,295,3,55,305838554,2030,-19394,0,293940,105,15,39230,9420304,-103399,343};
	//System.out.println(data.length - 10);
	//System.out.println(Quick.quickselectOld(data,5) + "---------------");
	//int[] d = new int [40000];
	//int[] c = new int [d.length];

	//for(int i = 0; i < d.length; i++){
	//d[i]= (int)(Math.random()*Integer.MAX_VALUE);
	//c[i]= d[i];
	//}
	//quickSortOld(d); //or even your old quicksort!!!
	//Arrays.sort(c);
	//System.out.println("Done: Sorted="+Arrays.equals(d,c));


	//System.out.println(partitionOld(data,0,data.length - 1));
	//Quick.quickSortOld(data);
	Quick.partition(data,0, data.length - 1);
	//print(data);
    }
	
	




}
