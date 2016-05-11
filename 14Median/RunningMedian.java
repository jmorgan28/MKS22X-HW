import java.util.*;
public class RunningMedian{
    private MyHeap<Integer> smallValue, bigValue;
    private double median;
    
    public RunningMedian(){
	smallValue = new MyHeap<Integer>(false);
	bigValue = new MyHeap<Integer>(true);
	median = 0;
    }

    public double getMedian(){
	if (smallValue.getSize() == 0 && bigValue.getSize() == 0){
	    throw new NoSuchElementException();
	}
	if(bigValue.getSize() != smallValue.getSize()){
	    if(bigValue.getSize() > smallValue.getSize()){
		median = bigValue.peek();
	    }
	    else{
		median = smallValue.peek();
	    }
	}
	else{
	    median = (smallValue.peek() + bigValue.peek()) / 2.0;
	}
	return median;
    }

    public void add(Integer x){
	if(x < median){
	    bigValue.add(x);
	}
	else{smallValue.add(x);}
	while(Math.abs(bigValue.getSize() - smallValue.getSize()) > 1){
	    if(bigValue.getSize() > smallValue.getSize()){
		Integer f = bigValue.delete();
		smallValue.add(f);
	    }
	    else{
		Integer g = smallValue.delete();
		bigValue.add(g);
	    }
	}
	getMedian();
    }

    public static void main(String[]args){
	RunningMedian r = new RunningMedian();
	//r.add(-5);
	//r.add(5);
	//r.add(2);
	r.add(0); 
	r.add(1);
	r.add(2);
	r.add(3);
	r.add(4);
	r.add(5);
	r.add(6);
	r.add(7);
	r.add(8);
	r.add(9);
	r.add(10);
	System.out.println(r.getMedian());

    }

}
