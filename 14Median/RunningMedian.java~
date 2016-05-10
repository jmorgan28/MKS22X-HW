import java.util.*;
public class RunningMedian{
    private MyHeap<Integer> smallValue, bigValue;
    
    public RunningMedian(){
	smallValue = new MyHeap<Integer>(false);
	bigValue = new MyHeap<Integer>(true);
	
    }

    public double getMedian(){
	if (smallValue.getSize() == 0 && bigValue.getSize() == 0){
	    throw new NoSuchElementException();
	}
	return 2.0;
    }


    public static void main(String[]args){
	RunningMedian r = new RunningMedian();
	r.getMedian();

    }

}
