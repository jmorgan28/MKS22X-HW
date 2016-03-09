public class Quick{
    



    private static int partition(int[]data, int left, int right){
	if(right - left == 1){
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
	
		
    }


    public static int quickselect(int[]data, int k){
	return quickselect(data,k,0,data.length -1);
    }

    private static int quickselect(int [] data,int k, int start, int end){
	int s = start;
	int e = end;
	if(s == e){
	    if(e < data.length - 1){
	        e ++;
	       }
	    else{
		if(s > 0){
		    s --;
		}
	    }
	}
    
	//System.out.println("the start value is " + s);
	//System.out.println("the end value is " + e);
	//print(data);
	int rem = partition(data,s,e);
	//System.out.println("the value gotten is " + rem);
	//System.out.println(k);
	if(rem == k){
	    return data[k];
	}
	else{
	    
	    if( rem < k){
		//	if(start == data.length - 2){
		    //return quickselect(data,k,rem, end); 
		//}
		//else{
		return quickselect(data,k,rem + 1, e);
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
		return quickselect(data,k,start,rem - 1);
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

    public static void quickSort(int[]data){
	quickSort(data,0,data.length -1);
    }

    private static void quickSort(int[]data,int left,int right){
	if(left < right){
	    partition(data,left,right);
	    quickSort(data,left + 1, right);
	    quickSort(data,left,right - 1);
	}
    }
	    
	    
	    
	    
	




    public static void main(String[]args){
	int [] data = {2,1};//,4324,-1234,295,3,55,305838554,2030,-19394,0,293940,105,15,39230,9420304,-103399};
	quickSort(data);
	//System.out.println(data.length - 10);
	//System.out.println(Quick.quickselect(data,7) + "---------------");
	//System.out.println(partition(data,5,6));
	print(data);
    }
	
	




}
