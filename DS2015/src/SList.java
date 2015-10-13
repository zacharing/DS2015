
public class SList {
	private SListNode header;
	private int size = 0;
	
	
	public SList(){
		header = new SListNode();
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
		SListNode tmp = new SListNode(x);
		tmp.next = header.next;
		header.next= tmp;
	}
	
	public void printList(){// print the whole list	
		SListNode runner = header;
		while(runner.next != null){
			System.out.print(""+runner.next.val + "\t" );
			runner = runner.next;
		}
		System.out.println();
	}
	
	public int getSum(){
		int total = 0;
		SListNode runner = header;
		while(runner.next != null){
			total+=runner.next.val;
			runner = runner.next;
		}
		return total;
	}
	
	
	public SList cloneList2(SList oldList){
		//The idea of this clone is to run the list and insert at the beginning twice
		// the first time, we create the new node and get the result in reverse order
		// the second time, we reverse that list
		SListNode tmpHeader = new SListNode();
		SListNode runner=oldList.header.next;
		// create and insert inversely 
		while(runner!=null){
			SListNode newNode = new SListNode(runner.val);
			// insert at beginning
			newNode.next = tmpHeader.next;
			tmpHeader.next = newNode;			
			runner = runner.next;			
		}
		// reverse this list
		SList result = new SList();
		while(tmpHeader.next!=null){
			// create a pointer to save this first node
			SListNode tmp = tmpHeader.next;	
			// detach this first node
			tmpHeader.next  = tmp.next;			
			// insert at beginning of the result list
			tmp.next = result.header.next;
			result.header.next = tmp;			
		}		
		return result;
	}

	public SList cloneList(SList oldList){
		SList result = new SList();
		SListNode runner=oldList.header.next;
		SListNode tail = result.header;

		// create and insert inversely 
		while(runner!=null){
			SListNode newNode = new SListNode(runner.val);
			// insert at beginning
			tail.next = newNode;
			tail = tail.next;
			runner = runner.next;				
		}		
		return result;	
	}
	
}
