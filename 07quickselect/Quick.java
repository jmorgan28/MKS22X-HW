public class Quick{
    



    private static int partition(int[]data, int left, int right){
	int split = (int)(Math.random() * (right - left))+ left;
	//System.out.println(split);
	//int [] store = new int[right - left];
	int store = data[split];
	//System.out.println(store);
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
	      //right --;
	  }
	  else{
		transfer = data[i];
		data[i] = data[right];
		data[right] = transfer;
		right --;
		if(data[i] > store){
		  i ++;
	      }
		//left ++;
	  }
	  
	 
	}

        //i = 0;
	//while(data[i] < store){
	    //i ++;
	    //}
	//transfer = data[i + 1];
	//data[i + 1] = store;
        //data[remain] = transfer;
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
	
	    
	    
    	public static String name(){
	 return "7,Morgan,Jackson";
     }
    
    public static void print(int [] data){
	for(int r = 0; r < data.length; r ++){
	    System.out.print(data[r] + ",");
	}
    }



    public static void main(String[]args){
	int [] data = {2,4324,-1234,295,3,55,62,305838554,2030,-19394,0,293940,105,15,39230,9420304,-103399};
	System.out.println(partition(data,0,data.length -1));
	print(data);
    }
	
	




}
