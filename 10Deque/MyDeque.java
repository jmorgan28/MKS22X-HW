public class MyDeque<T>{
    private Object[] data;
    private int start;
    private int end;
    private int size;

    public MyDeque(){ 
	data = new Object[10];
    }

    private void resize(){
	Object[] temp = new Object[data.length * 2];
	for(int i = 0; i < data.length; i ++){
	    temp[i] = data[i];
	}
	data = temp;
    }

    public void addFirst(T value){
	if(size == 0){
	    start = 0;
	    end = 0;}
	else{start ++;}
	data[start] = value;
	size ++;
    }

    public void addLast(T value){
	
    
    
}
