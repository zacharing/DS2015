package ds2015;

public class Counter {
	private int count;
	public Counter(){};
	public Counter(int i){
		count = i;
	}
	
	public int get(){
		return count;
	}
	// increase by 1
	void increase(){
		count+=1;
	}
	void increase(int x){
		count+=x;
	}
	void decrease(){
		count-=1;
	}
	void decrease(int count){
		this.count-=count;
		System.out.println("count Value = "+count);
	
	}
	public void reset()
	{count = 0;}
}
