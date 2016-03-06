public class Merge{

    int [] pizza = {1,2,3,4,5,-4,-3,-2,-1, 1, 232, 1244 ,22442,};

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
	merge(pizza,0,4,5,12);
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
