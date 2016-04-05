public class MyDeque<T>{
    T[] data;
    private int start;
    private int end;
    private int size;

    public MyDeque(){ 
       data = (T[]) new Object[10];
    }

    private void resize(){
	T[] temp = (T[])new Object[data.length * 2];
	int k = 0;
	for(int i = 0; i < data.length; i ++){
	    if(start + i < data.length){
	    temp[i +1] = data[start + i];
	    }
	    else{
		temp[i + 1] = data[k];
		k ++;
	    }
		
	}
	data = temp;
	start = 1;
	end = start + size -1;
    }

    public void addFirst(T value){
	if(size == 0){
	    start = 4;
	    end = 4;}
	else{
	    if(start - 1 == end){
		resize();
	}
	    if(start == 0 && end < data.length -1){
	    start = data.length -1;
	    }else{
	    start --;}}
    
	data[start] = value;
	size ++;
    }


    public void addLast(T value){
	if(size == 0){
	    start = 4;
	    end = 4;}
	else{
	    if(end + 1 == start){
		resize();
	}
	    if(end  == data.length -1 && start > 0){
	    end = 0;
	    }else{
	    end ++;}}
    
	data[end] = value;
	size ++;
    }

    public void print(){
	System.out.print("[");
	for(int i = 0; i < data.length; i ++){
	    System.out.print(data[i] + ", ");
	}
	System.out.print("]");			 
    }

    

    //public void addLast(T value){
	
    public static void main(String[]args){
	MyDeque<Integer> d = new MyDeque<Integer>();
	d.addLast(3);
	d.addLast(4);
	d.addFirst(5);
	d.addLast(6);
	d.addLast(7);
	d.addLast(9);
	d.addFirst(10);
	d.addLast(11);
	d.addLast(12);
	d.addLast(13);
	d.addLast(14);
	//d.addLast(15);
	d.print();
    }
	
    
}
