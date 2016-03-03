public class Merge{

    int [] pizza = {-24324,0,5,5,2302044,-293294042,394,3493,394349};

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
	while( (a1 < endA - startA ) || (a2 < endB - startB)){
	    int test = 0;
	    System.out.println(a1 + ": a1");
	    System.out.println(a2 + "; a2"); 
	    if(a1 >= endA -startA){
	    	copy[p] = ary2[a2];
	    	p ++;
	    	a2 ++;
	    	test ++;
	    }
	    if(a2 >=  endB -startB){
	    	copy[p] = ary1[a1];
	    	p ++;
	    	a1 ++;
	    	test ++;
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
	}

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
