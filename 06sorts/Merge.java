public class Merge{

    int [] pizza = {1,2,3,4,5,6,-3,-2,-1, 1,454, -32343, 2244, 0, 0 , 232, -2, 242420, -2324, 232, 1244};

    public void merge(int[]data, int startA, int endA, int startB, int endB){
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

    public void action(){
	mergesort(pizza);
    }

    public void print(){
	for(int i =0; i < pizza.length; i ++){
	    System.out.print(pizza[i] +",");
	}
    }

    public String name(){
	 return "Morgan,Jackson";
     }


    public void mergesort(int [] data){
	mergesortHelper(data, 0, data.length -1);
    }

    public  void mergesortHelper(int [] data, int start, int end){
	if( start + ((end - start) /2) > start){
	    mergesortHelper(data, start, start + ((end - start) /2)) ;
	    }
	if(start + ((end - start) /2) + 1 < end){
	    mergesortHelper(data, start + ((end - start) /2) + 1 , end);
	}
	merge(data,start,start + ((end - start) /2), start + ((end - start) /2) + 1 , end);
    }


    public static void main(String[]args){
	Merge m = new Merge();
	//Sorts m = new Sorts();
	//int[] arrayName = {-24, 32, 459, 459, -7, -7, 2323, 34, 392, 0, -203, 25, 3994, -53, 8, -232323232, 23};
	//Sorts.mergesort(arrayName);
	//Sorts.printArray( arrayName);
	m.action();
	m.print();
    }


}
