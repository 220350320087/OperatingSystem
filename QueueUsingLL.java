class QueueUsingLL{

	class Node{
		int data;
		Node next;
	
		public Node(ele){
			data=ele;
			next=null;
		}
	}

	private Node front;
	private Node rear;

	 QueueUsingLL(){
		front=null;
		rear=null;
	}

	public boolean underflow(){
		return ((front == null) && (rear == null));
	}

	public void enQueue(int ele){
		Node temp=new Node();

		if(underflow()){
			front=temp;
			rear=temp;
		}
		else{
			
			temp.data=ele;
			System.out.println("Inserted element : "+temp.data);
			rear.next=temp;
			rear=temp;
			
		}
	}
	public int deQueue(){
		Node temp= new Node();
		int x= -999;
		if(underflow()){
			System.out.println("Queue is empty");
		}
		else{
			x=front.data;
			front=front.next;
		}
		return x;
	}

	public void display(){
		Node tempnode=new Node();
		try{
			tempnode=front;
			while(true){

				System.out.print(tempnode.data+"->");
				tempnode=tempnode.next;
			}
		}
		catch(Exception e){
			System.out.println();
			e.printStackTrace();
		}
	}

	
public static void main(String[] args){
		
		QueueUsingLL q1=new QueueUsingLL();

		System.out.println("enQueue element : ");
		q1.enQueue(1);
		q1.enQueue(11);
		q1.enQueue(22);
		q1.enQueue(33);
		q1.enQueue(44);
		q1.enQueue(55);
		q1.enQueue(66);
		q1.enQueue(77);

		q1.display();

		//System.out.println("deQueued element : ");
		//System.out.println(q1.deQueue());
		//System.out.println(q1.deQueue());
		//System.out.println("Queue : ");
		//q1.display();
	}
}