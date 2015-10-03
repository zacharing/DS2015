
public class SList {
	private ListNode header;
	private int size = 0;
	
	
	public SList(){
		header = new ListNode();
		// only for circular list
		// header.next = header;
	}
	
	public int getCount(){
		return size;
	}
	
	public void delFirst(){
		if(header.next!=null)
			header.next = header.next.next;
	}
	
	public void addFirst(int x){
		ListNode tmp = new ListNode(x);
		tmp.next = header.next;
		header.next= tmp;
	}
	
	public void printList(){// print the whole list	
		ListNode runner = header;
		while(runner.next != null){
			System.out.print(""+runner.next.val + "\t" );
			runner = runner.next;
		}
		System.out.println();
	}
	
	public int getSum(){
		int total = 0;
		ListNode runner = header;
		while(runner.next != null){
			total+=runner.next.val;
			runner = runner.next;
		}
		return total;
	}
}
