public class Recursion implements hw01{
    public String name(){
	return "Morgan,Jackson";
    }

    public double helper(double n, double guess){
	if(    Math.abs((((guess * guess) - n) / n)) < .00000000001){
	    return guess;
	}
	else{
	    guess = (n/ guess + guess) / 2;
	    return helper(n,guess);
	}
    }

    public double sqrt(double n){
	if(n < 0){
	    throw new IllegalArgumentException();
	}
	if(n == 0){
	    return n;
	}
	return helper(n, (n/2));
    }


}
