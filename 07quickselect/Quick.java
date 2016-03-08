public class Quick{
    



    private static int partition(int[]data, int left, int right){
	int split = (int)(Math.random() * (right - left))+ left;
	System.out.println(split);
	//int [] store = new int[right - left];
	int store = data[split];
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
	//transfer = data[i -1];
	//	data[i - 1] = data[store];
	//	data[remain] = transfer;
		
	return split;
    }
	// slow version
	/*int more = 0;
	int less = 0;
	for(int i = 0; i + left < right; i ++){
	    if(data[i + left] < store){
		less ++;
	    }
	    if(data[i + left] > store){
		more ++;
	    }
	}
	System.out.println(more);
	System.out.println(less);
	
	int [] m = new int[more];
	int [] l = new int[less];
	int a = 0;
	int b = 0;
	for(int i = 0; i + left < right; i ++){
	    if(data[i + left] < store){
		l[a] = data[i + left];
		a ++;
	    }
	    if(data[i + left] > store){
		m[a] = data[i + left];
		b ++;
	    }
	}
	a = 0;
	b = 0;
	for(int i = 0; i + left < right; i ++){
	    if( a < l.length){
		data[i + left] = l[a];
		a ++;
	    }
	    if( b < m.length && a >= l.length){
		data[i + left] = m[b];
		b ++;
	    }
	}
       return split;
       }*/
    
	    
	    
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
	partition(data,0,data.length -1);
	print(data);
    }
	
	




}
