public class ArrayStack {
	int CAPACITY = 1000;
	int size = 0;
	int[] A = new int[CAPACITY];
	public int getSize(){
		return size;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public void push(int x){
		try{
			A[size++]=x;
		}catch(Exception e){
			System.out.println("stack is fulll.  too many elements in Stack");
			e.printStackTrace();
		}
	}
	
	public int pop(){
		int result = 0;
		try{
			result = A[--size]; 
		}catch(Exception e){
			System.out.println("stack is already empty, cannot delete anymore");
			e.printStackTrace();
		}
		return result;
	}
	public int top(){
		int result = 0;
		try{
			result = A[size-1]; 
		}catch(Exception e){
			System.out.println("stack is already empty, cannot get more value");
			e.printStackTrace();
		}
		return result;		
	}
}
