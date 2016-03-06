public class Merge{

    int [] pizza = {1,2,3,4,5,-4,-3,-2,-1};

    public void merge(int[]data, int startA, int endA, int startB, int endB){
	int [] ary1 = new int[endA - startA + 1];
	int [] ary2 = new int[endB - startB + 1];
	for(int i = 0; i <= endA - startA; i ++){
	    ary1[i] = data[i + startA];
	}
	for(int i = 0; i <= endB - startB; i ++){
	    ary2[i] = data[i + startB];
	}
	int p = 0;
	int a1 = 0;
	int a2 = 0;
	int [] copy = new int[(endA - startA) + (endB - startB) + 1];
	while(p < copy.length){
	    if(a1 >= (endA - startA) +1 && a2 < (endB - startB) +1){
		copy[p] = ary2[a2];
		p ++;
		a2 ++;
	    }
	    if(a2 >= (endB - startB) + 1 && a1 < (endA - startA) +1){
		copy[p] = ary1[a1];
		p ++;
		a1 ++;
	    }
	    if(a1 < (endA - startA) +1 && a2 < (endB - startB) +1){
		if(ary1[a1] <= ary2[a2]){
		    copy[p] = ary1[a1];
		    p ++;
		    a1 ++;
		}
		if(ary2[a2] < ary1[a1]){
		    copy[p] = ary2[a2];
		    p ++;
		    a2 ++;
		}
	    }
	}
		



	/*while( (a1 < endA - startA) || (a2 < endB - startB)){
	    int test = 0;
	    System.out.println(a1 + ": a1");
	    System.out.println(a2 + "; a2");
	     if(a2 >= endB - startB && test == 0){
		copy[p] = ary1[a1];
		a1 ++;
		p ++;
		//test ++; 
	    }

	    if(a1 >= endA -startA){
		copy[p] = ary2[a2];
		a2 ++;
		p ++;
		//test ++;
	    }
	
	    if(test == 0){
	    if(ary1[a1] <= ary2[a2]){
		copy[p] = ary1[a1];
		p ++;
		a1 ++;
	    }
	    else{
		copy[p] = ary2[a2];
		p ++;
		a2 ++;
	    }
	    
	    }
	    }*/

	    for(int i = 0; i < copy.length; i ++){
		data[i] = copy[i];
	    }
		
	    
    }

    public void action(){
	merge(pizza,0,4,5,8);
    }

    public void print(){
	for(int i =0; i < pizza.length; i ++){
	    System.out.print(pizza[i] +",");
	}
    }


    public static void main(String[]args){
	Merge m = new Merge();
	m.action();
	m.print();
    }


}
