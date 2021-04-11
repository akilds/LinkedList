public class MyLinkedList {

	public INode head;
	public INode tail;

	public MyLinkedList()
	{
		this.head = null;
		this.tail = null;
	}

   //USE CASE 2 - Adding to LinkedList
	public void add(INode newNode)
	{
		if(this.tail==null)
		{
			this.tail = newNode;
		}
		if(this.head==null)
		{
			this.head = newNode;
		}
		else
		{
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}

   //USE CASE 3 - Adding to LinkedList from Tail
   public void append(INode myNode)
	{
		if(this.head==null)
		{
			this.head = myNode;
		}
		if(this.tail==null)
		{
			this.tail = myNode;
		}
		else
		{
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}

   //USE CASE 4 - Insert Node in between
   public void insert(INode myNode, INode newNode)
	{
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

   //USE CASE 5 - Deleting Node
   public INode pop()
	{
		INode tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}

   //USE CASE 6 - Delete from Last
   public INode popLast()
	{
		INode tempNode = head;
		while(!tempNode.getNext().equals(tail))
		{
			tempNode = tempNode.getNext();
		}
      INode myNode = tempNode.getNext();
		this.tail = tempNode;
		tempNode.setNext(null);
		return myNode;
	}

   //USE CASE 7 - Search a Node
   public boolean findNode(INode myNode)
	{
		int check = 0;
		INode tempNode = head;
		while(tempNode != null)
		{
			if(tempNode == myNode)
			{
				check = 1;
				break;
			}
			else
			{
				tempNode = tempNode.getNext();
			}
		}
		if(check==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

   //USE CASE 8 - Search and Add Node
   public void searchnAdd(INode myNode, INode newNode)
	{
		INode tempNode = head;
		while(tempNode != null)
		{
			if(tempNode == myNode)
			{
				insert(myNode,newNode);
				break;
			}
			else
			{
				tempNode = tempNode.getNext();
			}
		}
	}

   //USE CASE 9 - Delete Node in Between
   public INode searchnPop(INode newNode,INode myNode)
	{
		INode tempNode = head;
		while(tempNode != null)
		{
			if(tempNode == myNode)
			{
				myNode = myNode.getNext();
				newNode.setNext(myNode);
				break;
			}
			else
			{
				tempNode = tempNode.getNext();
			}
		}
		return myNode;
	}

   //USE CASE 10 - Sort LinkedList
   public void sortList()
   {
     INode current = head;
     INode index = null;
     int temp;
     if(this.head == null)
     {
       return;
     }
     else
     {
       while(current != null)
       {
         index = current.getNext();
         while(index != null)
         {
           if((Integer)current.getKey() > (Integer)index.getKey())
           {
             temp = (Integer)current.getKey();
             current.setKey(index.getKey());
             index.setKey(temp);
           }
           index = index.getNext();
          }
         current = current.getNext();  
        }
      }
   }

	public void printMyNodes()
	{
		StringBuffer myNodes = new StringBuffer("My Nodes : ");
		INode tempNode = head;
		while(tempNode.getNext() != null)
		{
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals(tail)) myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
}
