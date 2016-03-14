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
	

    private static void swap(int [] data, int pos1, int pos2){
	int store = data[pos1];
	data[pos1] = data[pos2];
	data[pos2] = store;
    }
	

    private static int[] partition(int [] data, int left, int right){
	int [] ret = new int[2];
	int st = left;
	int [] store = new int[right - left + 1];
	int split = (int)(Math.random() * (right + 1 - left))+ left;
	//System.out.println(split);
        int numb = data[split];
	swap(data,split, right);
	int rem = right;
	right --;
	int l = 0;
	int r = store.length - 1;
	for(int i = left; i <= right; i ++){	    
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
	right ++;
	int i = 0;
	while(left <= right){
	    while(i < store.length){
		if(i>= l && i <= r){
		    data[left] = numb;
		}
		else{data[left] = store[i];}
		i ++;
		left ++;
	    }
	}
		
	//System.out.println(r);
	//System.out.println(l);
	//print(store);
	ret[0] = l + st;
	ret[1] = r + st;
	return ret;
    }
	
    
    public static int quickselectOld(int[]data, int k){
	return quickselectOld(data,k,0,data.length -1);
    }

    private static int quickselectOld(int [] data,int k, int start, int end){
	int s = start;
	int e = end;
	if(s == e){
	    return data[s];
	}
	else{
	    int rem = partitionOld(data,s,e);
	    if(rem == k){
	    return data[k];
	}
	    if( rem < k){
		return quickselectOld(data,k,rem + 1, e);
	    }
	    if(rem > k){
		return quickselectOld(data,k,start,rem - 1);
		}
	    }
	
	return -1;					
    }



    /*   public static int quickselect(int[]data, int k){
	return quickselect(data,k,0,data.length -1);
    }

    private static int quickselect(int [] data,int k, int start, int end){
	int s = start;
	int e = end;
	if(s == e){
	    return data[s];
	}
	else{
	    int [] rem = partition(data,s,e);
	    int r0 = rem[0];
	    int r1 = rem[1];
	    print(data);
	    System.out.println();
	    System.out.println(r0);
	    System.out.println(r1);
	    if(r0 <= k && r1 >= k){
	    return data[k];
	}
	    if( r1 < k){
		return quickselect(data,k,r1 + 1, e);
	    }
	    if(r0 > k){
		return quickselect(data,k,start,r0 - 1);
		}
	    }
	
	
	return -1;					
	}*/

	    
	    
    	public static String name(){
	 return "7,Morgan,Jackson";
     }
    
    public static void print(int [] data){
	System.out.println();
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
	    quickSortOld(data,left,p - 1);
	   }
    }


    public static void quickSort(int[]data){
	quickSort(data,0,data.length -1);
    }

    private static void quickSort(int[]data,int left,int right){
	//System.out.println("left " + left);
	//System.out.println("right " + right);
	if(left < right){
	    int [] p = partition(data,left,right);
	    int p0 = p[0];
	    int p1 = p[1];
	    //System.out.println("p0 " + p0);
	    //System.out.println("p1 " + p1);
	    quickSort(data,p1 + 1, right);
	    quickSort(data,left,p0 - 1);
	   }
    }

	    
	    
	    
	    
	




    public static void main(String[]args){
	int [] data = {2,1,4324,-1234,7,295,3,7,7,55,305838554,2030,-19394,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,0,293940,105,15,39230,9420304,-103399,343};
	//System.out.println(data.length - 10);
	//System.out.println(Quick.quickselectOld(data,2) + "---------------");
	//System.out.println(Quick.quickselect(data,2) + "---------------");
	int[] d = new int [40000];
	int[] c = new int [d.length];

	for(int i = 0; i < d.length; i++){
	d[i]= (int)(Math.random()* 4);
	c[i]= d[i];
	}
	quickSort(d); //or even your old quicksort!!!
	Arrays.sort(c);
	System.out.println("Done: Sorted="+Arrays.equals(d,c));


	//System.out.println(partitionOld(data,0,data.length - 1));
	//Quick.quickSort(data);
	//int [] f = Quick.partition(data,data.length -4, data.length - 1);
	//System.out.println(f[0]);
	//System.out.println(f[1]);
	//System.out.println(data[f[1]]);
	//print(data);
    }
	
	




}
