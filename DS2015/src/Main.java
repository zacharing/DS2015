
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode header = new ListNode(); // imaging this is Tiger
		// insert at first 
		ListNode sarah = new ListNode(25);
		sarah.next = header.next;
		header.next= sarah;
		

		ListNode n1 = new ListNode(2);
		n1.next = header.next;
		header.next= n1;
		
		

		ListNode n2 = new ListNode(1);
		n2.next = header.next;
		header.next= n2;
		

		ListNode n3 = new ListNode(0);
		n3.next = header.next;
		header.next= n3;
		
		// print the whole list
		while(header.next != null){
			System.out.println(header.next.val);
			header = header.next;
		}
		
		
		// how to delete the first student
		if(header.next != null)
			header.next  = header.next.next;
		
	}

}