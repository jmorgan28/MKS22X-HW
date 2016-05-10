import java.util.*;
public class RunningMedian{
    private MyHeap<Integer> smallValue, bigValue;
    private int median;
    
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
	    median = (smallValue.peek() + bigValue.peek()) / 2;
	}
	return median;
    }

    public void add(Integer x){
	if(x < median){
	    smallValue.add(x);
	}
	else{bigValue.add(x);}
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
	r.getMedian();

    }

}
